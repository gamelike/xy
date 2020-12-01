package com.xinyuan.base.model.kfpt.kfyl.anzscg;

import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Kf_anzscg;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;

import java.util.List;

/**
* 菜单：开发平台/开发用例/按钮增删查改接口
*
* @author xy
*/
public interface AnzscgService extends BaseService {

    /**
    * 获取按钮增删查改[kf_anzscg]查询list
    *
    * @return 按钮增删查改[kf_anzscg]
    * @author xy
    */
    List<Kf_anzscg> getAnzscgList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo);

    /**
    * 保存按钮增删查改[kf_anzscg]信息
    *
    * @param kf_anzscg 按钮增删查改[kf_anzscg]
    */
    void saveKf_anzscg(Kf_anzscg kf_anzscg, boolean isAddSxh);

}
