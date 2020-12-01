package com.xinyuan.base.model.kfpt.kfyl.dbzscg;

import com.xinyuan.core.common.util.StringUtils;
import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.generator.common.Constants_generator;
import com.xinyuan.helper.model.base.CodeHelper;
import com.xinyuan.helper.model.wf.WorkFlowHelper;
import com.xinyuan.model.po.Kf_dbzscg;
import com.xinyuan.model.vo.ProcessInstance;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
* 菜单：开发平台/开发用例/单表增删查改接口实现类
*
* @author xy
*/
@Service
public class DbzscgServiceImpl extends BaseServiceImpl implements DbzscgService {

    @Autowired
    CodeHelper codeHelper;

    @Autowired
    WorkFlowHelper workFlowHelper;

    /**
    * 单表增删查改[kf_dbzscg]list
    *
    * @return 单表增删查改[kf_dbzscg]
    * @author xy
    */
    @Override
    public List<Kf_dbzscg> getDbzscgList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo) {
        return this.selectSplit(new Kf_dbzscg(), queryVo.generateAndSql(true).toString(), queryVo.getQueryMap(), splitPageInfo);
    }

    /**
    * 保存公共单表增删查改[kf_dbzscg]信息
    *
    * @param kf_dbzscg 单表增删查改[kf_dbzscg]信息
    */
    @Override
    public void saveKf_dbzscg(Visit visit, Kf_dbzscg kf_dbzscg) {
        kf_dbzscg.setCjsj(com.xinyuan.core.common.util.DateTimeUtil.now14());
        kf_dbzscg.setSxh(this.getMaxOrder("kf_dbzscg",null,null)+1);
        this.save(kf_dbzscg);
    }


    /**
    * 单表增删查改[kf_dbzscg]排序
    *
    * @return 单表增删查改[kf_dbzscg]列表
    */
    @Override
    public List<Kf_dbzscg> getListKf_dbzscg() {
        return this.select(new Kf_dbzscg(), " order by sxh", new Object[]{});
    }

    /**
    * 保存单表增删查改[kf_dbzscg]排序
    *
    * @param kf_dbzscg_ids 单表增删查改[kf_dbzscg]id
    */
    @Override
    public void saveSxh(String[] kf_dbzscg_ids) {
        this.saveOrder("kf_dbzscg", kf_dbzscg_ids);
    }


    /**
    * 获取导出表单list
    * @return
    */
    @Override
    public List getListKf_dbzscgForexcel() throws Exception{
        String sql = "select * from kf_dbzscg ";
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
                String dxk_mc = Constants_generator.getGG_STUDENT_SEX_MAP(StringUtils.convertInt(obj.get("dxk")));
                obj.put("dxk",dxk_mc);
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
    * @param kf_dbzscg_id
    * @throws Exception
    */
    @Override
    public void startProcss(String kf_dbzscg_id, Visit visit) throws Exception {
        Kf_dbzscg kf_dbzscg = dao.get(new Kf_dbzscg(kf_dbzscg_id));
        //修改状态为申请中
        //kf_dbzscg.setZt(Constants.GG_TYBD_ZT_SQZ);
        dao.update(kf_dbzscg);
        //发起审批流程
        ProcessInstance processInstance = new ProcessInstance(null, "lclb_xm_dbzsg", "流程名称", kf_dbzscg.getId(), visit.getId(), visit.getJgxxDefault().getId(), null);
        workFlowHelper.startAndNext(processInstance);
    }
}
