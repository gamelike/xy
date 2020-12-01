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
 * 表名:kf_anzscg
 */
public class Kf_anzscg extends BasePo<Kf_anzscg> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Kf_anzscg> ROW_MAPPER = new BeanPropertyRowMapper<>(Kf_anzscg.class);

        // 主键
    private String id = null;
    private boolean isset_id = false;

        // 属性列表
    private String bs = null;
    private boolean isset_bs = false;

    private String mc = null;
    private boolean isset_mc = false;

    /**
    * 默认构造函数
    */
    public Kf_anzscg() {
    }

    /**
    * 根据主键构造对象
    */
    public Kf_anzscg(String id) {
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

        public String getBs() {
    return this.bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
        this.isset_bs = true;
    }

    public boolean isEmptyBs() {
        return this.bs == null;
    }

        public String getMc() {
    return this.mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
        this.isset_mc = true;
    }

    public boolean isEmptyMc() {
        return this.mc == null;
    }


    /**
     * 获取表名
     */
    @Override
    public String getTableName_() {
        return "kf_anzscg";
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
        ib.set("bs", this.bs, this.isset_bs);
        ib.set("mc", this.mc, this.isset_mc);
        return ib.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_() {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("bs", this.bs, this.isset_bs);
        ub.set("mc", this.mc, this.isset_mc);
        ub.where(this.getPkName_(), this.getPkValue_());
        return ub.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_(String where, Map<String, Object> parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("bs", this.bs, this.isset_bs);
        ub.set("mc", this.mc, this.isset_mc);

        return ub.genMapSql(where, parameters);
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getUpdateSql_(String where, Object[] parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("bs", this.bs, this.isset_bs);
        ub.set("mc", this.mc, this.isset_mc);

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
        return new SqlAndParameters<>("select id, bs, mc from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, bs, mc from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Kf_anzscg mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("bs", this.bs)
                .append("mc", this.mc)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Kf_anzscg clone() {
        try {
            Kf_anzscg kf_anzscg = (Kf_anzscg) super.clone();
            //主键
            if (this.isset_id) {
                kf_anzscg.setId(this.getId());
            }
            //普通属性
            if (this.isset_bs) {
                kf_anzscg.setBs(this.getBs());
            }
            if (this.isset_mc) {
                kf_anzscg.setMc(this.getMc());
            }
            return kf_anzscg;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}