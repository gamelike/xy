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
 * 表名:gg_dbzscg
 */
public class Gg_dbzscg extends BasePo<Gg_dbzscg> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Gg_dbzscg> ROW_MAPPER = new BeanPropertyRowMapper<>(Gg_dbzscg.class);

        // 主键
    private String id = null;
    private boolean isset_id = false;

        // 属性列表
    private String xmmc = null;
    private boolean isset_xmmc = false;

    private String xmlx = null;
    private boolean isset_xmlx = false;

    private String xmytms = null;
    private boolean isset_xmytms = false;

    private Integer kbsj = null;
    private boolean isset_kbsj = false;

    private String kbdd = null;
    private boolean isset_kbdd = false;

    private String syr = null;
    private boolean isset_syr = false;

    private String syrmc = null;
    private boolean isset_syrmc = false;

    private String jg = null;
    private boolean isset_jg = false;

    private String jgmc = null;
    private boolean isset_jgmc = false;

    private Integer lb = null;
    private boolean isset_lb = false;

    private String fj = null;
    private boolean isset_fj = false;

    /**
    * 默认构造函数
    */
    public Gg_dbzscg() {
    }

    /**
    * 根据主键构造对象
    */
    public Gg_dbzscg(String id) {
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

        public String getXmmc() {
    return this.xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
        this.isset_xmmc = true;
    }

    public boolean isEmptyXmmc() {
        return this.xmmc == null;
    }

        public String getXmlx() {
    return this.xmlx;
    }

    public void setXmlx(String xmlx) {
        this.xmlx = xmlx;
        this.isset_xmlx = true;
    }

    public boolean isEmptyXmlx() {
        return this.xmlx == null;
    }

        public String getXmytms() {
    return this.xmytms;
    }

    public void setXmytms(String xmytms) {
        this.xmytms = xmytms;
        this.isset_xmytms = true;
    }

    public boolean isEmptyXmytms() {
        return this.xmytms == null;
    }

        public Integer getKbsj() {
    return this.kbsj;
    }

    public void setKbsj(Integer kbsj) {
        this.kbsj = kbsj;
        this.isset_kbsj = true;
    }

    public boolean isEmptyKbsj() {
        return this.kbsj == null;
    }

        public String getKbdd() {
    return this.kbdd;
    }

    public void setKbdd(String kbdd) {
        this.kbdd = kbdd;
        this.isset_kbdd = true;
    }

    public boolean isEmptyKbdd() {
        return this.kbdd == null;
    }

        public String getSyr() {
    return this.syr;
    }

    public void setSyr(String syr) {
        this.syr = syr;
        this.isset_syr = true;
    }

    public boolean isEmptySyr() {
        return this.syr == null;
    }

        public String getSyrmc() {
    return this.syrmc;
    }

    public void setSyrmc(String syrmc) {
        this.syrmc = syrmc;
        this.isset_syrmc = true;
    }

    public boolean isEmptySyrmc() {
        return this.syrmc == null;
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

        public Integer getLb() {
    return this.lb;
    }

    public void setLb(Integer lb) {
        this.lb = lb;
        this.isset_lb = true;
    }

    public boolean isEmptyLb() {
        return this.lb == null;
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


    /**
     * 获取表名
     */
    @Override
    public String getTableName_() {
        return "gg_dbzscg";
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
        ib.set("xmmc", this.xmmc, this.isset_xmmc);
        ib.set("xmlx", this.xmlx, this.isset_xmlx);
        ib.set("xmytms", this.xmytms, this.isset_xmytms);
        ib.set("kbsj", this.kbsj, this.isset_kbsj);
        ib.set("kbdd", this.kbdd, this.isset_kbdd);
        ib.set("syr", this.syr, this.isset_syr);
        ib.set("syrmc", this.syrmc, this.isset_syrmc);
        ib.set("jg", this.jg, this.isset_jg);
        ib.set("jgmc", this.jgmc, this.isset_jgmc);
        ib.set("lb", this.lb, this.isset_lb);
        ib.set("fj", this.fj, this.isset_fj);
        return ib.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_() {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("xmmc", this.xmmc, this.isset_xmmc);
        ub.set("xmlx", this.xmlx, this.isset_xmlx);
        ub.set("xmytms", this.xmytms, this.isset_xmytms);
        ub.set("kbsj", this.kbsj, this.isset_kbsj);
        ub.set("kbdd", this.kbdd, this.isset_kbdd);
        ub.set("syr", this.syr, this.isset_syr);
        ub.set("syrmc", this.syrmc, this.isset_syrmc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("lb", this.lb, this.isset_lb);
        ub.set("fj", this.fj, this.isset_fj);
        ub.where(this.getPkName_(), this.getPkValue_());
        return ub.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_(String where, Map<String, Object> parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("xmmc", this.xmmc, this.isset_xmmc);
        ub.set("xmlx", this.xmlx, this.isset_xmlx);
        ub.set("xmytms", this.xmytms, this.isset_xmytms);
        ub.set("kbsj", this.kbsj, this.isset_kbsj);
        ub.set("kbdd", this.kbdd, this.isset_kbdd);
        ub.set("syr", this.syr, this.isset_syr);
        ub.set("syrmc", this.syrmc, this.isset_syrmc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("lb", this.lb, this.isset_lb);
        ub.set("fj", this.fj, this.isset_fj);

        return ub.genMapSql(where, parameters);
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getUpdateSql_(String where, Object[] parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("xmmc", this.xmmc, this.isset_xmmc);
        ub.set("xmlx", this.xmlx, this.isset_xmlx);
        ub.set("xmytms", this.xmytms, this.isset_xmytms);
        ub.set("kbsj", this.kbsj, this.isset_kbsj);
        ub.set("kbdd", this.kbdd, this.isset_kbdd);
        ub.set("syr", this.syr, this.isset_syr);
        ub.set("syrmc", this.syrmc, this.isset_syrmc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("lb", this.lb, this.isset_lb);
        ub.set("fj", this.fj, this.isset_fj);

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
        return new SqlAndParameters<>("select id, xmmc, xmlx, xmytms, kbsj, kbdd, syr, syrmc, jg, jgmc, lb, fj from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, xmmc, xmlx, xmytms, kbsj, kbdd, syr, syrmc, jg, jgmc, lb, fj from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Gg_dbzscg mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("xmmc", this.xmmc)
                .append("xmlx", this.xmlx)
                .append("xmytms", this.xmytms)
                .append("kbsj", this.kbsj)
                .append("kbdd", this.kbdd)
                .append("syr", this.syr)
                .append("syrmc", this.syrmc)
                .append("jg", this.jg)
                .append("jgmc", this.jgmc)
                .append("lb", this.lb)
                .append("fj", this.fj)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Gg_dbzscg clone() {
        try {
            Gg_dbzscg gg_dbzscg = (Gg_dbzscg) super.clone();
            //主键
            if (this.isset_id) {
                gg_dbzscg.setId(this.getId());
            }
            //普通属性
            if (this.isset_xmmc) {
                gg_dbzscg.setXmmc(this.getXmmc());
            }
            if (this.isset_xmlx) {
                gg_dbzscg.setXmlx(this.getXmlx());
            }
            if (this.isset_xmytms) {
                gg_dbzscg.setXmytms(this.getXmytms());
            }
            if (this.isset_kbsj) {
                gg_dbzscg.setKbsj(this.getKbsj());
            }
            if (this.isset_kbdd) {
                gg_dbzscg.setKbdd(this.getKbdd());
            }
            if (this.isset_syr) {
                gg_dbzscg.setSyr(this.getSyr());
            }
            if (this.isset_syrmc) {
                gg_dbzscg.setSyrmc(this.getSyrmc());
            }
            if (this.isset_jg) {
                gg_dbzscg.setJg(this.getJg());
            }
            if (this.isset_jgmc) {
                gg_dbzscg.setJgmc(this.getJgmc());
            }
            if (this.isset_lb) {
                gg_dbzscg.setLb(this.getLb());
            }
            if (this.isset_fj) {
                gg_dbzscg.setFj(this.getFj());
            }
            return gg_dbzscg;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}