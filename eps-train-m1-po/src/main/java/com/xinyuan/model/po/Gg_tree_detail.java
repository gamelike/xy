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
 * 表名:gg_tree_detail
 */
public class Gg_tree_detail extends BasePo<Gg_tree_detail> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Gg_tree_detail> ROW_MAPPER = new BeanPropertyRowMapper<>(Gg_tree_detail.class);

        // 主键
    private String id = null;
    private boolean isset_id = false;

        // 属性列表
    private String treeid = null;
    private boolean isset_treeid = false;

    private String danhwb = null;
    private boolean isset_danhwb = false;

    private String duohwb = null;
    private boolean isset_duohwb = false;

    private Integer dxk = null;
    private boolean isset_dxk = false;

    private Long rqsj = null;
    private boolean isset_rqsj = false;

    private String fxk = null;
    private boolean isset_fxk = false;

    private String xlk = null;
    private boolean isset_xlk = false;

    private String xlkdx = null;
    private boolean isset_xlkdx = false;

    private String ry = null;
    private boolean isset_ry = false;

    private String rymc = null;
    private boolean isset_rymc = false;

    private String jg = null;
    private boolean isset_jg = false;

    private String jgmc = null;
    private boolean isset_jgmc = false;

    private String qy = null;
    private boolean isset_qy = false;

    private String qydx = null;
    private boolean isset_qydx = false;

    private String fj = null;
    private boolean isset_fj = false;

    private Integer sxh = null;
    private boolean isset_sxh = false;

    /**
    * 默认构造函数
    */
    public Gg_tree_detail() {
    }

    /**
    * 根据主键构造对象
    */
    public Gg_tree_detail(String id) {
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

        public String getTreeid() {
    return this.treeid;
    }

    public void setTreeid(String treeid) {
        this.treeid = treeid;
        this.isset_treeid = true;
    }

    public boolean isEmptyTreeid() {
        return this.treeid == null;
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

        public String getRy() {
    return this.ry;
    }

    public void setRy(String ry) {
        this.ry = ry;
        this.isset_ry = true;
    }

    public boolean isEmptyRy() {
        return this.ry == null;
    }

        public String getRymc() {
    return this.rymc;
    }

    public void setRymc(String rymc) {
        this.rymc = rymc;
        this.isset_rymc = true;
    }

    public boolean isEmptyRymc() {
        return this.rymc == null;
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
        return "gg_tree_detail";
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
        ib.set("treeid", this.treeid, this.isset_treeid);
        ib.set("danhwb", this.danhwb, this.isset_danhwb);
        ib.set("duohwb", this.duohwb, this.isset_duohwb);
        ib.set("dxk", this.dxk, this.isset_dxk);
        ib.set("rqsj", this.rqsj, this.isset_rqsj);
        ib.set("fxk", this.fxk, this.isset_fxk);
        ib.set("xlk", this.xlk, this.isset_xlk);
        ib.set("xlkdx", this.xlkdx, this.isset_xlkdx);
        ib.set("ry", this.ry, this.isset_ry);
        ib.set("rymc", this.rymc, this.isset_rymc);
        ib.set("jg", this.jg, this.isset_jg);
        ib.set("jgmc", this.jgmc, this.isset_jgmc);
        ib.set("qy", this.qy, this.isset_qy);
        ib.set("qydx", this.qydx, this.isset_qydx);
        ib.set("fj", this.fj, this.isset_fj);
        ib.set("sxh", this.sxh, this.isset_sxh);
        return ib.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_() {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("treeid", this.treeid, this.isset_treeid);
        ub.set("danhwb", this.danhwb, this.isset_danhwb);
        ub.set("duohwb", this.duohwb, this.isset_duohwb);
        ub.set("dxk", this.dxk, this.isset_dxk);
        ub.set("rqsj", this.rqsj, this.isset_rqsj);
        ub.set("fxk", this.fxk, this.isset_fxk);
        ub.set("xlk", this.xlk, this.isset_xlk);
        ub.set("xlkdx", this.xlkdx, this.isset_xlkdx);
        ub.set("ry", this.ry, this.isset_ry);
        ub.set("rymc", this.rymc, this.isset_rymc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("fj", this.fj, this.isset_fj);
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
        ub.set("treeid", this.treeid, this.isset_treeid);
        ub.set("danhwb", this.danhwb, this.isset_danhwb);
        ub.set("duohwb", this.duohwb, this.isset_duohwb);
        ub.set("dxk", this.dxk, this.isset_dxk);
        ub.set("rqsj", this.rqsj, this.isset_rqsj);
        ub.set("fxk", this.fxk, this.isset_fxk);
        ub.set("xlk", this.xlk, this.isset_xlk);
        ub.set("xlkdx", this.xlkdx, this.isset_xlkdx);
        ub.set("ry", this.ry, this.isset_ry);
        ub.set("rymc", this.rymc, this.isset_rymc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("fj", this.fj, this.isset_fj);
        ub.set("sxh", this.sxh, this.isset_sxh);

        return ub.genMapSql(where, parameters);
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getUpdateSql_(String where, Object[] parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("treeid", this.treeid, this.isset_treeid);
        ub.set("danhwb", this.danhwb, this.isset_danhwb);
        ub.set("duohwb", this.duohwb, this.isset_duohwb);
        ub.set("dxk", this.dxk, this.isset_dxk);
        ub.set("rqsj", this.rqsj, this.isset_rqsj);
        ub.set("fxk", this.fxk, this.isset_fxk);
        ub.set("xlk", this.xlk, this.isset_xlk);
        ub.set("xlkdx", this.xlkdx, this.isset_xlkdx);
        ub.set("ry", this.ry, this.isset_ry);
        ub.set("rymc", this.rymc, this.isset_rymc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("fj", this.fj, this.isset_fj);
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
        return new SqlAndParameters<>("select id, treeid, danhwb, duohwb, dxk, rqsj, fxk, xlk, xlkdx, ry, rymc, jg, jgmc, qy, qydx, fj, sxh from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, treeid, danhwb, duohwb, dxk, rqsj, fxk, xlk, xlkdx, ry, rymc, jg, jgmc, qy, qydx, fj, sxh from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Gg_tree_detail mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("treeid", this.treeid)
                .append("danhwb", this.danhwb)
                .append("duohwb", this.duohwb)
                .append("dxk", this.dxk)
                .append("rqsj", this.rqsj)
                .append("fxk", this.fxk)
                .append("xlk", this.xlk)
                .append("xlkdx", this.xlkdx)
                .append("ry", this.ry)
                .append("rymc", this.rymc)
                .append("jg", this.jg)
                .append("jgmc", this.jgmc)
                .append("qy", this.qy)
                .append("qydx", this.qydx)
                .append("fj", this.fj)
                .append("sxh", this.sxh)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Gg_tree_detail clone() {
        try {
            Gg_tree_detail gg_tree_detail = (Gg_tree_detail) super.clone();
            //主键
            if (this.isset_id) {
                gg_tree_detail.setId(this.getId());
            }
            //普通属性
            if (this.isset_treeid) {
                gg_tree_detail.setTreeid(this.getTreeid());
            }
            if (this.isset_danhwb) {
                gg_tree_detail.setDanhwb(this.getDanhwb());
            }
            if (this.isset_duohwb) {
                gg_tree_detail.setDuohwb(this.getDuohwb());
            }
            if (this.isset_dxk) {
                gg_tree_detail.setDxk(this.getDxk());
            }
            if (this.isset_rqsj) {
                gg_tree_detail.setRqsj(this.getRqsj());
            }
            if (this.isset_fxk) {
                gg_tree_detail.setFxk(this.getFxk());
            }
            if (this.isset_xlk) {
                gg_tree_detail.setXlk(this.getXlk());
            }
            if (this.isset_xlkdx) {
                gg_tree_detail.setXlkdx(this.getXlkdx());
            }
            if (this.isset_ry) {
                gg_tree_detail.setRy(this.getRy());
            }
            if (this.isset_rymc) {
                gg_tree_detail.setRymc(this.getRymc());
            }
            if (this.isset_jg) {
                gg_tree_detail.setJg(this.getJg());
            }
            if (this.isset_jgmc) {
                gg_tree_detail.setJgmc(this.getJgmc());
            }
            if (this.isset_qy) {
                gg_tree_detail.setQy(this.getQy());
            }
            if (this.isset_qydx) {
                gg_tree_detail.setQydx(this.getQydx());
            }
            if (this.isset_fj) {
                gg_tree_detail.setFj(this.getFj());
            }
            if (this.isset_sxh) {
                gg_tree_detail.setSxh(this.getSxh());
            }
            return gg_tree_detail;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}