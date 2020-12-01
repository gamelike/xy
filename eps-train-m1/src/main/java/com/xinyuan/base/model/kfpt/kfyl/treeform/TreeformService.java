package com.xinyuan.base.model.kfpt.kfyl.treeform;

import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Gg_tree_detail;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;

import java.util.List;

/**
* 菜单：开发平台/开发用例/树+表单接口
*
* @author xy
*/
public interface TreeformService extends BaseService {

    /**
    * 获取菜单树
    *
    * @return 菜单树信息
    */
    String getGg_tree() throws Exception;

    /**
    * 获取子表gg_tree_detail查询list
    *
    * @param queryVo 查询条件
    * @param splitPageInfo 分页信息
    * @return gg_tree_detail
    * @author xy
    */
    List<Gg_tree_detail> getGg_tree_detailList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo);

    /**
    * 保存gg_tree_detail信息
    *
    * @param gg_tree_detail gg_tree_detail
    */
    void saveGg_tree_detail(Visit visit, Gg_tree_detail gg_tree_detail);


    /**
    * gg_tree_detail排序
    *
    * @return gg_tree_detail列表
    */
    List<Gg_tree_detail> getListGg_tree_detail();

    /**
    * 保存gg_tree_detail排序
    *
    * @param gg_tree_detail_ids gg_tree_detailid
    */
    void saveSxh(String[] gg_tree_detail_ids);

}
