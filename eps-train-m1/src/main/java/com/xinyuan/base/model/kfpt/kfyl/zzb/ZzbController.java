package com.xinyuan.base.model.kfpt.kfyl.zzb;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinyuan.core.common.Constants;
import com.xinyuan.core.common.ReturnValue;
import com.xinyuan.core.common.util.ValidationUtil;
import com.xinyuan.core.common.util.Validations;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.helper.model.base.CodeHelper;
import com.xinyuan.helper.model.files.FilesHelper;
import com.xinyuan.model.po.Kf_zzb_fb;
import com.xinyuan.model.po.Kf_zzb_zba;
import com.xinyuan.model.po.Kf_zzb_zbb;
import com.xinyuan.model.vo.Biz;
import com.xinyuan.support.common.mvc.BusinessBaseController;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
* 菜单：开发平台/开发用例/主子表控制类。
*
* @author xy
*/
@Controller
@RequestMapping("base/kfpt/kfyl/zzb")
public class ZzbController extends BusinessBaseController {

    @Autowired
    private ZzbService zzbService;
    @Autowired
    private FilesHelper filesHelper;

    @Autowired
    private CodeHelper codeHelper;

    /**
    * 查看主子表父表[kf_zzb_fb]list
    *
    * @param request       请求信息
    * @param model         模型信息
    * @param splitPageInfo 分页信息
    * @param queryVo       查询条件
    * @return 查看页面
    */
    @RequestMapping()
    public String index(HttpServletRequest request, Model model, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("queryVo") QueryVo queryVo, Biz biz) {
        List<Kf_zzb_fb> listKf_zzb_fb = this.zzbService.getZzbList(queryVo, splitPageInfo);
        model.addAttribute("listKf_zzb_fb", listKf_zzb_fb);
        model.addAttribute("biz", biz);
        model.addAttribute("xlkData", Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        return "base/kfpt/kfyl/zzb/zzbindex";
    }

    /**
    * 增加主子表父表[kf_zzb_fb]
    *
    * @param model   模型信息
    * @param queryVo 查询信息
    * @return 页面地址
    */
    @RequestMapping(value = "/addKf_zzb_fb")
    public String addKf_zzb_fb(HttpServletRequest request, Model model, @ModelAttribute("queryVo") QueryVo queryVo) {
        prepareCheckResubmit(request);
        Kf_zzb_fb kf_zzb_fb = new Kf_zzb_fb();
        model.addAttribute("kf_zzb_fb", kf_zzb_fb);
        model.addAttribute("zt_csh", Constants.GG_TYBD_ZT_CSH);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        return "base/kfpt/kfyl/zzb/zzbedit";
    }

    @RequestMapping(value="/editKf_zzb_fb")
    public String editKf_zzb_fb(HttpServletRequest request, Model model, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("queryVo") QueryVo queryVo, @ModelAttribute("kf_zzb_fb") Kf_zzb_fb kf_zzb_fb, Biz biz) {
        this.prepareCheckResubmit(request);
        if (kf_zzb_fb.getId() == null) {
            kf_zzb_fb.setId(biz.getBizid());
            kf_zzb_fb = zzbService.get(kf_zzb_fb);
        } else {
            kf_zzb_fb = zzbService.get(kf_zzb_fb);
        }
        model.addAttribute("kf_zzb_fb", kf_zzb_fb);
        model.addAttribute("zt_csh", Constants.GG_TYBD_ZT_CSH);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        if(kf_zzb_fb.getXlkdx()!=null){
            model.addAttribute("xlkdxArrays",Arrays.asList(kf_zzb_fb.getXlkdx().split(",")));
        }
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        if(kf_zzb_fb.getFxk()!=null){
            model.addAttribute("fxkArrays",Arrays.asList(kf_zzb_fb.getFxk().split(",")));
        }
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        //子表开始
        List<Kf_zzb_zba> listKf_zzb_zba = this.zzbService.getKf_zzb_zbaList(kf_zzb_fb.getId(), queryVo, splitPageInfo);
        model.addAttribute("listKf_zzb_zba", listKf_zzb_zba);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        if (CollectionUtils.isNotEmpty(listKf_zzb_zba)) {
            Map<String, Object> xlkdxxldxArrays = new HashMap<>();
                for (Kf_zzb_zba kf_zzb_zba : listKf_zzb_zba) {
                    if (kf_zzb_zba.getXlkdx() != null) {
                        xlkdxxldxArrays.put(kf_zzb_zba.getId(), Arrays.asList(kf_zzb_zba.getXlkdx().split(",")));
                    }
                }
            model.addAttribute("xlkdxxldxArrays", xlkdxxldxArrays);
        }
        if (CollectionUtils.isNotEmpty(listKf_zzb_zba)) {
            Map<String, Object> fxkfxArrays = new HashMap<>();
            for (Kf_zzb_zba kf_zzb_zba : listKf_zzb_zba) {
                if (kf_zzb_zba.getFxk() != null) {
                    fxkfxArrays.put(kf_zzb_zba.getId(), Arrays.asList(kf_zzb_zba.getFxk().split(",")));
                }
            }
            model.addAttribute("fxkfxArrays", fxkfxArrays);
        }
        List<Kf_zzb_zbb> listKf_zzb_zbb = this.zzbService.getKf_zzb_zbbList(kf_zzb_fb.getId(), queryVo, splitPageInfo);
        model.addAttribute("listKf_zzb_zbb", listKf_zzb_zbb);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        return "base/kfpt/kfyl/zzb/zzbedit";
    }

    @RequestMapping(value="/showKf_zzb_fb")
    public String showKf_zzb_fb(HttpServletRequest request, Model model, @ModelAttribute("splitPageInfo") XinyuanDefaultSplitPageInfo splitPageInfo, @ModelAttribute("queryVo") QueryVo queryVo, @ModelAttribute("kf_zzb_fb") Kf_zzb_fb kf_zzb_fb, Biz biz) {
        this.prepareCheckResubmit(request);
        if (kf_zzb_fb.getId() == null) {
            kf_zzb_fb.setId(biz.getBizid());
            kf_zzb_fb = zzbService.get(kf_zzb_fb);
        } else {
            kf_zzb_fb = zzbService.get(kf_zzb_fb);
        }
        model.addAttribute("kf_zzb_fb", kf_zzb_fb);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        if(kf_zzb_fb.getXlkdx()!=null){
            model.addAttribute("xlkdxArrays",Arrays.asList(kf_zzb_fb.getXlkdx().split(",")));
        }
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        if(kf_zzb_fb.getFxk()!=null){
            model.addAttribute("fxkArrays",Arrays.asList(kf_zzb_fb.getFxk().split(",")));
        }
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        //子表开始
        List<Kf_zzb_zba> listKf_zzb_zba = this.zzbService.getKf_zzb_zbaList(kf_zzb_fb.getId(), queryVo, splitPageInfo);
        model.addAttribute("listKf_zzb_zba", listKf_zzb_zba);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        List<Kf_zzb_zbb> listKf_zzb_zbb = this.zzbService.getKf_zzb_zbbList(kf_zzb_fb.getId(), queryVo, splitPageInfo);
        model.addAttribute("listKf_zzb_zbb", listKf_zzb_zbb);
        model.addAttribute("xlkData",Constants_generator.insert_typeMap);
        model.addAttribute("xlkdxData",Constants_generator.GG_STUDENT_HOBBY_MAP);
        model.addAttribute("dxkData",Constants_generator.GG_STUDENT_SEX_MAP);
        model.addAttribute("fxkData",Constants_generator.GG_STUDENT_SUBJECT_MAP);
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qyData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        model.addAttribute("qydxData",codeHelper.getMapGg_dmnrByLbbs("XZQY"));
        return "base/kfpt/kfyl/zzb/zzbshow";
    }

    @RequestMapping(
    method = {RequestMethod.POST},
    value = {"/saveKf_zzb_fb"}
    )
    @ResponseBody
    public ReturnValue saveKf_zzb_fb(HttpServletRequest request,
                                     String kf_zzb_zbaListJson,
                                     String kf_zzb_zbbListJson,
                                     @ModelAttribute("kf_zzb_fb") Kf_zzb_fb kf_zzb_fb) throws Exception{
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        } else {
            Validations.ValidateResult result = ValidationUtil.validate(request, "static/js/base/kfpt/kfyl/zzb/zzbvalidate.js");
            if (result.isValid()) {
                filesHelper.upload(request, "tp");
                filesHelper.upload(request, "fj");
                //保存子表开始
                List<Kf_zzb_zba> kf_zzb_zbaList = new ArrayList<Kf_zzb_zba>();
                List<Kf_zzb_zbb> kf_zzb_zbbList = new ArrayList<Kf_zzb_zbb>();
                if (StringUtils.isNotBlank(kf_zzb_zbaListJson)) {
                    ObjectMapper mapper = new ObjectMapper();
                    JavaType javaTypeXbj_gyshfmxList = mapper.getTypeFactory().constructParametricType(ArrayList.class, Kf_zzb_zba.class);
                    kf_zzb_zbaList = mapper.readValue(kf_zzb_zbaListJson, javaTypeXbj_gyshfmxList);
                    for (Kf_zzb_zba kf_zzb_zba : kf_zzb_zbaList) {
                    }

                }
                if (StringUtils.isNotBlank(kf_zzb_zbbListJson)) {
                    ObjectMapper mapper = new ObjectMapper();
                    JavaType javaTypeXbj_gyshfmxList = mapper.getTypeFactory().constructParametricType(ArrayList.class, Kf_zzb_zbb.class);
                    kf_zzb_zbbList = mapper.readValue(kf_zzb_zbbListJson, javaTypeXbj_gyshfmxList);
                    for (Kf_zzb_zbb kf_zzb_zbb : kf_zzb_zbbList) {
                        if(kf_zzb_zbb.getId().startsWith("add_")){
                            filesHelper.upload(request, kf_zzb_zbb.getId()+"tp");
                        }else{
                            filesHelper.upload(request, "tp");
                        }
                        if(kf_zzb_zbb.getId().startsWith("add_")){
                            filesHelper.upload(request, kf_zzb_zbb.getId()+"fj");
                        }else{
                            filesHelper.upload(request, "fj");
                        }
                    }

                }
            zzbService.saveKf_zzb_fb(this.getVisit(request),request,
            kf_zzb_zbaList,
            kf_zzb_zbbList,
            kf_zzb_fb);
                //保存子表结束
                return ReturnValue.newSuccessInstance();
            } else {
                return ReturnValue.newCustomInstance(request);
            }
        }
    }

