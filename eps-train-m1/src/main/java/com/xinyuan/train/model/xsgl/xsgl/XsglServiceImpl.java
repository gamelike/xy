package com.xinyuan.train.model.xsgl.xsgl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.model.po.Xs_grade;
import com.xinyuan.model.po.Xs_student;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * projectName: eps-train
 * author: 赵一帆
 * time: 2020/12/1 16:22
 * description:实现类
 */
@Service
public class XsglServiceImpl extends BaseServiceImpl implements XsglService {
    @Override
    public List<Xs_student> queryListList(QueryVo queryVo, XinyuanDefaultSplitPageInfo pageInfo) {

        return this.selectSplit(new Xs_student(),queryVo.generateAndSql(true).toString(),queryVo.getQueryMap(),pageInfo);
    }

    @Override
    public String getTree() throws JsonProcessingException {
        String sql = "select * from xs_grade";
        List<Map<String, Object>> list = this.select(sql, new Object[]{});
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(list);
    }
}
