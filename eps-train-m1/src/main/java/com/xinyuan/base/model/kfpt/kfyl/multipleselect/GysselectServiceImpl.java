package com.xinyuan.base.model.kfpt.kfyl.multipleselect;

import com.xinyuan.core.common.SplitPageInfo;
import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.model.po.Jc_ztbzt;
import com.xinyuan.support.common.mvc.QueryVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;

/**
* 菜单：开发平台/开发用例/公共选择页面接口实现类
*
* @author xy
*/
@Service
public class GysselectServiceImpl extends BaseServiceImpl implements GysselectService {

    /**
    * 获取数据list
    *
    * @param queryVo       查询信息
    * @param splitPageInfo 分页信息
    * @param jc_ztbzt_id
    * @return 供应商list
    */
    public List<Jc_ztbzt> getJc_ztbztList(QueryVo queryVo, SplitPageInfo splitPageInfo, String jc_ztbzt_id){
        //queryVo.addLikeItem("ztlb", Constants_jyzt.GG_DMNR_FRLX_GYS);
        String sql = "";
        if (StringUtils.isNotEmpty(jc_ztbzt_id)){
            List<String> idList = new LinkedList<>();
            Collections.addAll(idList,jc_ztbzt_id.split(","));
            queryVo.getQueryMap().put("id", idList);
            sql = "select * from  jc_ztbzt where id not in (:id)" + queryVo.generateAndSql();
        }else{
            sql = "select * from  jc_ztbzt "+queryVo.generateAndSql(true);
        }
        return this.dao.selectSplit(sql, queryVo.getQueryMap(), splitPageInfo, new Jc_ztbzt());
    }

    /**
    * 获取已保存的数据list
    *
    * @param jc_ztbzt_id
    * @return
    */
    @Override
    public List<String> queryJc_ztbzt(String jc_ztbzt_id){
        if(StringUtils.isNotBlank(jc_ztbzt_id)){
            String[] jc_ztbzt_ids = jc_ztbzt_id.split(",");
            List<String> jc_ztbztList=new ArrayList<>();
            for(String ztid:jc_ztbzt_ids){
                jc_ztbztList.add(ztid);
            }
            String sql = "select ztmc from jc_ztbzt where id in(:jc_ztbzt_ids)";
            Map map = new HashMap();
            map.put("jc_ztbzt_ids",jc_ztbztList);
            List<String> list = this.select(sql,map);
            return list;
        }else{
            return null;
        }
    }
}