    /**
    * 删除主表数据
    *
    * @param kf_zzb_fb
    * @return 页面信息
    */
    @RequestMapping(value = "/deleteKf_zzb_fb")
    @ResponseBody
    public ReturnValue deleteKf_zzb_fb(HttpServletRequest request, @ModelAttribute("kf_zzb_fb") Kf_zzb_fb kf_zzb_fb) {
        zzbService.delete(kf_zzb_fb);
        //级联删除子表数据
        zzbService.deleteKf_zzb_zba(kf_zzb_fb.getId());
        zzbService.deleteKf_zzb_zbb(kf_zzb_fb.getId());
        return ReturnValue.newSuccessInstance();
    }

    /**
    * 删除子表数据
    *
    * @param kf_zzb_zba
    * @return 删除结果
    */
    @RequestMapping(value = "/deleteKf_zzb_zba")
    @ResponseBody
    public ReturnValue deleteKf_zzb_zba(HttpServletRequest request, Kf_zzb_zba kf_zzb_zba) {
        zzbService.delete(kf_zzb_zba);
        return ReturnValue.newSuccessInstance();
    }
    /**
    * 删除子表数据
    *
    * @param kf_zzb_zbb
    * @return 删除结果
    */
    @RequestMapping(value = "/deleteKf_zzb_zbb")
    @ResponseBody
    public ReturnValue deleteKf_zzb_zbb(HttpServletRequest request, Kf_zzb_zbb kf_zzb_zbb) {
        zzbService.delete(kf_zzb_zbb);
        return ReturnValue.newSuccessInstance();
    }

