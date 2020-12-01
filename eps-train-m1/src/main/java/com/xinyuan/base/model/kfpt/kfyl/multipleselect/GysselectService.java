package com.xinyuan.base.model.kfpt.kfyl.multipleselect;

import com.xinyuan.core.common.SplitPageInfo;
import com.xinyuan.core.model.persistence.service.BaseService;
import com.xinyuan.model.po.Jc_ztbzt;
import com.xinyuan.support.common.mvc.QueryVo;

import java.util.List;

/**
* 菜单：开发平台/开发用例/公共选择页面接口
*
* @author xy
*/
public interface GysselectService extends BaseService {

    /**
    * 获取数据list
    *
    * @param queryVo       查询信息
    * @param splitPageInfo 分页信息
    * @param jc_ztbzt_ids
    * @return 供应商list
    */
    List<Jc_ztbzt> getJc_ztbztList(QueryVo queryVo, SplitPageInfo splitPageInfo, String jc_ztbzt_ids);

    /**
    * 获取已保存的数据list
    *
    * @param jc_ztbzt_id
    * @return
    */
    List<String> queryJc_ztbzt(String jc_ztbzt_id);

}
