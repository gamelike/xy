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
 * 表名:kf_zzb_fb
 */
public class Kf_zzb_fb extends BasePo<Kf_zzb_fb> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Kf_zzb_fb> ROW_MAPPER = new BeanPropertyRowMapper<>(Kf_zzb_fb.class);

        // 主键
    private String id = null;
    private boolean isset_id = false;

        // 属性列表
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

    private Long rq = null;
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

    private String qydx = null;
    private boolean isset_qydx = false;

    private String tp = null;
    private boolean isset_tp = false;

    private String fj = null;
    private boolean isset_fj = false;

    private Long cjsj = null;
    private boolean isset_cjsj = false;

    private String beiz = null;
    private boolean isset_beiz = false;

    private Integer sxh = null;
    private boolean isset_sxh = false;

    /**
    * 默认构造函数
    */
    public Kf_zzb_fb() {
    }

    /**
    * 根据主键构造对象
    */
    public Kf_zzb_fb(String id) {
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
        return this.id == null;
    }

        public String getDanhwb() {
    return this.danhwb;
    }

    public void setDanhwb(String danhwb) {
        this.danhwb = danhwb;
        this.isset_danhwb = true;
    }

    public boolean isEmptyDanhwb() {
        return this.danhwb == null;
    }

        public String getDuohwb() {
    return this.duohwb;
    }

    public void setDuohwb(String duohwb) {
        this.duohwb = duohwb;
        this.isset_duohwb = true;
    }

    public boolean isEmptyDuohwb() {
        return this.duohwb == null;
    }

        public String getXlk() {
    return this.xlk;
    }

    public void setXlk(String xlk) {
        this.xlk = xlk;
        this.isset_xlk = true;
    }

    public boolean isEmptyXlk() {
        return this.xlk == null;
    }

        public String getXlkdx() {
    return this.xlkdx;
    }

    public void setXlkdx(String xlkdx) {
        this.xlkdx = xlkdx;
        this.isset_xlkdx = true;
    }

    public boolean isEmptyXlkdx() {
        return this.xlkdx == null;
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
        return this.fxk == null;
    }

        public Long getRq() {
    return this.rq;
    }

    public void setRq(Long rq) {
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
        return this.yh == null;
    }

        public String getYhmc() {
    return this.yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
        this.isset_yhmc = true;
    }

    public boolean isEmptyYhmc() {
        return this.yhmc == null;
    }

        public String getJg() {
    return this.jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
        this.isset_jg = true;
    }

    public boolean isEmptyJg() {
        return this.jg == null;
    }

        public String getJgmc() {
    return this.jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
        this.isset_jgmc = true;
    }

    public boolean isEmptyJgmc() {
        return this.jgmc == null;
    }

        public String getQy() {
    return this.qy;
    }

    public void setQy(String qy) {
        this.qy = qy;
        this.isset_qy = true;
    }

    public boolean isEmptyQy() {
        return this.qy == null;
    }

        public String getQydx() {
    return this.qydx;
    }

    public void setQydx(String qydx) {
        this.qydx = qydx;
        this.isset_qydx = true;
    }

    public boolean isEmptyQydx() {
        return this.qydx == null;
    }

        public String getTp() {
    return this.tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
        this.isset_tp = true;
    }

    public boolean isEmptyTp() {
        return this.tp == null;
    }

        public String getFj() {
    return this.fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
        this.isset_fj = true;
    }

    public boolean isEmptyFj() {
        return this.fj == null;
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
        return this.beiz == null;
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
        return "kf_zzb_fb";
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
        ib.set("qydx", this.qydx, this.isset_qydx);
        ib.set("tp", this.tp, this.isset_tp);
        ib.set("fj", this.fj, this.isset_fj);
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
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("tp", this.tp, this.isset_tp);
        ub.set("fj", this.fj, this.isset_fj);
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
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("tp", this.tp, this.isset_tp);
        ub.set("fj", this.fj, this.isset_fj);
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
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("tp", this.tp, this.isset_tp);
        ub.set("fj", this.fj, this.isset_fj);
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
        return new SqlAndParameters<>("select id, danhwb, duohwb, xlk, xlkdx, dxk, fxk, rq, rqsj, yh, yhmc, jg, jgmc, qy, qydx, tp, fj, cjsj, beiz, sxh from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, danhwb, duohwb, xlk, xlkdx, dxk, fxk, rq, rqsj, yh, yhmc, jg, jgmc, qy, qydx, tp, fj, cjsj, beiz, sxh from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Kf_zzb_fb mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
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
                .append("qydx", this.qydx)
                .append("tp", this.tp)
                .append("fj", this.fj)
                .append("cjsj", this.cjsj)
                .append("beiz", this.beiz)
                .append("sxh", this.sxh)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Kf_zzb_fb clone() {
        try {
            Kf_zzb_fb kf_zzb_fb = (Kf_zzb_fb) super.clone();
            //主键
            if (this.isset_id) {
                kf_zzb_fb.setId(this.getId());
            }
            //普通属性
            if (this.isset_danhwb) {
                kf_zzb_fb.setDanhwb(this.getDanhwb());
            }
            if (this.isset_duohwb) {
                kf_zzb_fb.setDuohwb(this.getDuohwb());
            }
            if (this.isset_xlk) {
                kf_zzb_fb.setXlk(this.getXlk());
            }
            if (this.isset_xlkdx) {
                kf_zzb_fb.setXlkdx(this.getXlkdx());
            }
            if (this.isset_dxk) {
                kf_zzb_fb.setDxk(this.getDxk());
            }
            if (this.isset_fxk) {
                kf_zzb_fb.setFxk(this.getFxk());
            }
            if (this.isset_rq) {
                kf_zzb_fb.setRq(this.getRq());
            }
            if (this.isset_rqsj) {
                kf_zzb_fb.setRqsj(this.getRqsj());
            }
            if (this.isset_yh) {
                kf_zzb_fb.setYh(this.getYh());
            }
            if (this.isset_yhmc) {
                kf_zzb_fb.setYhmc(this.getYhmc());
            }
            if (this.isset_jg) {
                kf_zzb_fb.setJg(this.getJg());
            }
            if (this.isset_jgmc) {
                kf_zzb_fb.setJgmc(this.getJgmc());
            }
            if (this.isset_qy) {
                kf_zzb_fb.setQy(this.getQy());
            }
            if (this.isset_qydx) {
                kf_zzb_fb.setQydx(this.getQydx());
            }
            if (this.isset_tp) {
                kf_zzb_fb.setTp(this.getTp());
            }
            if (this.isset_fj) {
                kf_zzb_fb.setFj(this.getFj());
            }
            if (this.isset_cjsj) {
                kf_zzb_fb.setCjsj(this.getCjsj());
            }
            if (this.isset_beiz) {
                kf_zzb_fb.setBeiz(this.getBeiz());
            }
            if (this.isset_sxh) {
                kf_zzb_fb.setSxh(this.getSxh());
            }
            return kf_zzb_fb;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}