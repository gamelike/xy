package com.xinyuan.base.model.kfpt.kfyl.dbzscg;

import com.xinyuan.core.common.Constants;
import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.core.common.util.ValidationUtil;
import com.xinyuan.core.common.util.Validations;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.helper.model.base.CodeHelper;
import com.xinyuan.helper.model.files.FilesHelper;
import com.xinyuan.model.po.Kf_dbzscg;
import com.xinyuan.support.common.mvc.BaseController;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
* 菜单：开发平台/开发用例/单表增删查改控制类。
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/kfyl/dbzscg")
public class DbzscgController extends BaseController {

    @Autowired
    private DbzscgService dbzscgService;
    @Autowired
    private FilesHelper filesHelper;

    @Autowired
    private CodeHelper codeHelper;

    /**
    * 查看单表增删查改[kf_dbzscg]list
    *
    * @param request       请求信息
    * @param model         模型信息
    * @param splitPageInfo 分页信息
    * @param queryVo       查询条件
    * @return 查看页面
    */
    @RequestMapping()
    public String index(HttpServletRequest request, Model model, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("queryVo") QueryVo queryVo) {
        List<Kf_dbzscg> listKf_dbzscg = this.dbzscgService.getDbzscgList(queryVo, splitPageInfo);
        model.addAttribute("listKf_dbzscg", listKf_dbzscg);
        model.addAttribute("xlkData", Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        return "base/kfpt/kfyl/dbzscg/dbzscgindex";
    }

    /**
    * 增加单表增删查改[kf_dbzscg]
    *
    * @param model   模型信息
    * @param queryVo 查询信息
    * @return 页面地址
    */
    @RequestMapping(value = "/addKf_dbzscg")
    public String addKf_dbzscg(HttpServletRequest request, Model model, @ModelAttribute("queryVo") QueryVo queryVo) {
        prepareCheckResubmit(request);
        Kf_dbzscg kf_dbzscg = new Kf_dbzscg();
        model.addAttribute("kf_dbzscg", kf_dbzscg);
        model.addAttribute("zt_csh", Constants.GG_TYBD_ZT_CSH);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        return "base/kfpt/kfyl/dbzscg/dbzscgedit";
    }

    @RequestMapping(value="/editKf_dbzscg")
    public String editKf_dbzscg(HttpServletRequest request, Model model, @ModelAttribute("kf_dbzscg") Kf_dbzscg kf_dbzscg) {
        this.prepareCheckResubmit(request);
        kf_dbzscg = this.dbzscgService.get(kf_dbzscg);
        model.addAttribute("kf_dbzscg", kf_dbzscg);
        model.addAttribute("zt_csh", Constants.GG_TYBD_ZT_CSH);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        if(kf_dbzscg.getXlkdx()!=null){
            model.addAttribute("xlkdxArrays",Arrays.asList(kf_dbzscg.getXlkdx().split(",")));
        }
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        if(kf_dbzscg.getFxk()!=null){
            model.addAttribute("fxkArrays",Arrays.asList(kf_dbzscg.getFxk().split(",")));
        }
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        return "base/kfpt/kfyl/dbzscg/dbzscgedit";
    }

    @RequestMapping(value="/showKf_dbzscg")
    public String showKf_dbzscg(HttpServletRequest request, Model model, @ModelAttribute("kf_dbzscg") Kf_dbzscg kf_dbzscg) {
        this.prepareCheckResubmit(request);
        kf_dbzscg = this.dbzscgService.get(kf_dbzscg);
        model.addAttribute("kf_dbzscg", kf_dbzscg);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        if(kf_dbzscg.getXlkdx()!=null){
            model.addAttribute("xlkdxArrays",Arrays.asList(kf_dbzscg.getXlkdx().split(",")));
        }
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        if(kf_dbzscg.getFxk()!=null){
            model.addAttribute("fxkArrays",Arrays.asList(kf_dbzscg.getFxk().split(",")));
        }
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        return "base/kfpt/kfyl/dbzscg/dbzscgshow";
    }

    @RequestMapping(
    method = {RequestMethod.POST},
    value = {"/saveKf_dbzscg"}
    )
    @ResponseBody
    public ReturnValue saveKf_dbzscg(HttpServletRequest request, @ModelAttribute("kf_dbzscg") Kf_dbzscg kf_dbzscg) {
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        } else {
            Validations.ValidateResult result = ValidationUtil.validate(request, "static/js/base/kfpt/kfyl/dbzscg/dbzscgvalidate.js");
            if (result.isValid()) {
                filesHelper.upload(request, "tp");
                filesHelper.upload(request, "fj");
                dbzscgService.saveKf_dbzscg(this.getVisit(request),kf_dbzscg);
                return ReturnValue.newSuccessInstance();
            } else {
                return ReturnValue.newCustomInstance(request);
            }
        }
    }