    /**
    * 发起流程
    *
    * @param request    请求信息
    * @param kf_zzb_fb_id  主表id
    * @return 流程发起结果
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/startProcess")
    @ResponseBody
    public ReturnValue startProcess(HttpServletRequest request, String kf_zzb_fb_id) throws Exception {
        Kf_zzb_fb kf_zzb_fb = zzbService.get(new Kf_zzb_fb(kf_zzb_fb_id));
        try {
            String wfUrl = this.zzbService.startProcess(kf_zzb_fb, this.getVisit(request), this.getXtwwdzColumn(request));
            ReturnValue returnValue = ReturnValue.newSuccessInstance("提交成功,将转到审批查看页面！");
            returnValue.setData(wfUrl);
            return returnValue;
        } catch (Exception e) {
            return ReturnValue.newErrorInstance(e);
        }
    }

    /**
    * 主子表父表[kf_zzb_fb]排序
    *
    * @param request 请求信息
    * @param model   模型信息
    * @param kf_zzb_fb   主子表父表[kf_zzb_fb]
    * @return 排序页面
    * @throws Exception 异常信息
    */
    @RequestMapping(value = "/sortKf_zzb_fb")
    public String sortKf_zzb_fb(HttpServletRequest request, Model model, @ModelAttribute("kf_zzb_fb") Kf_zzb_fb kf_zzb_fb) throws Exception {
        //重复提交校验准备
        this.prepareCheckResubmit(request);
        model.addAttribute("kf_zzb_fb", kf_zzb_fb);
        List<Kf_zzb_fb> list = zzbService.getListKf_zzb_fb();
        model.addAttribute("listKf_zzb_fb", list);
        return "base/kfpt/kfyl/zzb/zzbsort";
    }

