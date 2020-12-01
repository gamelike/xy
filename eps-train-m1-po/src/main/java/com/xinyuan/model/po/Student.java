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
 * 表名:STUDENT
 */
public class Student extends BasePo<Student> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Student> ROW_MAPPER = new BeanPropertyRowMapper<>(Student.class);

    // 主键
    private String id = null;
    private boolean isset_id = false;

    // 属性列表
    private String xm = null;
    private boolean isset_xm = false;

    private Integer xb = null;
    private boolean isset_xb = false;

    private String jsid = null;
    private boolean isset_jsid = false;

    private String xh = null;
    private boolean isset_xh = false;

    private String zz = null;
    private boolean isset_zz = false;

    private Integer zy = null;
    private boolean isset_zy = false;

    private String lxfs = null;
    private boolean isset_lxfs = false;

    private Integer csny = null;
    private boolean isset_csny = false;

    private Integer rxsj = null;
    private boolean isset_rxsj = false;

    private String bz = null;
    private boolean isset_bz = false;

    /**
     * 默认构造函数
     */
    public Student() {
    }

    /**
     * 根据主键构造对象
     */
    public Student(String id) {
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

    public String getJsid() {
        return this.jsid;
    }

    public void setJsid(String jsid) {
        this.jsid = jsid;
        this.isset_jsid = true;
    }

    public boolean isEmptyJsid() {
        return this.jsid == null || this.jsid.length() == 0;
    }

    public String getXh() {
        return this.xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
        this.isset_xh = true;
    }

    public boolean isEmptyXh() {
        return this.xh == null || this.xh.length() == 0;
    }

    public String getZz() {
        return this.zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
        this.isset_zz = true;
    }

    public boolean isEmptyZz() {
        return this.zz == null || this.zz.length() == 0;
    }

    public Integer getZy() {
        return this.zy;
    }

    public void setZy(Integer zy) {
        this.zy = zy;
        this.isset_zy = true;
    }

    public boolean isEmptyZy() {
        return this.zy == null;
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

    public Integer getCsny() {
        return this.csny;
    }

    public void setCsny(Integer csny) {
        this.csny = csny;
        this.isset_csny = true;
    }

    public boolean isEmptyCsny() {
        return this.csny == null;
    }

    public Integer getRxsj() {
        return this.rxsj;
    }

    public void setRxsj(Integer rxsj) {
        this.rxsj = rxsj;
        this.isset_rxsj = true;
    }

    public boolean isEmptyRxsj() {
        return this.rxsj == null;
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


    /**
     * 获取表名
     */
    @Override
    public String getTableName_() {
        return "STUDENT";
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
        ib.set("jsid", this.jsid, this.isset_jsid);
        ib.set("xh", this.xh, this.isset_xh);
        ib.set("zz", this.zz, this.isset_zz);
        ib.set("zy", this.zy, this.isset_zy);
        ib.set("lxfs", this.lxfs, this.isset_lxfs);
        ib.set("csny", this.csny, this.isset_csny);
        ib.set("rxsj", this.rxsj, this.isset_rxsj);
        ib.set("bz", this.bz, this.isset_bz);
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
        ub.set("jsid", this.jsid, this.isset_jsid);
        ub.set("xh", this.xh, this.isset_xh);
        ub.set("zz", this.zz, this.isset_zz);
        ub.set("zy", this.zy, this.isset_zy);
        ub.set("lxfs", this.lxfs, this.isset_lxfs);
        ub.set("csny", this.csny, this.isset_csny);
        ub.set("rxsj", this.rxsj, this.isset_rxsj);
        ub.set("bz", this.bz, this.isset_bz);
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
        ub.set("jsid", this.jsid, this.isset_jsid);
        ub.set("xh", this.xh, this.isset_xh);
        ub.set("zz", this.zz, this.isset_zz);
        ub.set("zy", this.zy, this.isset_zy);
        ub.set("lxfs", this.lxfs, this.isset_lxfs);
        ub.set("csny", this.csny, this.isset_csny);
        ub.set("rxsj", this.rxsj, this.isset_rxsj);
        ub.set("bz", this.bz, this.isset_bz);

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
        ub.set("jsid", this.jsid, this.isset_jsid);
        ub.set("xh", this.xh, this.isset_xh);
        ub.set("zz", this.zz, this.isset_zz);
        ub.set("zy", this.zy, this.isset_zy);
        ub.set("lxfs", this.lxfs, this.isset_lxfs);
        ub.set("csny", this.csny, this.isset_csny);
        ub.set("rxsj", this.rxsj, this.isset_rxsj);
        ub.set("bz", this.bz, this.isset_bz);

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
        return new SqlAndParameters<>("select id, xm, xb, jsid, xh, zz, zy, lxfs, csny, rxsj, bz from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, xm, xb, jsid, xh, zz, zy, lxfs, csny, rxsj, bz from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
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
                .append("jsid", this.jsid)
                .append("xh", this.xh)
                .append("zz", this.zz)
                .append("zy", this.zy)
                .append("lxfs", this.lxfs)
                .append("csny", this.csny)
                .append("rxsj", this.rxsj)
                .append("bz", this.bz)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Student clone() {
        try {
            Student student = (Student) super.clone();
            //主键
            if (this.isset_id) {
                student.setId(this.getId());
            }
            //普通属性
            if (this.isset_xm) {
                student.setXm(this.getXm());
            }
            if (this.isset_xb) {
                student.setXb(this.getXb());
            }
            if (this.isset_jsid) {
                student.setJsid(this.getJsid());
            }
            if (this.isset_xh) {
                student.setXh(this.getXh());
            }
            if (this.isset_zz) {
                student.setZz(this.getZz());
            }
            if (this.isset_zy) {
                student.setZy(this.getZy());
            }
            if (this.isset_lxfs) {
                student.setLxfs(this.getLxfs());
            }
            if (this.isset_csny) {
                student.setCsny(this.getCsny());
            }
            if (this.isset_rxsj) {
                student.setRxsj(this.getRxsj());
            }
            if (this.isset_bz) {
                student.setBz(this.getBz());
            }
            return student;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}