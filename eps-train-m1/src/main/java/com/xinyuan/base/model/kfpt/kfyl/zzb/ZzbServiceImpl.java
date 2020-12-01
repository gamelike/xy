package com.xinyuan.base.model.kfpt.kfyl.zzb;

import com.xinyuan.core.common.Constants;
import com.xinyuan.core.common.util.StringUtils;
import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.helper.common.PublicPageHelper;
import com.xinyuan.helper.common.mvc.ZxtxxUtil;
import com.xinyuan.helper.model.base.CodeHelper;
import com.xinyuan.helper.model.base.TxHelper;
import com.xinyuan.helper.model.wf.WorkFlowHelper;
import com.xinyuan.model.po.Kf_zzb_fb;
import com.xinyuan.model.po.Kf_zzb_zba;
import com.xinyuan.model.po.Kf_zzb_zbb;
import com.xinyuan.model.to.Gg_tx_t;
import com.xinyuan.model.to.Wf_zxr_t;
import com.xinyuan.model.vo.ProcessInstance;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;
import com.xinyuan.support.model.log.LogUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* 菜单：开发平台/开发用例/主子表接口实现类
*
* @author xy
*/
@Service
public class ZzbServiceImpl extends BaseServiceImpl implements ZzbService {

    @Autowired
    WorkFlowHelper workFlowHelper;

    @Autowired
    TxHelper txHelper;

    @Autowired
    CodeHelper codeHelper;

