package com.xinyuan.base.model.kfpt.kfyl.slbjck;

import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.model.po.Kf_slbjck;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 菜单：开发平台/开发用例/双列编辑查看接口实现类
*
* @author xy
*/
@Service
public class SlbjckServiceImpl extends BaseServiceImpl implements SlbjckService {

    /**
    * 双列编辑查看list
    *
    * @return 双列编辑查看
    * @author xy
    */
    @Override
    public List<Kf_slbjck> getSlbjckList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo) {
        queryVo.appendOrderBySql(" order by sxh");
        return this.selectSplit(new Kf_slbjck(), queryVo.generateAndSql(true).toString(), queryVo.getQueryMap(), splitPageInfo);
    }

    /**
    * 保存公共双列编辑查看信息
    *
    * @param kf_slbjck 双列编辑查看信息
    */
    @Override
    public void saveKf_slbjck(Visit visit, Kf_slbjck kf_slbjck) {
        kf_slbjck.setCjsj(com.xinyuan.core.common.util.DateTimeUtil.now14());
        kf_slbjck.setSxh(this.getMaxOrder("kf_slbjck",null,null)+1);
        this.save(kf_slbjck);
    }


    /**
    * 双列编辑查看排序
    *
    * @return 双列编辑查看列表
    */
    @Override
    public List<Kf_slbjck> getListKf_slbjck() {
        return this.select(new Kf_slbjck(), " order by sxh", new Object[]{});
    }

    /**
    * 保存双列编辑查看排序
    *
    * @param kf_slbjck_ids 双列编辑查看id
    */
    @Override
    public void saveSxh(String[] kf_slbjck_ids) {
        this.saveOrder("kf_slbjck", kf_slbjck_ids);
    }

}
