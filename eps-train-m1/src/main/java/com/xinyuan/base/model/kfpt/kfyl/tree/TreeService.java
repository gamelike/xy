package com.xinyuan.base.model.kfpt.kfyl.tree;

import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Kf_tree;

import java.util.List;

/**
 * <pre>
 * 菜单：开发平台/开发用例/树 的接口。
 * </pre>
 *
 * @author xy
 */
public interface TreeService extends BaseService {
    /**
     * 获取树[kf_tree]树
     *
     * @return 树[kf_tree]树信息
     */
    String getKf_treeTree() throws Exception;

    /**
     * 获取树[kf_tree]list
     *
     * @param kf_tree 树[kf_tree]信息
     * @return 树[kf_tree]list
     */
    List<Kf_tree> getListKf_tree(Kf_tree kf_tree);

    /**
     * 树[kf_tree]根节点list
     *
     * @return 树[kf_tree]列表
     */
    List<Kf_tree> getListKf_treeRoot();

    /**
     * 保存下级排序
     *
     * @param kf_tree_ids 树[kf_tree]id
     */
    void saveSxh(String[] kf_tree_ids);

    /**
     * 保存树[kf_tree]信息
     *
     * @param kf_tree 树[kf_tree]
     */
    void saveKf_tree(Kf_tree kf_tree, boolean isAddSxh);

}