    /**
    * 主子表父表[kf_zzb_fb]list
    *
    * @return 主子表父表[kf_zzb_fb]
    * @author xy
    */
    @Override
    public List<Kf_zzb_fb> getZzbList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo) {
        queryVo.appendOrderBySql(" order by cjsj");
        queryVo.appendOrderBySql(",sxh");
        queryVo.appendOrderBySql(",sxh");
        queryVo.appendOrderBySql(",sxh");
        return this.selectSplit(new Kf_zzb_fb(), queryVo.generateAndSql(true).toString(), queryVo.getQueryMap(), splitPageInfo);
    }

    /**
    * 保存主子表父表[kf_zzb_fb]信息
    *
    * @param visit
    * @param kf_zzb_fb
    */
    @Override
    public void saveKf_zzb_fb(Visit visit, HttpServletRequest request,
                              List<Kf_zzb_zba> kf_zzb_zbaList,
                              List<Kf_zzb_zbb> kf_zzb_zbbList,
                              Kf_zzb_fb kf_zzb_fb) {
        Boolean isAddSxh = false;
        kf_zzb_fb.setCjsj(com.xinyuan.core.common.util.DateTimeUtil.now14());
        isAddSxh = true;
        this.save(kf_zzb_fb);
        for (Kf_zzb_zba kf_zzb_zba : kf_zzb_zbaList) {
            String[] qydxs_zl = request.getParameterValues(kf_zzb_zba.getId()+"more_qydx");
            String addqydx_zl = "";
            if(qydxs_zl != null && qydxs_zl.length>0){
                for(int i=0;i<qydxs_zl.length;i++){
                    if(i==0){
                        addqydx_zl = qydxs_zl[i];
                    }else{
                        addqydx_zl += ","+qydxs_zl[i];
                    }
                }
            }
            kf_zzb_zba.setQydx(addqydx_zl);
            if(kf_zzb_zba.getId()!=null){
                if(kf_zzb_zba.getId().startsWith("add_")){
                    kf_zzb_zba.setId(kf_zzb_zba.getId().substring(4));
                    kf_zzb_zba.setFid(kf_zzb_fb.getId());
                    this.insert(kf_zzb_zba);
                }else{
                    this.update(kf_zzb_zba);
                }
            }
        }
        for (Kf_zzb_zbb kf_zzb_zbb : kf_zzb_zbbList) {
            String[] qydxs_zl = request.getParameterValues(kf_zzb_zbb.getId()+"more_qydx");
            String addqydx_zl = "";
            if(qydxs_zl != null && qydxs_zl.length>0){
                for(int i=0;i<qydxs_zl.length;i++){
                    if(i==0){
                        addqydx_zl = qydxs_zl[i];
                    }else{
                        addqydx_zl += ","+qydxs_zl[i];
                    }
                }
            }
            kf_zzb_zbb.setQydx(addqydx_zl);
            if(kf_zzb_zbb.getId()!=null){
                if(kf_zzb_zbb.getId().startsWith("add_")){
                    kf_zzb_zbb.setId(kf_zzb_zbb.getId().substring(4));
                    kf_zzb_zbb.setFid(kf_zzb_fb.getId());
                    this.insert(kf_zzb_zbb);
                }else{
                    this.update(kf_zzb_zbb);
                }
            }
        }
    }


    /**
    * 获取子表kf_zzb_zba查询list
    *
    * @param kf_zzb_fb_id 主表id
    * @param queryVo 查询条件
    * @param splitPageInfo 分页信息
    * @return kf_zzb_zba
    * @author xy
    */
    @Override
    public List<Kf_zzb_zba> getKf_zzb_zbaList(String kf_zzb_fb_id, QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo) {
        queryVo.addEqualItem("fid",kf_zzb_fb_id);
        return this.selectSplit(new Kf_zzb_zba(), queryVo.generateAndSql(true).toString(), queryVo.getQueryMap(), splitPageInfo);
    }
    /**
    * 获取子表kf_zzb_zbb查询list
    *
    * @param kf_zzb_fb_id 主表id
    * @param queryVo 查询条件
    * @param splitPageInfo 分页信息
    * @return kf_zzb_zbb
    * @author xy
    */
    @Override
    public List<Kf_zzb_zbb> getKf_zzb_zbbList(String kf_zzb_fb_id, QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo) {
        queryVo.addEqualItem("fid",kf_zzb_fb_id);
        return this.selectSplit(new Kf_zzb_zbb(), queryVo.generateAndSql(true).toString(), queryVo.getQueryMap(), splitPageInfo);
    }

    /**
    * 发起流程
    * @param kf_zzb_fb
    * @param visit
    * @param xtwwdzColumn
    * @throws Exception
    */
    @Override
    public String startProcess(Kf_zzb_fb kf_zzb_fb, Visit visit, String xtwwdzColumn){
        String spUrl = null;
        ProcessInstance processInstance = new ProcessInstance(null, "lclb_xm_dbzsg", "${lcmc}", kf_zzb_fb.getId(), visit.getId(), visit.getJgxxDefault().getId(), null);
        List<Wf_zxr_t> wf_zxrByYwid = workFlowHelper.getWf_zxrByYwid(kf_zzb_fb.getId());
        if (true) {
            try {
                Gg_tx_t gg_tx_t = new Gg_tx_t();
                if (CollectionUtils.isNotEmpty(wf_zxrByYwid)) {
                    String wf_zxr_id = wf_zxrByYwid.get(0).getId();
                    gg_tx_t.setYwbh(wf_zxr_id);
                    txHelper.dealTx(gg_tx_t);
                    workFlowHelper.next(wf_zxr_id);
                } else {
                    String wf_zxr_id = workFlowHelper.start(processInstance);
                    gg_tx_t.setYwbh(wf_zxr_id);
                    txHelper.dealTx(gg_tx_t);
                    workFlowHelper.next(wf_zxr_id);
                }
                //当前任务人不是当前人，打开查看页面
            } catch (Exception e) {
                LogUtil.error(e);
            }
        }
        spUrl = ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_WF, xtwwdzColumn) + PublicPageHelper.WF_TASK_SP_SHOW + "/" + kf_zzb_fb.getId();
        return spUrl;
    }

    /**
    * 删除子表数据
    * @param kf_zzb_fb_id
    */
    @Override
    public void deleteKf_zzb_zba(String kf_zzb_fb_id){
        Map map = new HashMap();
        map.put("fid", kf_zzb_fb_id);
        this.delete(new Kf_zzb_zba()," where fid = :fid", map);
    }
    /**
    * 删除子表数据
    * @param kf_zzb_fb_id
    */
    @Override
    public void deleteKf_zzb_zbb(String kf_zzb_fb_id){
        Map map = new HashMap();
        map.put("fid", kf_zzb_fb_id);
        this.delete(new Kf_zzb_zbb()," where fid = :fid", map);
    }

    /**
    * 主子表父表[kf_zzb_fb]排序
    *
    * @return 主子表父表[kf_zzb_fb]列表
    */
    @Override
    public List<Kf_zzb_fb> getListKf_zzb_fb() {
        return this.select(new Kf_zzb_fb(), " order by sxh", new Object[]{});
    }

    /**
    * 保存主子表父表[kf_zzb_fb]排序
    *
    * @param kf_zzb_fb_ids 主子表父表[kf_zzb_fb]id
    */
    @Override
    public void saveSxh(String[] kf_zzb_fb_ids) {
        this.saveOrder("kf_zzb_fb", kf_zzb_fb_ids);
    }


    /**
    * 获取导出表单list
    * @return
    */
    @Override
    public List getListKf_zzb_fbForexcel() throws Exception{
        String sql = "select * from kf_zzb_fb ";
        Map params = new HashMap();
        List<Map<String,Object>> list = this.select(sql,params);
        List<Map<String,Object>> resultList=new ArrayList<>();
        if(list!=null&&list.size()>0){
            for(Map<String,Object> obj:list){
                String xlk_mc = Constants_generator.getinsert_typeMap(StringUtils.convertStr(obj.get("xlk")));
                obj.put("xlk",xlk_mc);
                String[] xlkdx_oldValues = StringUtils.convertStr(obj.get("xlkdx")).split(",");
                if(xlkdx_oldValues!=null && xlkdx_oldValues.length>0){
                    int m=1;
                    String xlkdx_mc = "";
                    for(String value : xlkdx_oldValues){
                        xlkdx_mc += Constants_generator.getGG_STUDENT_HOBBY_MAP(StringUtils.convertStr(value));
                        if(m!=xlkdx_oldValues.length){
                            xlkdx_mc+=",";
                        }
                        m++;
                    }
                    obj.put("xlkdx",xlkdx_mc);
                }
                String[] fxk_oldValues = StringUtils.convertStr(obj.get("fxk")).split(",");
                if(fxk_oldValues!=null && fxk_oldValues.length>0){
                    int m=1;
                    String fxk_mc = "";
                    for(String value : fxk_oldValues){
                        fxk_mc += Constants_generator.getGG_STUDENT_SUBJECT_MAP(StringUtils.convertStr(value));
                        if(m!=fxk_oldValues.length){
                            fxk_mc+=",";
                        }
                        m++;
                    }
                    obj.put("fxk",fxk_mc);
                }
                String qy_mc = codeHelper.getDmmcByDmbsAndLbbs(StringUtils.convertStr(obj.get("qy")),"XZQY");
                obj.put("qy",qy_mc);
                String[] qydx_oldValues = StringUtils.convertStr(obj.get("qydx")).split(",");
                if(qydx_oldValues!=null && qydx_oldValues.length>0){
                    int m=1;
                    String qydx_mc = "";
                    for(String value : qydx_oldValues){
                        qydx_mc += codeHelper.getDmmcByDmbsAndLbbs(value,"XZQY");
                        if(m!=qydx_oldValues.length){
                            qydx_mc+=",";
                        }
                        m++;
                    }
                    obj.put("qydx",qydx_mc);
                }
                resultList.add(obj);
            }
        }
        return resultList;
    }

    /**
    * 发起审批流程
    * @param kf_zzb_fb_id
    * @throws Exception
    */
    @Override
    public void startProcss(String kf_zzb_fb_id, Visit visit) throws Exception {
        Kf_zzb_fb kf_zzb_fb = dao.get(new Kf_zzb_fb(kf_zzb_fb_id));
        //修改状态为申请中
        //kf_zzb_fb.setZt(Constants.GG_TYBD_ZT_SQZ);
        dao.update(kf_zzb_fb);
        //发起审批流程
        ProcessInstance processInstance = new ProcessInstance(null, "lclb_xm_dbzsg", "流程名称", kf_zzb_fb.getId(), visit.getId(), visit.getJgxxDefault().getId(), null);
        workFlowHelper.startAndNext(processInstance);
    }
}
