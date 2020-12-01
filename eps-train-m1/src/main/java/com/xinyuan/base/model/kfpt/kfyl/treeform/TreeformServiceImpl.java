package com.xinyuan.base.model.kfpt.kfyl.treeform;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.model.po.Gg_tree_detail;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* 菜单：开发平台/开发用例/树+表单接口实现类
*
* @author xy
*/
@Service
public class TreeformServiceImpl extends BaseServiceImpl implements TreeformService {

    /**
    * 获取菜单树
    *
    * @return 菜单树信息
    */
    public String getGg_tree() throws Exception {
        String sql = "select * from gg_tree";
        List<Map<String, Object>> list = this.select(sql, new Object[]{});
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(list);
    }

    /**
    * 获取子表gg_tree_detail查询list
    *
    * @param queryVo 查询条件
    * @param splitPageInfo 分页信息
    * @return gg_tree_detail
    * @author xy
    */
    @Override
    public List<Gg_tree_detail> getGg_tree_detailList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo) {
        return this.selectSplit(new Gg_tree_detail(), queryVo.generateAndSql(true).toString(), queryVo.getQueryMap(), splitPageInfo);
    }

    /**
    * 保存公共gg_tree_detail信息
    *
    * @param gg_tree_detail gg_tree_detail信息
    */
    @Override
    public void saveGg_tree_detail(Visit visit, Gg_tree_detail gg_tree_detail) {
        Boolean isAddSxh = false;
        this.save(gg_tree_detail);
    }


    /**
    * gg_tree_detail排序
    *
    * @return gg_tree_detail列表
    */
    @Override
    public List<Gg_tree_detail> getListGg_tree_detail() {
        return this.select(new Gg_tree_detail(), " order by sxh ", new Object[]{});
    }

    /**
    * 保存gg_tree_detail排序
    *
    * @param gg_tree_detail_ids gg_tree_detailid
    */
    @Override
    public void saveSxh(String[] gg_tree_detail_ids) {
        this.saveOrder("gg_tree_detail", gg_tree_detail_ids);
    }

}
