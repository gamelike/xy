package com.xinyuan.base.model.kfpt.kfyl.anzscg;

import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.model.po.Kf_anzscg;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 菜单：开发平台/开发用例/按钮增删查改接口实现类
*
* @author xy
*/
@Service
public class AnzscgServiceImpl extends BaseServiceImpl implements AnzscgService {

    /**
    * 按钮增删查改[kf_anzscg]list
    *
    * @return 按钮增删查改[kf_anzscg]
    * @author xy
    */
    @Override
    public List<Kf_anzscg> getAnzscgList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo) {
        queryVo.appendOrderBySql(" order by mc");
        return this.selectSplit(new Kf_anzscg(), queryVo.generateAndSql(true).toString(), queryVo.getQueryMap(), splitPageInfo);
    }

    /**
    * 保存公共按钮增删查改[kf_anzscg]信息
    *
    * @param kf_anzscg 按钮增删查改[kf_anzscg]信息
    */
    @Override
    public void saveKf_anzscg(Kf_anzscg kf_anzscg, boolean isAddSxh) {
        this.save(kf_anzscg);
    }
}
