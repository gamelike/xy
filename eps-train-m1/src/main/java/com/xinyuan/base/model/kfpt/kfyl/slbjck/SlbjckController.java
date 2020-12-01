package com.xinyuan.base.model.kfpt.kfyl.slbjck;

import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.core.common.util.ValidationUtil;
import com.xinyuan.core.common.util.Validations;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.helper.model.base.CodeHelper;
import com.xinyuan.helper.model.files.FilesHelper;
import com.xinyuan.model.po.Kf_slbjck;
import com.xinyuan.support.common.mvc.BaseController;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
* 菜单：开发平台/开发用例/双列编辑查看控制类。
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/kfyl/slbjck")
public class SlbjckController extends BaseController {

    @Autowired
    private SlbjckService slbjckService;
    @Autowired
    private FilesHelper filesHelper;

    @Autowired
    private CodeHelper codeHelper;

    /**
    * 查看双列编辑查看list
    *
    * @param request       请求信息
    * @param model         模型信息
    * @param splitPageInfo 分页信息
    * @param queryVo       查询条件
    * @return 查看页面
    */
    @RequestMapping()
    public String index(HttpServletRequest request, Model model, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("queryVo") QueryVo queryVo) {
        List<Kf_slbjck> listKf_slbjck = this.slbjckService.getSlbjckList(queryVo, splitPageInfo);
        model.addAttribute("listKf_slbjck", listKf_slbjck);
        model.addAttribute("xlkData", Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        return "base/kfpt/kfyl/slbjck/slbjckindex";
    }

    /**
    * 增加双列编辑查看
    *
    * @param model   模型信息
    * @param queryVo 查询信息
    * @return 页面地址
    */
    @RequestMapping(value = "/addKf_slbjck")
    public String addKf_slbjck(HttpServletRequest request, Model model, @ModelAttribute("queryVo") QueryVo queryVo) {
        prepareCheckResubmit(request);
        Kf_slbjck kf_slbjck = new Kf_slbjck();
        model.addAttribute("kf_slbjck", kf_slbjck);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        return "base/kfpt/kfyl/slbjck/slbjckedit";
    }

    @RequestMapping(value="/editKf_slbjck")
    public String editKf_slbjck(HttpServletRequest request, Model model, @ModelAttribute("kf_slbjck") Kf_slbjck kf_slbjck) {
        this.prepareCheckResubmit(request);
        kf_slbjck = this.slbjckService.get(kf_slbjck);
        model.addAttribute("kf_slbjck", kf_slbjck);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        if(kf_slbjck.getXlkdx()!=null){
            model.addAttribute("xlkdxArrays",Arrays.asList(kf_slbjck.getXlkdx().split(",")));
        }
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        if(kf_slbjck.getFxk()!=null){
            model.addAttribute("fxkArrays",Arrays.asList(kf_slbjck.getFxk().split(",")));
        }
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        return "base/kfpt/kfyl/slbjck/slbjckedit";
    }

    @RequestMapping(value="/showKf_slbjck")
    public String showKf_slbjck(HttpServletRequest request, Model model, @ModelAttribute("kf_slbjck") Kf_slbjck kf_slbjck) {
        this.prepareCheckResubmit(request);
        kf_slbjck = this.slbjckService.get(kf_slbjck);
        model.addAttribute("kf_slbjck", kf_slbjck);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        if(kf_slbjck.getXlkdx()!=null){
            model.addAttribute("xlkdxArrays",Arrays.asList(kf_slbjck.getXlkdx().split(",")));
        }
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        if(kf_slbjck.getFxk()!=null){
            model.addAttribute("fxkArrays",Arrays.asList(kf_slbjck.getFxk().split(",")));
        }
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        return "base/kfpt/kfyl/slbjck/slbjckshow";
    }

    @RequestMapping(
    method = {RequestMethod.POST},
    value = {"/saveKf_slbjck"}
    )
    @ResponseBody
    public ReturnValue saveKf_slbjck(HttpServletRequest request, @ModelAttribute("kf_slbjck") Kf_slbjck kf_slbjck) {
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        } else {
            Validations.ValidateResult result = ValidationUtil.validate(request, "static/js/base/kfpt/kfyl/slbjck/slbjckvalidate.js");
            if (result.isValid()) {
                filesHelper.upload(request, "tp");
                filesHelper.upload(request, "fj");
                slbjckService.saveKf_slbjck(this.getVisit(request),kf_slbjck);
                return ReturnValue.newSuccessInstance();
            } else {
                return ReturnValue.newCustomInstance(request);
            }
        }
    }

    /**
    * 删除接口
    *
    * @param kf_slbjck
    * @return 页面信息
    */
    @RequestMapping(value = "/deleteKf_slbjck")
    @ResponseBody
    public ReturnValue deleteKf_slbjck(HttpServletRequest request, @ModelAttribute("kf_slbjck") Kf_slbjck kf_slbjck) {
        slbjckService.delete(kf_slbjck);
        return ReturnValue.newSuccessInstance();
    }

    /**
    * 双列编辑查看下级排序
    *
    * @param request 请求信息
    * @param model   模型信息
    * @param kf_slbjck   双列编辑查看
    * @return 排序页面
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/sortKf_slbjck")
    public String sortKf_slbjck(HttpServletRequest request, Model model, @ModelAttribute("kf_slbjck") Kf_slbjck kf_slbjck) throws Exception {
        //重复提交校验准备
        this.prepareCheckResubmit(request);
        model.addAttribute("kf_slbjck", kf_slbjck);
        List<Kf_slbjck> list = slbjckService.getListKf_slbjck();
        model.addAttribute("listKf_slbjck", list);
        return "base/kfpt/kfyl/slbjck/slbjcksort";
    }

    /**
    * 保存下级双列编辑查看排序信息
    *
    * @param request   请求信息
    * @param kf_slbjck_ids 双列编辑查看id
    * @return 保存结果信息
    */
    @RequestMapping(method = RequestMethod.POST, value = "/saveSortKf_slbjck")
    @ResponseBody
    public ReturnValue saveSortKf_slbjck(HttpServletRequest request, String[] kf_slbjck_ids) {
        //重复提交校验
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        }
        slbjckService.saveSxh(kf_slbjck_ids);
        return ReturnValue.newSuccessInstance();
    }

}