    /**
    * 删除接口
    *
    * @param kf_dbzscg
    * @return 页面信息
    */
    @RequestMapping(value = "/deleteKf_dbzscg")
    @ResponseBody
    public ReturnValue deleteKf_dbzscg(HttpServletRequest request, @ModelAttribute("kf_dbzscg") Kf_dbzscg kf_dbzscg) {
        dbzscgService.delete(kf_dbzscg);
        return ReturnValue.newSuccessInstance();
    }

    /**
    * 单表增删查改[kf_dbzscg]下级排序
    *
    * @param request 请求信息
    * @param model   模型信息
    * @param kf_dbzscg   单表增删查改[kf_dbzscg]
    * @return 排序页面
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/sortKf_dbzscg")
    public String sortKf_dbzscg(HttpServletRequest request, Model model, @ModelAttribute("kf_dbzscg") Kf_dbzscg kf_dbzscg) throws Exception {
        //重复提交校验准备
        this.prepareCheckResubmit(request);
        model.addAttribute("kf_dbzscg", kf_dbzscg);
        List<Kf_dbzscg> list = dbzscgService.getListKf_dbzscg();
        model.addAttribute("listKf_dbzscg", list);
        return "base/kfpt/kfyl/dbzscg/dbzscgsort";
    }

    /**
    * 保存下级单表增删查改[kf_dbzscg]排序信息
    *
    * @param request   请求信息
    * @param kf_dbzscg_ids 单表增删查改[kf_dbzscg]id
    * @return 保存结果信息
    */
    @RequestMapping(method = RequestMethod.POST, value = "/saveSortKf_dbzscg")
    @ResponseBody
    public ReturnValue saveSortKf_dbzscg(HttpServletRequest request, String[] kf_dbzscg_ids) {
        //重复提交校验
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        }
        dbzscgService.saveSxh(kf_dbzscg_ids);
        return ReturnValue.newSuccessInstance();
    }


    @RequestMapping("/excel")
    public ResponseEntity<byte[]> excel(HttpServletRequest request, @ModelAttribute("queryVo") QueryVo queryVo, String exportColumns) throws Exception {
        List<Kf_dbzscg> listKf_dbzscg = this.dbzscgService.getListKf_dbzscgForexcel();
        return getExcelResponseEntity(request, exportColumns, listKf_dbzscg, "单表增删查改[kf_dbzscg]列表");
    }

    /**
    * 提交审核
    *
    * @param request        请求信息
    * @param kf_dbzscg
    * @return 提交结果
    */
    @RequestMapping(value = "/submitKf_dbzscg")
    @ResponseBody
    public ReturnValue submitKf_dbzscg(HttpServletRequest request, @ModelAttribute("kf_dbzscg") Kf_dbzscg kf_dbzscg) throws Exception {
        Validations.ValidateResult result = ValidationUtil.validate(request, "static/js/base/kfpt/kfyl/dbzscg/dbzscgvalidate.js");
        if (result.isValid()) {
            dbzscgService.saveKf_dbzscg(this.getVisit(request),kf_dbzscg);
            dbzscgService.startProcss(kf_dbzscg.getId(),this.getVisit(request));
            return ReturnValue.newSuccessInstance("提交成功");
        } else {
            return ReturnValue.newCustomInstance(request);
        }
    }

}
