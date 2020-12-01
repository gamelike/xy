package com.xinyuan.base.model.kfpt.kfyl.dbdth;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.helper.model.files.FilesHelper;
import com.xinyuan.model.po.Kf_dbdth;
import com.xinyuan.support.common.mvc.BaseController;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

/**
* 菜单：开发平台/开发用例/单表动态行控制类。
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/kfyl/dbdth")
public class DbdthController extends BaseController {

    @Autowired
    private DbdthService dbdthService;

    @Autowired
    private FilesHelper filesHelper;

    /**
    * 查看单表动态行[kf_dbdth]list
    *
    * @param request       请求信息
    * @param model         模型信息
    * @return 查看页面
    */
    @RequestMapping()
    public String index(HttpServletRequest request, Model model, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("queryVo") QueryVo queryVo) {
        List<Kf_dbdth> listKf_dbdth = this.dbdthService.getDbdthList(queryVo, splitPageInfo);
        model.addAttribute("listKf_dbdth", listKf_dbdth);
        model.addAttribute("sexData", Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("zxtidData",Constants_generator.insert_typeMap);
        model.addAttribute("hobbyData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("subjectData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        if (CollectionUtils.isNotEmpty(listKf_dbdth)) {
            Map<String, Object> hobbyxldxArrays = new HashMap<>();
                for (Kf_dbdth kf_dbdth : listKf_dbdth) {
                    if (kf_dbdth.getHobby() != null) {
                        hobbyxldxArrays.put(kf_dbdth.getId(), Arrays.asList(kf_dbdth.getHobby().split(",")));
                    }
                }
            model.addAttribute("hobbyxldxArrays", hobbyxldxArrays);
        }
        if (CollectionUtils.isNotEmpty(listKf_dbdth)) {
            Map<String, Object> subjectfxArrays = new HashMap<>();
            for (Kf_dbdth kf_dbdth : listKf_dbdth) {
                if (kf_dbdth.getSubject() != null) {
                    subjectfxArrays.put(kf_dbdth.getId(), Arrays.asList(kf_dbdth.getSubject().split(",")));
                }
            }
            model.addAttribute("subjectfxArrays", subjectfxArrays);
        }
        return "base/kfpt/kfyl/dbdth/dbdthindex";
    }

    /**
    * 保存组件展示
    *
    * @param request request
    * @param kf_dbdthListJson
    * @return 保存结果
    */
    @RequestMapping(value = "/saveKf_dbdth")
    @ResponseBody
    public ReturnValue saveKf_dbdth(HttpServletRequest request, String kf_dbdthListJson) throws IOException {
        if (StringUtils.isNotBlank(kf_dbdthListJson)) {
            ObjectMapper mapper = new ObjectMapper();
            JavaType javaTypeXbj_gyshfmxList = mapper.getTypeFactory().constructParametricType(ArrayList.class, Kf_dbdth.class);
            List<Kf_dbdth> kf_dbdthList = mapper.readValue(kf_dbdthListJson, javaTypeXbj_gyshfmxList);
            for (Kf_dbdth kf_dbdth : kf_dbdthList) {
                if(kf_dbdth.getId().startsWith("add_")){
                    filesHelper.upload(request, kf_dbdth.getId()+"fj");
                }else{
                    filesHelper.upload(request, "fj");
                }
            }
            this.dbdthService.saveKf_dbdth(request, this.getVisit(request), kf_dbdthList);
        }
        return ReturnValue.newSuccessInstance();
    }

    /**
    * 删除
    *
    * @param kf_dbdth
    * @return 删除结果
    */
    @RequestMapping(value = "/deleteKf_dbdth")
    @ResponseBody
    public ReturnValue deleteKf_dbdth(HttpServletRequest request, Kf_dbdth kf_dbdth) {
        dbdthService.delete(kf_dbdth);
        return ReturnValue.newSuccessInstance();
    }


}
