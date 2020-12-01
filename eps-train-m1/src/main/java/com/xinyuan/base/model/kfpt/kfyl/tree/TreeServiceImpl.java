package com.xinyuan.base.model.kfpt.kfyl.tree;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinyuan.core.common.util.UuidUtil;
import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.model.po.Kf_tree;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <pre>
 * 菜单：开发平台/开发用例/树 的接口实现类。
 * </pre>
 *
 * @author xy
 */
@Service
public class TreeServiceImpl extends BaseServiceImpl implements TreeService {

    /**
     * 获取树[kf_tree]树
     *
     * @return 树[kf_tree]树信息
     */
    @Override
    public String getKf_treeTree() throws Exception {
        String sql = "select * from kf_tree";
        sql += " order by sxh";
        List<Map<String, Object>> list = this.select(sql, new Object[]{});
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(list);
    }

    /**
     * 获取树[kf_tree]list
     *
     * @param kf_tree 树[kf_tree]信息
     * @return 树[kf_tree]list
     */
    @Override
    public List<Kf_tree> getListKf_tree(Kf_tree kf_tree) {
        String sql = "select * from kf_tree where pid=:pid order by sxh";
        Map<String, Object> map = new HashMap<>();
        map.put("pid", kf_tree.getId());
        return this.select(sql, map, new Kf_tree());
    }

    /**
     * 树[kf_tree]根节点list
     *
     * @return 树[kf_tree]列表
     */
    @Override
    public List<Kf_tree> getListKf_treeRoot() {
        return this.select(new Kf_tree(), "where pid is null order by sxh", new Object[]{});
    }

    /**
     * 保存下级树[kf_tree]排序
     *
     * @param kf_tree_ids 树[kf_tree]id
     */
    @Override
    public void saveSxh(String[] kf_tree_ids) {
        this.saveOrder("kf_tree", kf_tree_ids);
    }

    /**
     * 保存公共树[kf_tree]信息
     *
     * @param kf_tree 树[kf_tree]信息
     */
    @Override
    public void saveKf_tree(Kf_tree kf_tree, boolean isAddSxh) {
        if (StringUtils.isEmpty(kf_tree.getId())) {
            String id = UuidUtil.random32();
            kf_tree.setId(id);
            kf_tree.setLj(kf_tree.getLj() + "/" + id);
            if (StringUtils.isEmpty(kf_tree.getPid())) {
                kf_tree.setSxh(this.getMaxOrder("kf_tree","pid","null")+1);
            } else {
                kf_tree.setSxh(this.getMaxOrder("kf_tree", "pid", kf_tree.getPid()) + 1);
            }
            this.insert(kf_tree);
        } else {
            this.update(kf_tree);
        }
    }
}
