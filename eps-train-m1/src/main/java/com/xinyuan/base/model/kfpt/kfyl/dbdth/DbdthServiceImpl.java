package com.xinyuan.base.model.kfpt.kfyl.dbdth;

import com.xinyuan.core.model.persistence.service.BaseServiceImpl;
import com.xinyuan.model.po.Kf_dbdth;
import com.xinyuan.support.common.mvc.QueryVo;
import com.xinyuan.support.common.mvc.XinyuanDefaultSplitPageInfo;
import com.xinyuan.support.common.visit.Visit;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
* 菜单：开发平台/开发用例/单表动态行接口实现类
*
* @author xy
*/
@Service
public class DbdthServiceImpl extends BaseServiceImpl implements DbdthService {

    /**
    * 单表动态行[kf_dbdth]list
    *
    * @return 单表动态行[kf_dbdth]
    * @author xy
    */
    @Override
    public List<Kf_dbdth> getDbdthList(QueryVo queryVo, XinyuanDefaultSplitPageInfo splitPageInfo) {
        return this.selectSplit(new Kf_dbdth(), queryVo.generateAndSql(true).toString(), queryVo.getQueryMap(), splitPageInfo);
    }


    /**
    * 保存单表动态行[kf_dbdth]信息
    *
    * @param visit
    * @param kf_dbdthList
    */
    @Override
    public void saveKf_dbdth(HttpServletRequest request, Visit visit, List<Kf_dbdth> kf_dbdthList) {
        for (Kf_dbdth kf_dbdth : kf_dbdthList) {
            kf_dbdth.setCjr(visit.getId());
            kf_dbdth.setCjrmc(visit.getXm());
            kf_dbdth.setCjsj(com.xinyuan.core.common.util.DateTimeUtil.now14());
            kf_dbdth.setSxh(this.getMaxOrder("kf_dbdth",null,null)+1);
            String[] qydxs = request.getParameterValues(kf_dbdth.getId()+"more_qydx");
            String addqydx = "";
            if(qydxs != null && qydxs.length>0){
                for(int i=0;i<qydxs.length;i++){
                    if(i==0){
                    addqydx = qydxs[i];
                    }else{
                    addqydx += ","+qydxs[i];
                    }
                }
            }
            kf_dbdth.setQydx(addqydx);
            if(kf_dbdth.getId()!=null){
                if(kf_dbdth.getId().startsWith("add_")){
                    kf_dbdth.setId(kf_dbdth.getId().substring(4));
                    this.insert(kf_dbdth);
                }else{
                    this.update(kf_dbdth);
                }
            }
        }
    }

}
