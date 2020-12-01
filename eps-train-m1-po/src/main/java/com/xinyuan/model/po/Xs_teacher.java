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
 * 表名:XS_TEACHER
 */
public class Xs_teacher extends BasePo<Xs_teacher> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Xs_teacher> ROW_MAPPER = new BeanPropertyRowMapper<>(Xs_teacher.class);

    // 主键
    private String id = null;
    private boolean isset_id = false;

    // 属性列表
    private String xm = null;
    private boolean isset_xm = false;

    private Integer xb = null;
    private boolean isset_xb = false;

    private String lxfs = null;
    private boolean isset_lxfs = false;

    private Integer zgxl = null;
    private boolean isset_zgxl = false;

    private Integer csrq = null;
    private boolean isset_csrq = false;

    private String jtzz = null;
    private boolean isset_jtzz = false;

    private String bz = null;
    private boolean isset_bz = false;

    private String km = null;
    private boolean isset_km = false;

    private String kmmc = null;
    private boolean isset_kmmc = false;

    /**
     * 默认构造函数
     */
    public Xs_teacher() {
    }

    /**
     * 根据主键构造对象
     */
    public Xs_teacher(String id) {
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

    public String getXm() {
        return this.xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
        this.isset_xm = true;
    }

    public boolean isEmptyXm() {
        return this.xm == null || this.xm.length() == 0;
    }

    public Integer getXb() {
        return this.xb;
    }

    public void setXb(Integer xb) {
        this.xb = xb;
        this.isset_xb = true;
    }

    public boolean isEmptyXb() {
        return this.xb == null;
    }

    public String getLxfs() {
        return this.lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
        this.isset_lxfs = true;
    }

    public boolean isEmptyLxfs() {
        return this.lxfs == null || this.lxfs.length() == 0;
    }

    public Integer getZgxl() {
        return this.zgxl;
    }

    public void setZgxl(Integer zgxl) {
        this.zgxl = zgxl;
        this.isset_zgxl = true;
    }

    public boolean isEmptyZgxl() {
        return this.zgxl == null;
    }

    public Integer getCsrq() {
        return this.csrq;
    }

    public void setCsrq(Integer csrq) {
        this.csrq = csrq;
        this.isset_csrq = true;
    }

    public boolean isEmptyCsrq() {
        return this.csrq == null;
    }

    public String getJtzz() {
        return this.jtzz;
    }

    public void setJtzz(String jtzz) {
        this.jtzz = jtzz;
        this.isset_jtzz = true;
    }

    public boolean isEmptyJtzz() {
        return this.jtzz == null || this.jtzz.length() == 0;
    }

    public String getBz() {
        return this.bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
        this.isset_bz = true;
    }

    public boolean isEmptyBz() {
        return this.bz == null || this.bz.length() == 0;
    }

    public String getKm() {
        return this.km;
    }

    public void setKm(String km) {
        this.km = km;
        this.isset_km = true;
    }

    public boolean isEmptyKm() {
        return this.km == null || this.km.length() == 0;
    }

    public String getKmmc() {
        return this.kmmc;
    }

    public void setKmmc(String kmmc) {
        this.kmmc = kmmc;
        this.isset_kmmc = true;
    }

    public boolean isEmptyKmmc() {
        return this.kmmc == null || this.kmmc.length() == 0;
    }


    /**
     * 获取表名
     */
    @Override
    public String getTableName_() {
        return "XS_TEACHER";
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
        ib.set("xm", this.xm, this.isset_xm);
        ib.set("xb", this.xb, this.isset_xb);
        ib.set("lxfs", this.lxfs, this.isset_lxfs);
        ib.set("zgxl", this.zgxl, this.isset_zgxl);
        ib.set("csrq", this.csrq, this.isset_csrq);
        ib.set("jtzz", this.jtzz, this.isset_jtzz);
        ib.set("bz", this.bz, this.isset_bz);
        ib.set("km", this.km, this.isset_km);
        ib.set("kmmc", this.kmmc, this.isset_kmmc);
        return ib.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_() {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("xm", this.xm, this.isset_xm);
        ub.set("xb", this.xb, this.isset_xb);
        ub.set("lxfs", this.lxfs, this.isset_lxfs);
        ub.set("zgxl", this.zgxl, this.isset_zgxl);
        ub.set("csrq", this.csrq, this.isset_csrq);
        ub.set("jtzz", this.jtzz, this.isset_jtzz);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("km", this.km, this.isset_km);
        ub.set("kmmc", this.kmmc, this.isset_kmmc);
        ub.where(this.getPkName_(), this.getPkValue_());
        return ub.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_(String where, Map<String, Object> parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("xm", this.xm, this.isset_xm);
        ub.set("xb", this.xb, this.isset_xb);
        ub.set("lxfs", this.lxfs, this.isset_lxfs);
        ub.set("zgxl", this.zgxl, this.isset_zgxl);
        ub.set("csrq", this.csrq, this.isset_csrq);
        ub.set("jtzz", this.jtzz, this.isset_jtzz);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("km", this.km, this.isset_km);
        ub.set("kmmc", this.kmmc, this.isset_kmmc);

        return ub.genMapSql(where, parameters);
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getUpdateSql_(String where, Object[] parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("xm", this.xm, this.isset_xm);
        ub.set("xb", this.xb, this.isset_xb);
        ub.set("lxfs", this.lxfs, this.isset_lxfs);
        ub.set("zgxl", this.zgxl, this.isset_zgxl);
        ub.set("csrq", this.csrq, this.isset_csrq);
        ub.set("jtzz", this.jtzz, this.isset_jtzz);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("km", this.km, this.isset_km);
        ub.set("kmmc", this.kmmc, this.isset_kmmc);

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
        return new SqlAndParameters<>("select id, xm, xb, lxfs, zgxl, csrq, jtzz, bz, km, kmmc from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, xm, xb, lxfs, zgxl, csrq, jtzz, bz, km, kmmc from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Xs_teacher mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("xm", this.xm)
                .append("xb", this.xb)
                .append("lxfs", this.lxfs)
                .append("zgxl", this.zgxl)
                .append("csrq", this.csrq)
                .append("jtzz", this.jtzz)
                .append("bz", this.bz)
                .append("km", this.km)
                .append("kmmc", this.kmmc)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Xs_teacher clone() {
        try {
            Xs_teacher xs_teacher = (Xs_teacher) super.clone();
            //主键
            if (this.isset_id) {
                xs_teacher.setId(this.getId());
            }
            //普通属性
            if (this.isset_xm) {
                xs_teacher.setXm(this.getXm());
            }
            if (this.isset_xb) {
                xs_teacher.setXb(this.getXb());
            }
            if (this.isset_lxfs) {
                xs_teacher.setLxfs(this.getLxfs());
            }
            if (this.isset_zgxl) {
                xs_teacher.setZgxl(this.getZgxl());
            }
            if (this.isset_csrq) {
                xs_teacher.setCsrq(this.getCsrq());
            }
            if (this.isset_jtzz) {
                xs_teacher.setJtzz(this.getJtzz());
            }
            if (this.isset_bz) {
                xs_teacher.setBz(this.getBz());
            }
            if (this.isset_km) {
                xs_teacher.setKm(this.getKm());
            }
            if (this.isset_kmmc) {
                xs_teacher.setKmmc(this.getKmmc());
            }
            return xs_teacher;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}