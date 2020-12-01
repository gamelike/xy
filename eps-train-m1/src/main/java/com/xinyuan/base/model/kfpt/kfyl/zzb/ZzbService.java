package com.xinyuan.base.model.kfpt.kfyl.zzb;

import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Kf_zzb_fb;
import com.xinyuan.model.po.Kf_zzb_zba;
import com.xinyuan.model.po.Kf_zzb_zbb;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* 菜单：开发平台/开发用例/主子表接口
*
* @author xy
*/
public interface ZzbService extends BaseService {

    /**
    * 获取主子表父表[kf_zzb_fb]查询list
    *
    * @return 主子表父表[kf_zzb_fb]
    * @author xy
    */
    List<Kf_zzb_fb> getZzbList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo);

    /**
    * 保存主子表父表[kf_zzb_fb]信息
    *
    * @param visit
    * @param kf_zzb_fb
    */
    void saveKf_zzb_fb(Visit visit, HttpServletRequest request,
                       List<Kf_zzb_zba> kf_zzb_zbaList,
                       List<Kf_zzb_zbb> kf_zzb_zbbList,
                       Kf_zzb_fb kf_zzb_fb);


    /**
    * 获取子表kf_zzb_zba查询list
    *
    * @param kf_zzb_fb_id 主表id
    * @param queryVo 查询条件
    * @param splitPageInfo 分页信息
    * @return kf_zzb_zba
    * @author xy
    */
    List<Kf_zzb_zba> getKf_zzb_zbaList(String kf_zzb_fb_id, QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo);
    /**
    * 获取子表kf_zzb_zbb查询list
    *
    * @param kf_zzb_fb_id 主表id
    * @param queryVo 查询条件
    * @param splitPageInfo 分页信息
    * @return kf_zzb_zbb
    * @author xy
    */
    List<Kf_zzb_zbb> getKf_zzb_zbbList(String kf_zzb_fb_id, QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo);

    /**
    * 发起流程
    * @param kf_zzb_fb
    * @param visit
    * @param xtwwdzColumn
    * @throws Exception
    */
    String startProcess(Kf_zzb_fb kf_zzb_fb, Visit visit, String xtwwdzColumn);

    /**
    * 删除子表数据
    * @param kf_zzb_fb_id
    */
    void deleteKf_zzb_zba(String kf_zzb_fb_id);
    /**
    * 删除子表数据
    * @param kf_zzb_fb_id
    */
    void deleteKf_zzb_zbb(String kf_zzb_fb_id);

    /**
    * 主子表父表[kf_zzb_fb]排序
    *
    * @return 主子表父表[kf_zzb_fb]列表
    */
    List<Kf_zzb_fb> getListKf_zzb_fb();

    /**
    * 保存主子表父表[kf_zzb_fb]排序
    *
    * @param kf_zzb_fb_ids 主子表父表[kf_zzb_fb]id
    */
    void saveSxh(String[] kf_zzb_fb_ids);


    /**
    * 获取导出表单list
    * @return
    */
    List getListKf_zzb_fbForexcel() throws Exception;

    /**
    * 发起审批流程
    * @param kf_zzb_fb_id
    * @throws Exception
    */
    void startProcss(String kf_zzb_fb_id, Visit visit) throws Exception;
}
