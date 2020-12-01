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
 * 表名:gg_tree
 */
public class Gg_tree extends BasePo<Gg_tree> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Gg_tree> ROW_MAPPER = new BeanPropertyRowMapper<>(Gg_tree.class);

        // 主键
    private String id = null;
    private boolean isset_id = false;

        // 属性列表
    private String pid = null;
    private boolean isset_pid = false;

    private String bs = null;
    private boolean isset_bs = false;

    private String bt = null;
    private boolean isset_bt = false;

    private String lj = null;
    private boolean isset_lj = false;

    private Integer sxh = null;
    private boolean isset_sxh = false;

    /**
    * 默认构造函数
    */
    public Gg_tree() {
    }

    /**
    * 根据主键构造对象
    */
    public Gg_tree(String id) {
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

        public String getPid() {
    return this.pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
        this.isset_pid = true;
    }

    public boolean isEmptyPid() {
        return this.pid == null;
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

        public String getBt() {
    return this.bt;
    }

    public void setBt(String bt) {
        this.bt = bt;
        this.isset_bt = true;
    }

    public boolean isEmptyBt() {
        return this.bt == null;
    }

        public String getLj() {
    return this.lj;
    }

    public void setLj(String lj) {
        this.lj = lj;
        this.isset_lj = true;
    }

    public boolean isEmptyLj() {
        return this.lj == null;
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
        return "gg_tree";
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
        ib.set("pid", this.pid, this.isset_pid);
        ib.set("bs", this.bs, this.isset_bs);
        ib.set("bt", this.bt, this.isset_bt);
        ib.set("lj", this.lj, this.isset_lj);
        ib.set("sxh", this.sxh, this.isset_sxh);
        return ib.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_() {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("pid", this.pid, this.isset_pid);
        ub.set("bs", this.bs, this.isset_bs);
        ub.set("bt", this.bt, this.isset_bt);
        ub.set("lj", this.lj, this.isset_lj);
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
        ub.set("pid", this.pid, this.isset_pid);
        ub.set("bs", this.bs, this.isset_bs);
        ub.set("bt", this.bt, this.isset_bt);
        ub.set("lj", this.lj, this.isset_lj);
        ub.set("sxh", this.sxh, this.isset_sxh);

        return ub.genMapSql(where, parameters);
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getUpdateSql_(String where, Object[] parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("pid", this.pid, this.isset_pid);
        ub.set("bs", this.bs, this.isset_bs);
        ub.set("bt", this.bt, this.isset_bt);
        ub.set("lj", this.lj, this.isset_lj);
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
        return new SqlAndParameters<>("select id, pid, bs, bt, lj, sxh from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, pid, bs, bt, lj, sxh from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Gg_tree mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("pid", this.pid)
                .append("bs", this.bs)
                .append("bt", this.bt)
                .append("lj", this.lj)
                .append("sxh", this.sxh)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Gg_tree clone() {
        try {
            Gg_tree gg_tree = (Gg_tree) super.clone();
            //主键
            if (this.isset_id) {
                gg_tree.setId(this.getId());
            }
            //普通属性
            if (this.isset_pid) {
                gg_tree.setPid(this.getPid());
            }
            if (this.isset_bs) {
                gg_tree.setBs(this.getBs());
            }
            if (this.isset_bt) {
                gg_tree.setBt(this.getBt());
            }
            if (this.isset_lj) {
                gg_tree.setLj(this.getLj());
            }
            if (this.isset_sxh) {
                gg_tree.setSxh(this.getSxh());
            }
            return gg_tree;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}