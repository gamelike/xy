package com.xinyuan.base.model.kfpt.kfyl.treeform;

import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.core.common.util.ValidationUtil;
import com.xinyuan.core.common.util.Validations;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.helper.model.base.CodeHelper;
import com.xinyuan.helper.model.files.FilesHelper;
import com.xinyuan.model.po.Gg_tree_detail;
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
* 菜单：开发平台/开发用例/树+表单控制类。
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/kfyl/treeform")
public class TreeformController extends BaseController {

    @Autowired
    private TreeformService treeformService;
    @Autowired
    private FilesHelper filesHelper;
    @Autowired
    private CodeHelper codeHelper;

    /**
    * 查看树list
    *
    * @param request       请求信息
    * @param model         模型信息
    * @param splitPageInfo 分页信息
    * @param queryVo       查询条件
    * @return 查看页面
    */
    @RequestMapping()
    public String index(HttpServletRequest request, Model model, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("queryVo") QueryVo queryVo) throws Exception {
        //左侧树查询
        model.addAttribute("treeformTree", this.treeformService.getGg_tree());
        List<Gg_tree_detail> listGg_tree_detail = this.treeformService.getGg_tree_detailList(queryVo, splitPageInfo);
        model.addAttribute("listGg_tree_detail", listGg_tree_detail);
        model.addAttribute("dxkData", Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("gg_tree_id",queryVo.getEqualItemValue("treeid"));
        return "base/kfpt/kfyl/treeform/treeformindex";
    }

    /**
    * 增加gg_tree_detail
    *
    * @param model   模型信息
    * @param queryVo 查询信息
    * @return 页面地址
    */
    @RequestMapping(value = "/addGg_tree_detail")
    public String addGg_tree_detail(HttpServletRequest request, Model model, @ModelAttribute("queryVo") QueryVo queryVo, String treeid) {
        prepareCheckResubmit(request);
        Gg_tree_detail gg_tree_detail = new Gg_tree_detail();
        gg_tree_detail.setTreeid(treeid);
        model.addAttribute("gg_tree_detail", gg_tree_detail);
        model.addAttribute("gg_tree_id", treeid);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        return "base/kfpt/kfyl/treeform/treeformedit";
    }

    @RequestMapping(value="/editGg_tree_detail")
    public String editGg_tree_detail(HttpServletRequest request, Model model, @ModelAttribute("gg_tree_detail") Gg_tree_detail gg_tree_detail) {
        this.prepareCheckResubmit(request);
        gg_tree_detail = this.treeformService.get(gg_tree_detail);
        model.addAttribute("gg_tree_detail", gg_tree_detail);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        if(gg_tree_detail.getFxk()!=null){
            model.addAttribute("fxkArrays",Arrays.asList(gg_tree_detail.getFxk().split(",")));
        }
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        return "base/kfpt/kfyl/treeform/treeformedit";
    }

    @RequestMapping(value="/showGg_tree_detail")
    public String showGg_tree_detail(HttpServletRequest request, Model model, @ModelAttribute("gg_tree_detail") Gg_tree_detail gg_tree_detail) {
        this.prepareCheckResubmit(request);
        gg_tree_detail = this.treeformService.get(gg_tree_detail);
        model.addAttribute("gg_tree_detail", gg_tree_detail);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        if(gg_tree_detail.getFxk()!=null){
            model.addAttribute("fxkArrays",Arrays.asList(gg_tree_detail.getFxk().split(",")));
        }
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        return "base/kfpt/kfyl/treeform/treeformshow";
    }

    @RequestMapping(
    method = {RequestMethod.POST},
    value = {"/saveGg_tree_detail"}
    )
    @ResponseBody
    public ReturnValue saveGg_tree_detail(HttpServletRequest request, @ModelAttribute("gg_tree_detail") Gg_tree_detail gg_tree_detail) {
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        } else {
            Validations.ValidateResult result = ValidationUtil.validate(request, "static/js/base/kfpt/kfyl/treeform/treeformvalidate.js");
            if (result.isValid()) {
                filesHelper.upload(request, "fj");
                treeformService.saveGg_tree_detail(this.getVisit(request), gg_tree_detail);
                return ReturnValue.newSuccessInstance();
            } else {
                return ReturnValue.newCustomInstance(request);
            }
        }
    }

    /**
    * 删除接口
    *
    * @param gg_tree_detail
    * @return 页面信息
    */
    @RequestMapping(value = "/deleteGg_tree_detail")
    @ResponseBody
    public ReturnValue deleteGg_tree_detail(HttpServletRequest request, @ModelAttribute("gg_tree_detail") Gg_tree_detail gg_tree_detail) {
        treeformService.delete(gg_tree_detail);
        return ReturnValue.newSuccessInstance();
    }

    /**
    * gg_tree_detail下级排序
    *
    * @param request 请求信息
    * @param model   模型信息
    * @param gg_tree_detail   gg_tree_detail
    * @return 排序页面
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/sortGg_tree_detail")
    public String sortGg_tree_detail(HttpServletRequest request, Model model, @ModelAttribute("gg_tree_detail") Gg_tree_detail gg_tree_detail) throws Exception {
        //重复提交校验准备
        this.prepareCheckResubmit(request);
        model.addAttribute("gg_tree_detail", gg_tree_detail);
        List<Gg_tree_detail> list = treeformService.getListGg_tree_detail();
        model.addAttribute("listGg_tree_detail", list);
        return "base/kfpt/kfyl/treeform/treeformsort";
    }

    /**
    * 保存下级gg_tree_detail排序信息
    *
    * @param request   请求信息
    * @param gg_tree_detail_ids gg_tree_detailid
    * @return 保存结果信息
    */
    @RequestMapping(method = RequestMethod.POST, value = "/saveSortGg_tree_detail")
    @ResponseBody
    public ReturnValue saveSortGg_tree_detail(HttpServletRequest request, String[] gg_tree_detail_ids) {
        //重复提交校验
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        }
        treeformService.saveSxh(gg_tree_detail_ids);
        return ReturnValue.newSuccessInstance();
    }

}
