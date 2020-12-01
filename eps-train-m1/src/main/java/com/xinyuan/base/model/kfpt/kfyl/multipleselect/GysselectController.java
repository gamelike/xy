package com.xinyuan.base.model.kfpt.kfyl.multipleselect;

import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.model.po.Jc_ztbzt;
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

import java.util.List;

/**
* 菜单：开发平台/开发用例/公共选择页面控制类。
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/kfyl/multipleselect")
public class GysselectController extends BaseController {

    @Autowired
    private GysselectService gysselectService;

    /**
    * 选择供应商
    *
    * @param model         模型信息
    * @param queryVo       查询条件
    * @param splitPageInfo 分页信息
    * @return 供应商选择页面
    */
    @RequestMapping(value = "/selectGys")
    public String selectGys(Model model, @ModelAttribute("queryVo") QueryVo queryVo, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("paramdata") String paramdata, @ModelAttribute("jc_ztbzt_ids") String jc_ztbzt_ids, @ModelAttribute("yxtjcontext") String yxtjcontext, @ModelAttribute("yxgysxx") String yxgysxx) {
        List<Jc_ztbzt> listjc_ztbzt = gysselectService.getJc_ztbztList(queryVo, splitPageInfo,jc_ztbzt_ids);
        model.addAttribute("listJc_ztbzt", listjc_ztbzt);
        model.addAttribute("jc_ztbzt_ids", jc_ztbzt_ids);
        model.addAttribute("paramdata", paramdata);
        model.addAttribute("yxtjcontext", yxtjcontext);
        model.addAttribute("yxtjcontext", yxtjcontext);
        model.addAttribute("yxgysxx", yxgysxx);
        return "base/kfpt/kfyl/multipleselect/gysselectindex";
    }

    /**
    * 获取已保存信息
    *
    * @param jc_ztbzt_ids
    * @return ReturnValue
    */
    @RequestMapping(method = RequestMethod.POST, value = "/showJc_ztbzt")
    @ResponseBody
    public ReturnValue showJc_ztbzt(String jc_ztbzt_ids){
        ReturnValue returnValue = ReturnValue.newSuccessInstance();
        List<String> list = this.gysselectService.queryJc_ztbzt(jc_ztbzt_ids);
        returnValue.setData(list);
        return returnValue;
    }

}
