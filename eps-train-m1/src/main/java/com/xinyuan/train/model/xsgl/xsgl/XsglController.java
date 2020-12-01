package com.xinyuan.train.model.xsgl.xsgl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.core.common.util.ValidationUtil;
import com.xinyuan.core.common.util.Validations;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.helper.model.files.FilesHelper;
import com.xinyuan.model.po.Gg_tree_detail;
import com.xinyuan.model.po.Xs_grade;
import com.xinyuan.model.po.Xs_student;
import com.xinyuan.support.common.mvc.BaseController;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.apache.poi.ss.formula.functions.Mode;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * projectName: eps-train
 * author: 赵一帆
 * time: 2020/12/1 15:58
 * description:学生信息
 */
@Controller
@RequestMapping("train/xsgl/xsgl")
public class XsglController extends BaseController {
    @Autowired
    XsglService xsglService;
    @Autowired
    FilesHelper filesHelper;
    @RequestMapping()
    public String index(Model model, @ModelAttribute("pageInfo") XinyuanDefaultSplitPageInfo pageInfo
            , @ModelAttribute("queryVo") QueryVo queryVo) throws JsonProcessingException {
        // 获得树菜单
        String tree = xsglService.getTree();
        model.addAttribute("treeformTree",tree);
        List<Xs_student> xs_students = xsglService.queryListList(queryVo, pageInfo);
        model.addAttribute("listStudent_detail",xs_students);
        model.addAttribute("xbData", Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("njbh",queryVo.getEqualItemValue("njbh"));
        return "train/xsgl/xsgl/xsxxindex";
    }

    @RequestMapping(value = "/addStudent_detail")
    public String addStudent_detail(HttpServletRequest request, Model model, @ModelAttribute("queryVo") QueryVo queryVo, String njbh) {
        prepareCheckResubmit(request);
        Xs_student xs_student = new Xs_student();
        xs_student.setNjbh(njbh);
        model.addAttribute("xs_student", xs_student);
        model.addAttribute("xbData",Constants_generator.GG_STUDENT_SEX_MAP);
        return "train/xsgl/xsgl/xsxxedit";
    }

    @RequestMapping("/editStudent_detail")
    public String editStudent_detail(HttpServletRequest request, Model model,@ModelAttribute("xs_student")Xs_student xs_student,String njbh){
        this.prepareCheckResubmit(request);
        xs_student = this.xsglService.get(xs_student);
        model.addAttribute("xs_student",xs_student);
        model.addAttribute("njbh",njbh);
        model.addAttribute("xbData",Constants_generator.GG_STUDENT_SEX_MAP);
        return "train/xsgl/xsgl/xsxxedit";
    }

    @PostMapping("/saveXs_student_detail")
    @ResponseBody
    public ReturnValue saveXs_student_detail(HttpServletRequest request, @ModelAttribute("xs_student") Xs_student xs_student) {
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        } else {
                filesHelper.upload(request, "fj");
                xsglService.save(xs_student);
                return ReturnValue.newSuccessInstance();
        }
    }

    @RequestMapping("/deleteStudent_detail")
    @ResponseBody
    public ReturnValue deleteStudent_detail(@ModelAttribute("xs_student") Xs_student xs_student){
        xsglService.delete(xs_student);
        return ReturnValue.newSuccessInstance();
    }
}
