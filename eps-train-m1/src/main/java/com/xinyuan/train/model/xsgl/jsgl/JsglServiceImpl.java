package com.xinyuan.train.model.xsgl.jsgl;

import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.model.po.Teacher;
import com.xinyuan.model.po.Xs_teacher;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: eps-train
 * author: 赵一帆
 * time: 2020/11/30 19:28
 * description:教师管理
 */
@Service
public class JsglServiceImpl extends BaseServiceImpl implements JsglService {
    @Override
    public List<Xs_teacher> queryListList(QueryVo queryVo, XinyuanDefaultSplitPageInfo pageInfo) {
        return this.dao.selectSplit(new Xs_teacher(),queryVo.generateAndSql(true).toString(),queryVo.getQueryMap(),pageInfo);
    }
}
