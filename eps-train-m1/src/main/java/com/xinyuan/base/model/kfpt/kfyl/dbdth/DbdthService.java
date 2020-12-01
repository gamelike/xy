package com.xinyuan.base.model.kfpt.kfyl.dbdth;

import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Kf_dbdth;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
* 菜单：开发平台/开发用例/单表动态行接口
*
* @author xy
*/
public interface DbdthService extends BaseService {

    /**
    * 获取单表动态行[kf_dbdth]查询list
    *
    * @return 单表动态行[kf_dbdth]
    * @author xy
    */
    List<Kf_dbdth> getDbdthList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo);


    /**
    * 保存单表动态行[kf_dbdth]信息
    *
    * @param visit
    * @param kf_dbdthList
    */
    void saveKf_dbdth(HttpServletRequest request, Visit visit, List<Kf_dbdth> kf_dbdthList);

}
