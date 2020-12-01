package com.xinyuan.train.model.xsgl.xsgl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Xs_grade;
import com.xinyuan.model.po.Xs_student;
import com.xinyuan.model.po.Xs_teacher;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;

import java.util.List;

/**
 * projectName: eps-train
 * author: 赵一帆
 * time: 2020/12/1 16:22
 * description:学生服务
 */
public interface XsglService extends BaseService {
    /**
     * 获取表单查询教师新信息
     *
     * @param queryVo 查询
     * @param pageInfo 分页
     * @return
     */
    List<Xs_student> queryListList(QueryVo queryVo, XinyuanDefaultSplitPageInfo pageInfo);

    /**
     *
     * @return
     */
    String getTree() throws JsonProcessingException;
}
