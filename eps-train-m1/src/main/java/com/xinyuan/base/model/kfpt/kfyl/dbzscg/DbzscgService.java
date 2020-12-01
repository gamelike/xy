package com.xinyuan.base.model.kfpt.kfyl.dbzscg;

import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Kf_dbzscg;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;

import java.util.List;

/**
* 菜单：开发平台/开发用例/单表增删查改接口
*
* @author xy
*/
public interface DbzscgService extends BaseService {

    /**
    * 获取单表增删查改[kf_dbzscg]查询list
    *
    * @return 单表增删查改[kf_dbzscg]
    * @author xy
    */
    List<Kf_dbzscg> getDbzscgList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo);

    /**
    * 保存单表增删查改[kf_dbzscg]信息
    *
    * @param kf_dbzscg 单表增删查改[kf_dbzscg]
    */
    void saveKf_dbzscg(Visit visit, Kf_dbzscg kf_dbzscg);


    /**
    * 单表增删查改[kf_dbzscg]排序
    *
    * @return 单表增删查改[kf_dbzscg]列表
    */
    List<Kf_dbzscg> getListKf_dbzscg();

    /**
    * 保存单表增删查改[kf_dbzscg]排序
    *
    * @param kf_dbzscg_ids 单表增删查改[kf_dbzscg]id
    */
    void saveSxh(String[] kf_dbzscg_ids);


    /**
    * 获取导出表单list
    * @return
    */
    List getListKf_dbzscgForexcel() throws Exception;

    /**
    * 发起审批流程
    * @param kf_dbzscg_id
    * @throws Exception
    */
    void startProcss(String kf_dbzscg_id, Visit visit) throws Exception;
}
