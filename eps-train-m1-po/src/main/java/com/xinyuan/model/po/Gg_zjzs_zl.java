package com.xinyuan.model.po;

import com.xinyuan.core.common.MisException;
import com.xinyuan.core.model.persistence.po.BasePo;
import com.xinyuan.core.model.persistence.po.SqlAndParameters;
import com.xinyuan.core.model.persistence.po.sqlgen.DeleteBuilder;
import com.xinyuan.core.model.persistence.po.sqlgen.InsertBuilder;
import com.xinyuan.core.model.persistence.po.sqlgen.SelectBuilder;
import com.xinyuan.core.model.persistence.po.sqlgen.UpdateBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * 表名:GG_ZJZS_ZL
 */
public class Gg_zjzs_zl extends BasePo<Gg_zjzs_zl> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Gg_zjzs_zl> ROW_MAPPER = new BeanPropertyRowMapper<>(Gg_zjzs_zl.class);

    // 主键
    private String id = null;
    private boolean isset_id = false;

    // 属性列表
    private String fid = null;
    private boolean isset_fid = false;

    private String danhwb = null;
    private boolean isset_danhwb = false;

    private String duohwb = null;
    private boolean isset_duohwb = false;

    private String xlk = null;
    private boolean isset_xlk = false;

    private String xlkdx = null;
    private boolean isset_xlkdx = false;

    private Integer dxk = null;
    private boolean isset_dxk = false;

    private String fxk = null;
    private boolean isset_fxk = false;

    private Integer rq = null;
    private boolean isset_rq = false;

    private Long rqsj = null;
    private boolean isset_rqsj = false;

    private String yh = null;
    private boolean isset_yh = false;

    private String yhmc = null;
    private boolean isset_yhmc = false;

    private String jg = null;
    private boolean isset_jg = false;

    private String jgmc = null;
    private boolean isset_jgmc = false;

    private String qy = null;
    private boolean isset_qy = false;

    private Integer zt = null;
    private boolean isset_zt = false;

    private String tp = null;
    private boolean isset_tp = false;

    private Long cjsj = null;
    private boolean isset_cjsj = false;

    private String beiz = null;
    private boolean isset_beiz = false;

    private Integer sxh = null;
    private boolean isset_sxh = false;

    /**
     * 默认构造函数
     */
    public Gg_zjzs_zl() {
    }

    /**
     * 根据主键构造对象
     */
    public Gg_zjzs_zl(String id) {
        this.setId(id);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
        this.isset_id = true;
    }

    public boolean isEmptyId() {
        return this.id == null || this.id.length() == 0;
    }

    public String getFid() {
        return this.fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
        this.isset_fid = true;
    }

    public boolean isEmptyFid() {
        return this.fid == null || this.fid.length() == 0;
    }

    public String getDanhwb() {
        return this.danhwb;
    }

    public void setDanhwb(String danhwb) {
        this.danhwb = danhwb;
        this.isset_danhwb = true;
    }

    public boolean isEmptyDanhwb() {
        return this.danhwb == null || this.danhwb.length() == 0;
    }

    public String getDuohwb() {
        return this.duohwb;
    }

    public void setDuohwb(String duohwb) {
        this.duohwb = duohwb;
        this.isset_duohwb = true;
    }

    public boolean isEmptyDuohwb() {
        return this.duohwb == null || this.duohwb.length() == 0;
    }

    public String getXlk() {
        return this.xlk;
    }

    public void setXlk(String xlk) {
        this.xlk = xlk;
        this.isset_xlk = true;
    }

    public boolean isEmptyXlk() {
        return this.xlk == null || this.xlk.length() == 0;
    }

    public String getXlkdx() {
        return this.xlkdx;
    }

    public void setXlkdx(String xlkdx) {
        this.xlkdx = xlkdx;
        this.isset_xlkdx = true;
    }

    public boolean isEmptyXlkdx() {
        return this.xlkdx == null || this.xlkdx.length() == 0;
    }

    public Integer getDxk() {
        return this.dxk;
    }

    public void setDxk(Integer dxk) {
        this.dxk = dxk;
        this.isset_dxk = true;
    }

    public boolean isEmptyDxk() {
        return this.dxk == null;
    }

    public String getFxk() {
        return this.fxk;
    }

    public void setFxk(String fxk) {
        this.fxk = fxk;
        this.isset_fxk = true;
    }

    public boolean isEmptyFxk() {
        return this.fxk == null || this.fxk.length() == 0;
    }

    public Integer getRq() {
        return this.rq;
    }

    public void setRq(Integer rq) {
        this.rq = rq;
        this.isset_rq = true;
    }

    public boolean isEmptyRq() {
        return this.rq == null;
    }

    public Long getRqsj() {
        return this.rqsj;
    }

    public void setRqsj(Long rqsj) {
        this.rqsj = rqsj;
        this.isset_rqsj = true;
    }

    public boolean isEmptyRqsj() {
        return this.rqsj == null;
    }

    public String getYh() {
        return this.yh;
    }

    public void setYh(String yh) {
        this.yh = yh;
        this.isset_yh = true;
    }

    public boolean isEmptyYh() {
        return this.yh == null || this.yh.length() == 0;
    }

    public String getYhmc() {
        return this.yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
        this.isset_yhmc = true;
    }

    public boolean isEmptyYhmc() {
        return this.yhmc == null || this.yhmc.length() == 0;
    }

    public String getJg() {
        return this.jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
        this.isset_jg = true;
    }

    public boolean isEmptyJg() {
        return this.jg == null || this.jg.length() == 0;
    }

    public String getJgmc() {
        return this.jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
        this.isset_jgmc = true;
    }

    public boolean isEmptyJgmc() {
        return this.jgmc == null || this.jgmc.length() == 0;
    }

    public String getQy() {
        return this.qy;
    }

    public void setQy(String qy) {
        this.qy = qy;
        this.isset_qy = true;
    }

    public boolean isEmptyQy() {
        return this.qy == null || this.qy.length() == 0;
    }

    public Integer getZt() {
        return this.zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
        this.isset_zt = true;
    }

    public boolean isEmptyZt() {
        return this.zt == null;
    }

    public String getTp() {
        return this.tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
        this.isset_tp = true;
    }

    public boolean isEmptyTp() {
        return this.tp == null || this.tp.length() == 0;
    }

    public Long getCjsj() {
        return this.cjsj;
    }

    public void setCjsj(Long cjsj) {
        this.cjsj = cjsj;
        this.isset_cjsj = true;
    }

    public boolean isEmptyCjsj() {
        return this.cjsj == null;
    }

    public String getBeiz() {
        return this.beiz;
    }

    public void setBeiz(String beiz) {
        this.beiz = beiz;
        this.isset_beiz = true;
    }

    public boolean isEmptyBeiz() {
        return this.beiz == null || this.beiz.length() == 0;
    }

    public Integer getSxh() {
        return this.sxh;
    }

    public void setSxh(Integer sxh) {
        this.sxh = sxh;
        this.isset_sxh = true;
    }

    public boolean isEmptySxh() {
        return this.sxh == null;
    }


    /**
     * 获取表名
     */
    @Override
    public String getTableName_() {
        return "GG_ZJZS_ZL";
    }

    /**
     * 获取主键名称
     */
    @Override
    public String getPkName_() {
        return "id";
    }

    /**
     * 获取主键值
     */
    @Override
    public Object getPkValue_() {
        return this.id;
    }

    /**
     * 设置主键值
     */
    @Override
    public void setPkValue(Object value) {
        this.setId((String) value);
    }

    /**
     * 获取插入语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getInsertSql_() {
        InsertBuilder ib = new InsertBuilder(this.getTableName_());
        ib.set("id", this.id);
        ib.set("fid", this.fid, this.isset_fid);
        ib.set("danhwb", this.danhwb, this.isset_danhwb);
        ib.set("duohwb", this.duohwb, this.isset_duohwb);
        ib.set("xlk", this.xlk, this.isset_xlk);
        ib.set("xlkdx", this.xlkdx, this.isset_xlkdx);
        ib.set("dxk", this.dxk, this.isset_dxk);
        ib.set("fxk", this.fxk, this.isset_fxk);
        ib.set("rq", this.rq, this.isset_rq);
        ib.set("rqsj", this.rqsj, this.isset_rqsj);
        ib.set("yh", this.yh, this.isset_yh);
        ib.set("yhmc", this.yhmc, this.isset_yhmc);
        ib.set("jg", this.jg, this.isset_jg);
        ib.set("jgmc", this.jgmc, this.isset_jgmc);
        ib.set("qy", this.qy, this.isset_qy);
        ib.set("zt", this.zt, this.isset_zt);
        ib.set("tp", this.tp, this.isset_tp);
        ib.set("cjsj", this.cjsj, this.isset_cjsj);
        ib.set("beiz", this.beiz, this.isset_beiz);
        ib.set("sxh", this.sxh, this.isset_sxh);
        return ib.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_() {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("fid", this.fid, this.isset_fid);
        ub.set("danhwb", this.danhwb, this.isset_danhwb);
        ub.set("duohwb", this.duohwb, this.isset_duohwb);
        ub.set("xlk", this.xlk, this.isset_xlk);
        ub.set("xlkdx", this.xlkdx, this.isset_xlkdx);
        ub.set("dxk", this.dxk, this.isset_dxk);
        ub.set("fxk", this.fxk, this.isset_fxk);
        ub.set("rq", this.rq, this.isset_rq);
        ub.set("rqsj", this.rqsj, this.isset_rqsj);
        ub.set("yh", this.yh, this.isset_yh);
        ub.set("yhmc", this.yhmc, this.isset_yhmc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("zt", this.zt, this.isset_zt);
        ub.set("tp", this.tp, this.isset_tp);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("beiz", this.beiz, this.isset_beiz);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.where(this.getPkName_(), this.getPkValue_());
        return ub.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_(String where, Map<String, Object> parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("fid", this.fid, this.isset_fid);
        ub.set("danhwb", this.danhwb, this.isset_danhwb);
        ub.set("duohwb", this.duohwb, this.isset_duohwb);
        ub.set("xlk", this.xlk, this.isset_xlk);
        ub.set("xlkdx", this.xlkdx, this.isset_xlkdx);
        ub.set("dxk", this.dxk, this.isset_dxk);
        ub.set("fxk", this.fxk, this.isset_fxk);
        ub.set("rq", this.rq, this.isset_rq);
        ub.set("rqsj", this.rqsj, this.isset_rqsj);
        ub.set("yh", this.yh, this.isset_yh);
        ub.set("yhmc", this.yhmc, this.isset_yhmc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("zt", this.zt, this.isset_zt);
        ub.set("tp", this.tp, this.isset_tp);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("beiz", this.beiz, this.isset_beiz);
        ub.set("sxh", this.sxh, this.isset_sxh);

        return ub.genMapSql(where, parameters);
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getUpdateSql_(String where, Object[] parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("fid", this.fid, this.isset_fid);
        ub.set("danhwb", this.danhwb, this.isset_danhwb);
        ub.set("duohwb", this.duohwb, this.isset_duohwb);
        ub.set("xlk", this.xlk, this.isset_xlk);
        ub.set("xlkdx", this.xlkdx, this.isset_xlkdx);
        ub.set("dxk", this.dxk, this.isset_dxk);
        ub.set("fxk", this.fxk, this.isset_fxk);
        ub.set("rq", this.rq, this.isset_rq);
        ub.set("rqsj", this.rqsj, this.isset_rqsj);
        ub.set("yh", this.yh, this.isset_yh);
        ub.set("yhmc", this.yhmc, this.isset_yhmc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("zt", this.zt, this.isset_zt);
        ub.set("tp", this.tp, this.isset_tp);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("beiz", this.beiz, this.isset_beiz);
        ub.set("sxh", this.sxh, this.isset_sxh);

        return ub.genArraySql(where, parameters);
    }

    /**
     * 获取删除语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getDeleteSql_() {
        DeleteBuilder db = new DeleteBuilder(this.getTableName_());
        db.where(this.getPkName_(), this.getPkValue_());
        return db.genMapSql();
    }

    /**
     * 获取删除语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getDeleteSql_(String where, Map<String, Object> parameters) {
        DeleteBuilder db = new DeleteBuilder(this.getTableName_());
        return db.genMapSql(where, parameters);
    }

    /**
     * 获取删除语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getDeleteSql_(String where, Object[] parameters) {
        DeleteBuilder db = new DeleteBuilder(this.getTableName_());
        return db.genArraySql(where, parameters);
    }

    /**
     * 获取单行查询语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getSingleSql_() {
        SelectBuilder sb = new SelectBuilder(this.getTableName_());
        sb.where(this.getPkName_(), this.getPkValue_());
        return sb.genMapSql();
    }


    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getSelectSql_(String where, Map<String, Object> parameters) {
        return new SqlAndParameters<>("select id, fid, danhwb, duohwb, xlk, xlkdx, dxk, fxk, rq, rqsj, yh, yhmc, jg, jgmc, qy, zt, tp, cjsj, beiz, sxh from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, fid, danhwb, duohwb, xlk, xlkdx, dxk, fxk, rq, rqsj, yh, yhmc, jg, jgmc, qy, zt, tp, cjsj, beiz, sxh from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Gg_zjzs_zl mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("fid", this.fid)
                .append("danhwb", this.danhwb)
                .append("duohwb", this.duohwb)
                .append("xlk", this.xlk)
                .append("xlkdx", this.xlkdx)
                .append("dxk", this.dxk)
                .append("fxk", this.fxk)
                .append("rq", this.rq)
                .append("rqsj", this.rqsj)
                .append("yh", this.yh)
                .append("yhmc", this.yhmc)
                .append("jg", this.jg)
                .append("jgmc", this.jgmc)
                .append("qy", this.qy)
                .append("zt", this.zt)
                .append("tp", this.tp)
                .append("cjsj", this.cjsj)
                .append("beiz", this.beiz)
                .append("sxh", this.sxh)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Gg_zjzs_zl clone() {
        try {
            Gg_zjzs_zl gg_zjzs_zl = (Gg_zjzs_zl) super.clone();
            //主键
            if (this.isset_id) {
                gg_zjzs_zl.setId(this.getId());
            }
            //普通属性
            if (this.isset_fid) {
                gg_zjzs_zl.setFid(this.getFid());
            }
            if (this.isset_danhwb) {
                gg_zjzs_zl.setDanhwb(this.getDanhwb());
            }
            if (this.isset_duohwb) {
                gg_zjzs_zl.setDuohwb(this.getDuohwb());
            }
            if (this.isset_xlk) {
                gg_zjzs_zl.setXlk(this.getXlk());
            }
            if (this.isset_xlkdx) {
                gg_zjzs_zl.setXlkdx(this.getXlkdx());
            }
            if (this.isset_dxk) {
                gg_zjzs_zl.setDxk(this.getDxk());
            }
            if (this.isset_fxk) {
                gg_zjzs_zl.setFxk(this.getFxk());
            }
            if (this.isset_rq) {
                gg_zjzs_zl.setRq(this.getRq());
            }
            if (this.isset_rqsj) {
                gg_zjzs_zl.setRqsj(this.getRqsj());
            }
            if (this.isset_yh) {
                gg_zjzs_zl.setYh(this.getYh());
            }
            if (this.isset_yhmc) {
                gg_zjzs_zl.setYhmc(this.getYhmc());
            }
            if (this.isset_jg) {
                gg_zjzs_zl.setJg(this.getJg());
            }
            if (this.isset_jgmc) {
                gg_zjzs_zl.setJgmc(this.getJgmc());
            }
            if (this.isset_qy) {
                gg_zjzs_zl.setQy(this.getQy());
            }
            if (this.isset_zt) {
                gg_zjzs_zl.setZt(this.getZt());
            }
            if (this.isset_tp) {
                gg_zjzs_zl.setTp(this.getTp());
            }
            if (this.isset_cjsj) {
                gg_zjzs_zl.setCjsj(this.getCjsj());
            }
            if (this.isset_beiz) {
                gg_zjzs_zl.setBeiz(this.getBeiz());
            }
            if (this.isset_sxh) {
                gg_zjzs_zl.setSxh(this.getSxh());
            }
            return gg_zjzs_zl;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}