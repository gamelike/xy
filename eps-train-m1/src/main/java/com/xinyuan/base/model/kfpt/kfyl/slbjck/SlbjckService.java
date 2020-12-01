package com.xinyuan.base.model.kfpt.kfyl.slbjck;

import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Kf_slbjck;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;

import java.util.List;

/**
* 菜单：开发平台/开发用例/双列编辑查看接口
*
* @author xy
*/
public interface SlbjckService extends BaseService {

    /**
    * 获取双列编辑查看查询list
    *
    * @return 双列编辑查看
    * @author xy
    */
    List<Kf_slbjck> getSlbjckList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo);

    /**
    * 保存双列编辑查看信息
    *
    * @param kf_slbjck 双列编辑查看
    */
    void saveKf_slbjck(Visit visit, Kf_slbjck kf_slbjck);


    /**
    * 双列编辑查看排序
    *
    * @return 双列编辑查看列表
    */
    List<Kf_slbjck> getListKf_slbjck();

    /**
    * 保存双列编辑查看排序
    *
    * @param kf_slbjck_ids 双列编辑查看id
    */
    void saveSxh(String[] kf_slbjck_ids);

}
