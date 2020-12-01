package com.xinyuan.train.model.xsgl.jsgl;

import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Teacher;
import com.xinyuan.model.po.Xs_teacher;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;

import java.util.List;

/**
 * projectName: eps-train
 * author: 赵一帆
 * time: 2020/11/30 19:27
 * description:教师管理
 */
public interface JsglService extends BaseService {
    /**
     * 获取表单查询教师新信息
     *
     * @param queryVo 查询
     * @param pageInfo 分页
     * @return
     */
    List<Xs_teacher> queryListList(QueryVo queryVo, XinyuanDefaultSplitPageInfo pageInfo);
}
