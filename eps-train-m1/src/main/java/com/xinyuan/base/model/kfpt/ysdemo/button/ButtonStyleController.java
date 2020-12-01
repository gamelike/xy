package com.xinyuan.base.model.kfpt.ysdemo.button;

import com.xinyuan.support.common.mvc.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
* 菜单：按钮样式参考
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/ysdemo/button")
public class ButtonStyleController extends BaseController {

    /**
    * 查看系统按钮样式
    *
    * @param request       请求信息
    * @param model         模型信息
    * @return 查看页面
    */
    @RequestMapping()
    public String index(HttpServletRequest request, Model model) {
        return "base/kfpt/ysdemo/button/buttonList";
    }

    /**
     * 查看系统表格样式
     *
     * @param request       请求信息
     * @param model         模型信息
     * @return 查看页面
     */
    @RequestMapping(value = "/gridList")
    public String tableList(HttpServletRequest request, Model model) {
        return "base/kfpt/ysdemo/grid/gridList";
    }

    /**
     * 查看系统组件样式
     *
     * @param request       请求信息
     * @param model         模型信息
     * @return 查看页面
     */
    @RequestMapping(value = "/componentList")
    public String componentList(HttpServletRequest request, Model model) {
        Map map = new HashMap();
        map.put("1","内容1");
        map.put("2","内容2");
        map.put("3","内容3");
        model.addAttribute("sjMap",map);
        List list = new ArrayList();
        list.add("内容1");
        list.add("内容2");
        list.add("内容3");
        model.addAttribute("sjList",list);
        return "base/kfpt/ysdemo/component/componentList";
    }

    /**
     * 查询input_suggest组件下拉框的值
     *
     * @return 下拉框的值
     */
    @RequestMapping(value = "/tablecodeAjax")
    @ResponseBody
    public Map<String, Object> tablecodeAjax(HttpServletRequest request){
        List<Map<String, Object>> kbddList = new LinkedList<>();

        Map<String, Object> pbddMap = new HashMap<>();
        pbddMap.put("id","1");
        pbddMap.put("name","测试地址1");
        kbddList.add(pbddMap);


        /*pbddMap.put("2","xm_xmfb");
        pbddMap.put("3","xm_zbgys");
        pbddMap.put("4","zb_gysxyb");
        pbddMap.put("5","xm_xmpz");*/
   /*     for (Map.Entry<String, String> entry : pbddMap.entrySet()) {
            Map<String, Object> kbddMap = new HashMap<>();
            kbddMap.put(entry.getKey(), entry.getValue());
            kbddList.add(kbddMap);
        }*/
        Map map = new HashMap();
        map.put("value", kbddList);
        return map;
    }

}
