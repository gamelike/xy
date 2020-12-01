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
 * 表名:XS_GRADE
 */
public class Xs_grade extends BasePo<Xs_grade> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Xs_grade> ROW_MAPPER = new BeanPropertyRowMapper<>(Xs_grade.class);

    // 主键
    private String id = null;
    private boolean isset_id = false;

    // 属性列表
    private String bjmc = null;
    private boolean isset_bjmc = false;

    private String pid = null;
    private boolean isset_pid = false;

    private Integer sxh = null;
    private boolean isset_sxh = false;

    private Integer year = null;
    private boolean isset_year = false;

    private String jsbh = null;
    private boolean isset_jsbh = false;

    private String jsmc = null;
    private boolean isset_jsmc = false;

    private String km = null;
    private boolean isset_km = false;

    private String kmmc = null;
    private boolean isset_kmmc = false;

    /**
     * 默认构造函数
     */
    public Xs_grade() {
    }

    /**
     * 根据主键构造对象
     */
    public Xs_grade(String id) {
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

    public String getBjmc() {
        return this.bjmc;
    }

    public void setBjmc(String bjmc) {
        this.bjmc = bjmc;
        this.isset_bjmc = true;
    }

    public boolean isEmptyBjmc() {
        return this.bjmc == null || this.bjmc.length() == 0;
    }

    public String getpid() {
        return this.pid;
    }

    public void setpid(String pid) {
        this.pid = pid;
        this.isset_pid = true;
    }

    public boolean isEmptypid() {
        return this.pid == null || this.pid.length() == 0;
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

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
        this.isset_year = true;
    }

    public boolean isEmptyYear() {
        return this.year == null;
    }

    public String getJsbh() {
        return this.jsbh;
    }

    public void setJsbh(String jsbh) {
        this.jsbh = jsbh;
        this.isset_jsbh = true;
    }

    public boolean isEmptyJsbh() {
        return this.jsbh == null || this.jsbh.length() == 0;
    }

    public String getJsmc() {
        return this.jsmc;
    }

    public void setJsmc(String jsmc) {
        this.jsmc = jsmc;
        this.isset_jsmc = true;
    }

    public boolean isEmptyJsmc() {
        return this.jsmc == null || this.jsmc.length() == 0;
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
        return "XS_GRADE";
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
        ib.set("bjmc", this.bjmc, this.isset_bjmc);
        ib.set("pid", this.pid, this.isset_pid);
        ib.set("sxh", this.sxh, this.isset_sxh);
        ib.set("year", this.year, this.isset_year);
        ib.set("jsbh", this.jsbh, this.isset_jsbh);
        ib.set("jsmc", this.jsmc, this.isset_jsmc);
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
        ub.set("bjmc", this.bjmc, this.isset_bjmc);
        ub.set("pid", this.pid, this.isset_pid);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("year", this.year, this.isset_year);
        ub.set("jsbh", this.jsbh, this.isset_jsbh);
        ub.set("jsmc", this.jsmc, this.isset_jsmc);
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
        ub.set("bjmc", this.bjmc, this.isset_bjmc);
        ub.set("pid", this.pid, this.isset_pid);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("year", this.year, this.isset_year);
        ub.set("jsbh", this.jsbh, this.isset_jsbh);
        ub.set("jsmc", this.jsmc, this.isset_jsmc);
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
        ub.set("bjmc", this.bjmc, this.isset_bjmc);
        ub.set("pid", this.pid, this.isset_pid);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("year", this.year, this.isset_year);
        ub.set("jsbh", this.jsbh, this.isset_jsbh);
        ub.set("jsmc", this.jsmc, this.isset_jsmc);
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
        return new SqlAndParameters<>("select id, bjmc, pid, sxh, year, jsbh, jsmc, km, kmmc from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, bjmc, pid, sxh, year, jsbh, jsmc, km, kmmc from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Xs_grade mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("bjmc", this.bjmc)
                .append("pid", this.pid)
                .append("sxh", this.sxh)
                .append("year", this.year)
                .append("jsbh", this.jsbh)
                .append("jsmc", this.jsmc)
                .append("km", this.km)
                .append("kmmc", this.kmmc)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Xs_grade clone() {
        try {
            Xs_grade xs_grade = (Xs_grade) super.clone();
            //主键
            if (this.isset_id) {
                xs_grade.setId(this.getId());
            }
            //普通属性
            if (this.isset_bjmc) {
                xs_grade.setBjmc(this.getBjmc());
            }
            if (this.isset_pid) {
                xs_grade.setpid(this.getpid());
            }
            if (this.isset_sxh) {
                xs_grade.setSxh(this.getSxh());
            }
            if (this.isset_year) {
                xs_grade.setYear(this.getYear());
            }
            if (this.isset_jsbh) {
                xs_grade.setJsbh(this.getJsbh());
            }
            if (this.isset_jsmc) {
                xs_grade.setJsmc(this.getJsmc());
            }
            if (this.isset_km) {
                xs_grade.setKm(this.getKm());
            }
            if (this.isset_kmmc) {
                xs_grade.setKmmc(this.getKmmc());
            }
            return xs_grade;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}