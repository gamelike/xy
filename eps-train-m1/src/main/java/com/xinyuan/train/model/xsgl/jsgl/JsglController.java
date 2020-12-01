package com.xinyuan.train.model.xsgl.jsgl;

import com.xinyuan.core.common.Constants;
import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.core.common.util.ValidationUtil;
import com.xinyuan.core.common.util.Validations;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.model.po.Kf_dbzscg;
import com.xinyuan.model.po.Teacher;
import com.xinyuan.model.po.Xs_teacher;
import com.xinyuan.support.common.mvc.BaseController;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * projectName: eps-train
 * author: 赵一帆
 * time: 2020/11/30 19:26
 * description:教师管理系统
 */
@Controller
@RequestMapping("train/xsgl/jsgl/zyf")
public class JsglController extends BaseController {
    @Autowired
    JsglService jsglService;

    @RequestMapping()
    public String index(Model model, @ModelAttribute("pageInfo") XinyuanDefaultSplitPageInfo pageInfo
            , @ModelAttribute("queryVo") QueryVo queryVo){
        List<Xs_teacher> listGL_jsgl = this.jsglService.queryListList(queryVo,pageInfo);
        model.addAttribute("listXs_teacher",listGL_jsgl);
        model.addAttribute("zgxlData", Constants_generator.XS_TEACHER_ZGXL);
        model.addAttribute("xbData",Constants_generator.GG_STUDENT_SEX_MAP);
        return "train/xsgl/jsgl/jsglindex";
    }

    @RequestMapping("/addXs_teacher")
    public String addXs_teacher(HttpServletRequest request, Model model, @ModelAttribute("queryVo") QueryVo queryVo){
        prepareCheckResubmit(request);
        Xs_teacher xs_teacher = new Xs_teacher();
        model.addAttribute("xs_teacher",xs_teacher);
        model.addAttribute("zgxlData", Constants_generator.XS_TEACHER_ZGXL);
        model.addAttribute("xbData",Constants_generator.GG_STUDENT_SEX_MAP);
        return "train/xsgl/jsgl/jsgledit";
    }

    @RequestMapping("/deleteXs_teacher")
    @ResponseBody
    public ReturnValue deleteXs_teacher(@ModelAttribute("xs_teacher") Xs_teacher xs_teacher){
        this.jsglService.delete(xs_teacher);
        return ReturnValue.newSuccessInstance();
    }

    @PostMapping(value = "/saveXs_teacher")
    @ResponseBody
    public ReturnValue submitXs_teacher(HttpServletRequest request, @ModelAttribute("xs_teacher") Xs_teacher xs_teacher){
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        } else {
            jsglService.save(xs_teacher);
            return ReturnValue.newSuccessInstance();
        }
    }

    @RequestMapping(value="/editXs_teacher")
    public String editKf_dbzscg(HttpServletRequest request, Model model, @ModelAttribute("xs_teacher") Xs_teacher xs_teacher) {
        this.prepareCheckResubmit(request);
        xs_teacher = this.jsglService.get(xs_teacher);
        model.addAttribute("xs_teacher", xs_teacher);
        model.addAttribute("zgxlData", Constants_generator.XS_TEACHER_ZGXL);
        model.addAttribute("xbData",Constants_generator.GG_STUDENT_SEX_MAP);
        return "train/xsgl/jsgl/jsgledit";
    }
}
