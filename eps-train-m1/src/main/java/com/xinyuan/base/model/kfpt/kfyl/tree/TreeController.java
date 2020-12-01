package com.xinyuan.base.model.kfpt.kfyl.tree;

import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.core.common.util.ValidationUtil;
import com.xinyuan.core.common.util.Validations;
import com.xinyuan.model.po.Kf_tree;
import com.xinyuan.support.common.mvc.BaseController;
import com.xinyuan.support.common.mvc.QueryVo;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* <pre>
 * 菜单：开发平台/开发用例/树 的控制类。
 * </pre>
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/kfyl/tree")
public class TreeController extends BaseController {

    @Autowired
    private TreeService treeService;


    /**
    * 获取树[kf_tree]tree
    *
    * @param request 请求信息
    * @param model   模型信息
    * @return 树[kf_tree]主页
    * @throws Exception 异常信息
    */
    @RequestMapping()
    public String index(HttpServletRequest request, Model model) throws Exception {
        String kf_treeTree = treeService.getKf_treeTree();
        model.addAttribute("kf_treeTree", kf_treeTree);
        return "base/kfpt/kfyl/tree/treeindex";
    }

    /**
    * 新增树[kf_tree]管理
    *
    * @param request 请求信息
    * @param model   模型信息
    * @param queryVo 查询条件
    * @return 页面信息
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/addKf_tree")
    public String addKf_tree(HttpServletRequest request, Model model, @ModelAttribute("queryVo") QueryVo queryVo) throws Exception {
        //重复提交校验准备
        this.prepareCheckResubmit(request);
        Kf_tree kf_tree = new Kf_tree();
        model.addAttribute("kf_tree", kf_tree);
        model.addAttribute("op", "add");
        return "base/kfpt/kfyl/tree/treeedit";
    }

    /**
    * 修改树[kf_tree]信息
    *
    * @param request 请求信息
    * @param model   模型信息
    * @param kf_tree   树[kf_tree]
    * @param queryVo 查询条件
    * @return 页面信息
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/editKf_tree")
    public String editKf_tree(HttpServletRequest request, Model model, @ModelAttribute("kf_tree") Kf_tree kf_tree, @ModelAttribute("queryVo") QueryVo queryVo) throws Exception {
        //重复提交校验准备
        this.prepareCheckResubmit(request);
        if (StringUtils.isNotBlank(kf_tree.getId())) {
            kf_tree = treeService.get(kf_tree);
        }
        if (kf_tree.getPid() != null) {
            Kf_tree kf_tree_pid = treeService.get(new Kf_tree(kf_tree.getPid()));
            model.addAttribute("kf_tree_pid", kf_tree_pid);
        }
        model.addAttribute("kf_tree", kf_tree);
        model.addAttribute("op", "xjadd");
        return "base/kfpt/kfyl/tree/treeedit";
    }

    /**
    * 树[kf_tree]下级排序
    *
    * @param request 请求信息
    * @param model   模型信息
    * @param kf_tree   树[kf_tree]
    * @return 排序页面
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/sortKf_tree")
    public String sortKf_tree(HttpServletRequest request, Model model, @ModelAttribute("kf_tree") Kf_tree kf_tree) throws Exception {
        //重复提交校验准备
        this.prepareCheckResubmit(request);
        model.addAttribute("kf_tree", kf_tree);
        List<Kf_tree> list = treeService.getListKf_tree(kf_tree);
        model.addAttribute("listKf_tree", list);
        return "base/kfpt/kfyl/tree/treesort";
    }

    /**
    * 保存下级树[kf_tree]排序信息
    *
    * @param request   请求信息
    * @param kf_tree_ids 树[kf_tree]id
    * @return 保存结果信息
    */
    @RequestMapping(method = RequestMethod.POST, value = "/saveSortKf_tree")
    @ResponseBody
    public ReturnValue saveSortKf_tree(HttpServletRequest request, String[] kf_tree_ids) {
        //重复提交校验
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        }
        treeService.saveSxh(kf_tree_ids);
        return ReturnValue.newSuccessInstance();
    }

    /**
    * 保存菜单信息
    *
    * @param request 请求信息
    * @param kf_tree   树[kf_tree]信息
    * @return 保存结果信息
    */
    @RequestMapping(method = RequestMethod.POST, value = "/saveKf_tree")
    @ResponseBody
    public ReturnValue saveKf_tree(HttpServletRequest request, @ModelAttribute("kf_tree") Kf_tree kf_tree) {
        //重复提交校验
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        }
        Validations.ValidateResult result = ValidationUtil.validate(request, "static/js/base/kfpt/kfyl/tree/treevalidate.js");
        if (result.isValid()) {
            Boolean isAdd = kf_tree.isEmptyId();
            Boolean isAddSxh = false;
            isAddSxh = true;
            treeService.saveKf_tree(kf_tree,isAddSxh);
            return ReturnValue.newSuccessInstance();
        } else {
            log.info(ToStringBuilder.reflectionToString(result, ToStringStyle.DEFAULT_STYLE));
            return ReturnValue.newCustomInstance(request);
        }
    }
    /**
    * 删除树[kf_tree]信息
    *
    * @param kf_tree 树[kf_tree]信息
    * @return 删除结果信息
    */
    @RequestMapping(method = RequestMethod.POST, value = "/deleteKf_tree")
    @ResponseBody
    public ReturnValue deleteKf_tree(HttpServletRequest request, @ModelAttribute("kf_tree") Kf_tree kf_tree) {
        treeService.delete(kf_tree);
        return ReturnValue.newSuccessInstance();
    }

    /**
    * 树[kf_tree]根节点排序
    *
    * @return 排序页面
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/sortKf_treeRoot")
    public String sortKf_treeRoot(HttpServletRequest request, Model model) throws Exception {
        //重复提交校验准备
        this.prepareCheckResubmit(request);
        List<Kf_tree> list = treeService.getListKf_treeRoot();
        model.addAttribute("listKf_tree", list);
        return "base/kfpt/kfyl/tree/treesort";
    }
}
