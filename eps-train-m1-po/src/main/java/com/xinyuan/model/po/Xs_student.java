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
 * 表名:XS_STUDENT
 */
public class Xs_student extends BasePo<Xs_student> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Xs_student> ROW_MAPPER = new BeanPropertyRowMapper<>(Xs_student.class);

    // 主键
    private String id = null;
    private boolean isset_id = false;

    // 属性列表
    private String xm = null;
    private boolean isset_xm = false;

    private Integer xb = null;
    private boolean isset_xb = false;

    private Integer csrq = null;
    private boolean isset_csrq = false;

    private Integer rxrq = null;
    private boolean isset_rxrq = false;

    private String jtzz = null;
    private boolean isset_jtzz = false;

    private String xh = null;
    private boolean isset_xh = false;

    private String bz = null;
    private boolean isset_bz = false;

    private String njbh = null;
    private boolean isset_njbh = false;

    private String njmc = null;
    private boolean isset_njmc = false;

    private String tjr = null;
    private boolean isset_tjr = false;

    private Long tjsj = null;
    private boolean isset_tjsj = false;

    private String fj = null;
    private boolean isset_fj = false;

    private String km = null;
    private boolean isset_km = false;

    private String kmmc = null;
    private boolean isset_kmmc = false;

    /**
     * 默认构造函数
     */
    public Xs_student() {
    }

    /**
     * 根据主键构造对象
     */
    public Xs_student(String id) {
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

    public Integer getRxrq() {
        return this.rxrq;
    }

    public void setRxrq(Integer rxrq) {
        this.rxrq = rxrq;
        this.isset_rxrq = true;
    }

    public boolean isEmptyRxrq() {
        return this.rxrq == null;
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

    public String getNjbh() {
        return this.njbh;
    }

    public void setNjbh(String njbh) {
        this.njbh = njbh;
        this.isset_njbh = true;
    }

    public boolean isEmptyNjbh() {
        return this.njbh == null || this.njbh.length() == 0;
    }

    public String getNjmc() {
        return this.njmc;
    }

    public void setNjmc(String njmc) {
        this.njmc = njmc;
        this.isset_njmc = true;
    }

    public boolean isEmptyNjmc() {
        return this.njmc == null || this.njmc.length() == 0;
    }

    public String getTjr() {
        return this.tjr;
    }

    public void setTjr(String tjr) {
        this.tjr = tjr;
        this.isset_tjr = true;
    }

    public boolean isEmptyTjr() {
        return this.tjr == null || this.tjr.length() == 0;
    }

    public Long getTjsj() {
        return this.tjsj;
    }

    public void setTjsj(Long tjsj) {
        this.tjsj = tjsj;
        this.isset_tjsj = true;
    }

    public boolean isEmptyTjsj() {
        return this.tjsj == null;
    }

    public String getFj() {
        return this.fj;
    }

    public void setFj(String fj) {
        this.fj = fj;
        this.isset_fj = true;
    }

    public boolean isEmptyFj() {
        return this.fj == null || this.fj.length() == 0;
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
        return "XS_STUDENT";
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
        ib.set("csrq", this.csrq, this.isset_csrq);
        ib.set("rxrq", this.rxrq, this.isset_rxrq);
        ib.set("jtzz", this.jtzz, this.isset_jtzz);
        ib.set("xh", this.xh, this.isset_xh);
        ib.set("bz", this.bz, this.isset_bz);
        ib.set("njbh", this.njbh, this.isset_njbh);
        ib.set("njmc", this.njmc, this.isset_njmc);
        ib.set("tjr", this.tjr, this.isset_tjr);
        ib.set("tjsj", this.tjsj, this.isset_tjsj);
        ib.set("fj", this.fj, this.isset_fj);
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
        ub.set("csrq", this.csrq, this.isset_csrq);
        ub.set("rxrq", this.rxrq, this.isset_rxrq);
        ub.set("jtzz", this.jtzz, this.isset_jtzz);
        ub.set("xh", this.xh, this.isset_xh);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("njbh", this.njbh, this.isset_njbh);
        ub.set("njmc", this.njmc, this.isset_njmc);
        ub.set("tjr", this.tjr, this.isset_tjr);
        ub.set("tjsj", this.tjsj, this.isset_tjsj);
        ub.set("fj", this.fj, this.isset_fj);
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
        ub.set("csrq", this.csrq, this.isset_csrq);
        ub.set("rxrq", this.rxrq, this.isset_rxrq);
        ub.set("jtzz", this.jtzz, this.isset_jtzz);
        ub.set("xh", this.xh, this.isset_xh);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("njbh", this.njbh, this.isset_njbh);
        ub.set("njmc", this.njmc, this.isset_njmc);
        ub.set("tjr", this.tjr, this.isset_tjr);
        ub.set("tjsj", this.tjsj, this.isset_tjsj);
        ub.set("fj", this.fj, this.isset_fj);
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
        ub.set("csrq", this.csrq, this.isset_csrq);
        ub.set("rxrq", this.rxrq, this.isset_rxrq);
        ub.set("jtzz", this.jtzz, this.isset_jtzz);
        ub.set("xh", this.xh, this.isset_xh);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("njbh", this.njbh, this.isset_njbh);
        ub.set("njmc", this.njmc, this.isset_njmc);
        ub.set("tjr", this.tjr, this.isset_tjr);
        ub.set("tjsj", this.tjsj, this.isset_tjsj);
        ub.set("fj", this.fj, this.isset_fj);
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
        return new SqlAndParameters<>("select id, xm, xb, csrq, rxrq, jtzz, xh, bz, njbh, njmc, tjr, tjsj, fj, km, kmmc from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, xm, xb, csrq, rxrq, jtzz, xh, bz, njbh, njmc, tjr, tjsj, fj, km, kmmc from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Xs_student mapRow(ResultSet rs, int i) throws SQLException {
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
                .append("csrq", this.csrq)
                .append("rxrq", this.rxrq)
                .append("jtzz", this.jtzz)
                .append("xh", this.xh)
                .append("bz", this.bz)
                .append("njbh", this.njbh)
                .append("njmc", this.njmc)
                .append("tjr", this.tjr)
                .append("tjsj", this.tjsj)
                .append("fj", this.fj)
                .append("km", this.km)
                .append("kmmc", this.kmmc)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Xs_student clone() {
        try {
            Xs_student xs_student = (Xs_student) super.clone();
            //主键
            if (this.isset_id) {
                xs_student.setId(this.getId());
            }
            //普通属性
            if (this.isset_xm) {
                xs_student.setXm(this.getXm());
            }
            if (this.isset_xb) {
                xs_student.setXb(this.getXb());
            }
            if (this.isset_csrq) {
                xs_student.setCsrq(this.getCsrq());
            }
            if (this.isset_rxrq) {
                xs_student.setRxrq(this.getRxrq());
            }
            if (this.isset_jtzz) {
                xs_student.setJtzz(this.getJtzz());
            }
            if (this.isset_xh) {
                xs_student.setXh(this.getXh());
            }
            if (this.isset_bz) {
                xs_student.setBz(this.getBz());
            }
            if (this.isset_njbh) {
                xs_student.setNjbh(this.getNjbh());
            }
            if (this.isset_njmc) {
                xs_student.setNjmc(this.getNjmc());
            }
            if (this.isset_tjr) {
                xs_student.setTjr(this.getTjr());
            }
            if (this.isset_tjsj) {
                xs_student.setTjsj(this.getTjsj());
            }
            if (this.isset_fj) {
                xs_student.setFj(this.getFj());
            }
            if (this.isset_km) {
                xs_student.setKm(this.getKm());
            }
            if (this.isset_kmmc) {
                xs_student.setKmmc(this.getKmmc());
            }
            return xs_student;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}