    /**
    * 保存主子表父表[kf_zzb_fb]排序信息
    *
    * @param request   请求信息
    * @param kf_zzb_fb_ids 主子表父表[kf_zzb_fb]id
    * @return 保存结果信息
    */
    @RequestMapping(method = RequestMethod.POST, value = "/saveSortKf_zzb_fb")
    @ResponseBody
    public ReturnValue saveSortKf_zzb_fb(HttpServletRequest request, String[] kf_zzb_fb_ids) {
        //重复提交校验
        if (this.checkResubmit(request)) {
            return ReturnValue.newResubmitInstance();
        }
        zzbService.saveSxh(kf_zzb_fb_ids);
        return ReturnValue.newSuccessInstance();
    }


    @RequestMapping("/excel")
    public ResponseEntity<byte[]> excel(HttpServletRequest request, @ModelAttribute("queryVo") QueryVo queryVo, String exportColumns) throws Exception {
        List<Kf_zzb_fb> listKf_zzb_fb = this.zzbService.getListKf_zzb_fbForexcel();
        return getExcelResponseEntity(request, exportColumns, listKf_zzb_fb, "主子表父表[kf_zzb_fb]列表");
    }

    /**
    * 提交审核
    *
    * @param request        请求信息
    * @param kf_zzb_fb
    * @return 提交结果
    */
    @RequestMapping(value = "/submitKf_zzb_fb")
    @ResponseBody
    public ReturnValue submitKf_zzb_fb(HttpServletRequest request, @ModelAttribute("kf_zzb_fb") Kf_zzb_fb kf_zzb_fb) throws Exception {
        Validations.ValidateResult result = ValidationUtil.validate(request, "static/js/base/kfpt/kfyl/zzb/zzbvalidate.js");
        if (result.isValid()) {
            zzbService.startProcss(kf_zzb_fb.getId(),this.getVisit(request));
            return ReturnValue.newSuccessInstance("提交成功");
        } else {
            return ReturnValue.newCustomInstance(request);
        }
    }
}
