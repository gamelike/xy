package com.xinyuan.base.model.kfpt.kfyl.anzscg;

import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.core.common.util.ValidationUtil;
import com.xinyuan.core.common.util.Validations;
import com.xinyuan.model.po.Kf_anzscg;
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
import java.util.List;

/**
* 菜单：开发平台/开发用例/按钮增删查改控制类。
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/kfyl/anzscg")
public class AnzscgController extends BaseController {

    @Autowired
    private AnzscgService  anzscgService;

    /**
    * 查看按钮增删查改[kf_anzscg]list
    *
    * @param request       请求信息
    * @param model         模型信息
    * @param splitPageInfo 分页信息
    * @param queryVo       查询条件
    * @return 查看页面
    */
    @RequestMapping()
    public String index(HttpServletRequest request, Model model, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("queryVo") QueryVo queryVo) {
        List<Kf_anzscg> listKf_anzscg = this.anzscgService.getAnzscgList(queryVo, splitPageInfo);
        model.addAttribute("listKf_anzscg", listKf_anzscg);
        return "base/kfpt/kfyl/anzscg/anzscgindex";
    }

    /**
    * 增加按钮增删查改[kf_anzscg]
    *
    * @param model   模型信息
    * @param queryVo 查询信息
    * @return 页面地址
    */
    @RequestMapping(value = "/addKf_anzscg")
    public String addKf_anzscg(HttpServletRequest request, Model model, @ModelAttribute("queryVo") QueryVo queryVo) {
        prepareCheckResubmit(request);
        Kf_anzscg kf_anzscg = new Kf_anzscg();
        model.addAttribute("kf_anzscg", kf_anzscg);
        return "base/kfpt/kfyl/anzscg/anzscgedit";
    }

    @RequestMapping(value="/editKf_anzscg")
    public String editKf_anzscg(HttpServletRequest request, Model model, @ModelAttribute("kf_anzscg") Kf_anzscg kf_anzscg) {
        this.prepareCheckResubmit(request);
        kf_anzscg = this.anzscgService.get(kf_anzscg);
        model.addAttribute("kf_anzscg", kf_anzscg);
        return "base/kfpt/kfyl/anzscg/anzscgedit";
    }

    @RequestMapping(
    method = {RequestMethod.POST},
    value = {"/saveKf_anzscg"}
    )
    @ResponseBody
    public ReturnValue saveKf_anzscg(HttpServletRequest request, @ModelAttribute("kf_anzscg") Kf_anzscg kf_anzscg) {
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        } else {
            Validations.ValidateResult result = ValidationUtil.validate(request, "static/js/base/kfpt/kfyl/anzscg/anzscgvalidate.js");
            if (result.isValid()) {
                Boolean isAddSxh = false;
                anzscgService.saveKf_anzscg(kf_anzscg,isAddSxh);
                return ReturnValue.newSuccessInstance();
            } else {
                return ReturnValue.newCustomInstance(request);
            }
        }
    }

    /**
    * 删除接口
    *
    * @param kf_anzscg
    * @return 页面信息
    */
    @RequestMapping(value = "/deleteKf_anzscg")
    @ResponseBody
    public ReturnValue deleteKf_anzscg(HttpServletRequest request, @ModelAttribute("kf_anzscg") Kf_anzscg kf_anzscg) {
        anzscgService.delete(kf_anzscg);
        return ReturnValue.newSuccessInstance();
    }

}
