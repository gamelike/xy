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
 * 表名:kf_dbdth
 */
public class Kf_dbdth extends BasePo<Kf_dbdth> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Kf_dbdth> ROW_MAPPER = new BeanPropertyRowMapper<>(Kf_dbdth.class);

        // 主键
    private String id = null;
    private boolean isset_id = false;

        // 属性列表
    private String name = null;
    private boolean isset_name = false;

    private Integer sex = null;
    private boolean isset_sex = false;

    private Long birthday = null;
    private boolean isset_birthday = false;

    private String beiz = null;
    private boolean isset_beiz = false;

    private String zxtid = null;
    private boolean isset_zxtid = false;

    private String hobby = null;
    private boolean isset_hobby = false;

    private String subject = null;
    private boolean isset_subject = false;

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

    private String cjr = null;
    private boolean isset_cjr = false;

    private String cjrmc = null;
    private boolean isset_cjrmc = false;

    private Long cjsj = null;
    private boolean isset_cjsj = false;

    private Integer sxh = null;
    private boolean isset_sxh = false;

    private String pic = null;
    private boolean isset_pic = false;

    private String fj = null;
    private boolean isset_fj = false;

    private String fid = null;
    private boolean isset_fid = false;

    /**
    * 默认构造函数
    */
    public Kf_dbdth() {
    }

    /**
    * 根据主键构造对象
    */
    public Kf_dbdth(String id) {
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

        public String getName() {
    return this.name;
    }

    public void setName(String name) {
        this.name = name;
        this.isset_name = true;
    }

    public boolean isEmptyName() {
        return this.name == null;
    }

        public Integer getSex() {
    return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
        this.isset_sex = true;
    }

    public boolean isEmptySex() {
        return this.sex == null;
    }

        public Long getBirthday() {
    return this.birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
        this.isset_birthday = true;
    }

    public boolean isEmptyBirthday() {
        return this.birthday == null;
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

        public String getZxtid() {
    return this.zxtid;
    }

    public void setZxtid(String zxtid) {
        this.zxtid = zxtid;
        this.isset_zxtid = true;
    }

    public boolean isEmptyZxtid() {
        return this.zxtid == null;
    }

        public String getHobby() {
    return this.hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
        this.isset_hobby = true;
    }

    public boolean isEmptyHobby() {
        return this.hobby == null;
    }

        public String getSubject() {
    return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
        this.isset_subject = true;
    }

    public boolean isEmptySubject() {
        return this.subject == null;
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

        public String getCjr() {
    return this.cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr;
        this.isset_cjr = true;
    }

    public boolean isEmptyCjr() {
        return this.cjr == null;
    }

        public String getCjrmc() {
    return this.cjrmc;
    }

    public void setCjrmc(String cjrmc) {
        this.cjrmc = cjrmc;
        this.isset_cjrmc = true;
    }

    public boolean isEmptyCjrmc() {
        return this.cjrmc == null;
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

        public String getPic() {
    return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
        this.isset_pic = true;
    }

    public boolean isEmptyPic() {
        return this.pic == null;
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

        public String getFid() {
    return this.fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
        this.isset_fid = true;
    }

    public boolean isEmptyFid() {
        return this.fid == null;
    }


    /**
     * 获取表名
     */
    @Override
    public String getTableName_() {
        return "kf_dbdth";
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
        ib.set("name", this.name, this.isset_name);
        ib.set("sex", this.sex, this.isset_sex);
        ib.set("birthday", this.birthday, this.isset_birthday);
        ib.set("beiz", this.beiz, this.isset_beiz);
        ib.set("zxtid", this.zxtid, this.isset_zxtid);
        ib.set("hobby", this.hobby, this.isset_hobby);
        ib.set("subject", this.subject, this.isset_subject);
        ib.set("ry", this.ry, this.isset_ry);
        ib.set("rymc", this.rymc, this.isset_rymc);
        ib.set("jg", this.jg, this.isset_jg);
        ib.set("jgmc", this.jgmc, this.isset_jgmc);
        ib.set("qy", this.qy, this.isset_qy);
        ib.set("qydx", this.qydx, this.isset_qydx);
        ib.set("cjr", this.cjr, this.isset_cjr);
        ib.set("cjrmc", this.cjrmc, this.isset_cjrmc);
        ib.set("cjsj", this.cjsj, this.isset_cjsj);
        ib.set("sxh", this.sxh, this.isset_sxh);
        ib.set("pic", this.pic, this.isset_pic);
        ib.set("fj", this.fj, this.isset_fj);
        ib.set("fid", this.fid, this.isset_fid);
        return ib.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_() {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("name", this.name, this.isset_name);
        ub.set("sex", this.sex, this.isset_sex);
        ub.set("birthday", this.birthday, this.isset_birthday);
        ub.set("beiz", this.beiz, this.isset_beiz);
        ub.set("zxtid", this.zxtid, this.isset_zxtid);
        ub.set("hobby", this.hobby, this.isset_hobby);
        ub.set("subject", this.subject, this.isset_subject);
        ub.set("ry", this.ry, this.isset_ry);
        ub.set("rymc", this.rymc, this.isset_rymc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("cjr", this.cjr, this.isset_cjr);
        ub.set("cjrmc", this.cjrmc, this.isset_cjrmc);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("pic", this.pic, this.isset_pic);
        ub.set("fj", this.fj, this.isset_fj);
        ub.set("fid", this.fid, this.isset_fid);
        ub.where(this.getPkName_(), this.getPkValue_());
        return ub.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_(String where, Map<String, Object> parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("name", this.name, this.isset_name);
        ub.set("sex", this.sex, this.isset_sex);
        ub.set("birthday", this.birthday, this.isset_birthday);
        ub.set("beiz", this.beiz, this.isset_beiz);
        ub.set("zxtid", this.zxtid, this.isset_zxtid);
        ub.set("hobby", this.hobby, this.isset_hobby);
        ub.set("subject", this.subject, this.isset_subject);
        ub.set("ry", this.ry, this.isset_ry);
        ub.set("rymc", this.rymc, this.isset_rymc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("cjr", this.cjr, this.isset_cjr);
        ub.set("cjrmc", this.cjrmc, this.isset_cjrmc);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("pic", this.pic, this.isset_pic);
        ub.set("fj", this.fj, this.isset_fj);
        ub.set("fid", this.fid, this.isset_fid);

        return ub.genMapSql(where, parameters);
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getUpdateSql_(String where, Object[] parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("name", this.name, this.isset_name);
        ub.set("sex", this.sex, this.isset_sex);
        ub.set("birthday", this.birthday, this.isset_birthday);
        ub.set("beiz", this.beiz, this.isset_beiz);
        ub.set("zxtid", this.zxtid, this.isset_zxtid);
        ub.set("hobby", this.hobby, this.isset_hobby);
        ub.set("subject", this.subject, this.isset_subject);
        ub.set("ry", this.ry, this.isset_ry);
        ub.set("rymc", this.rymc, this.isset_rymc);
        ub.set("jg", this.jg, this.isset_jg);
        ub.set("jgmc", this.jgmc, this.isset_jgmc);
        ub.set("qy", this.qy, this.isset_qy);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("cjr", this.cjr, this.isset_cjr);
        ub.set("cjrmc", this.cjrmc, this.isset_cjrmc);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("pic", this.pic, this.isset_pic);
        ub.set("fj", this.fj, this.isset_fj);
        ub.set("fid", this.fid, this.isset_fid);

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
        return new SqlAndParameters<>("select id, name, sex, birthday, beiz, zxtid, hobby, subject, ry, rymc, jg, jgmc, qy, qydx, cjr, cjrmc, cjsj, sxh, pic, fj, fid from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, name, sex, birthday, beiz, zxtid, hobby, subject, ry, rymc, jg, jgmc, qy, qydx, cjr, cjrmc, cjsj, sxh, pic, fj, fid from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Kf_dbdth mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("name", this.name)
                .append("sex", this.sex)
                .append("birthday", this.birthday)
                .append("beiz", this.beiz)
                .append("zxtid", this.zxtid)
                .append("hobby", this.hobby)
                .append("subject", this.subject)
                .append("ry", this.ry)
                .append("rymc", this.rymc)
                .append("jg", this.jg)
                .append("jgmc", this.jgmc)
                .append("qy", this.qy)
                .append("qydx", this.qydx)
                .append("cjr", this.cjr)
                .append("cjrmc", this.cjrmc)
                .append("cjsj", this.cjsj)
                .append("sxh", this.sxh)
                .append("pic", this.pic)
                .append("fj", this.fj)
                .append("fid", this.fid)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Kf_dbdth clone() {
        try {
            Kf_dbdth kf_dbdth = (Kf_dbdth) super.clone();
            //主键
            if (this.isset_id) {
                kf_dbdth.setId(this.getId());
            }
            //普通属性
            if (this.isset_name) {
                kf_dbdth.setName(this.getName());
            }
            if (this.isset_sex) {
                kf_dbdth.setSex(this.getSex());
            }
            if (this.isset_birthday) {
                kf_dbdth.setBirthday(this.getBirthday());
            }
            if (this.isset_beiz) {
                kf_dbdth.setBeiz(this.getBeiz());
            }
            if (this.isset_zxtid) {
                kf_dbdth.setZxtid(this.getZxtid());
            }
            if (this.isset_hobby) {
                kf_dbdth.setHobby(this.getHobby());
            }
            if (this.isset_subject) {
                kf_dbdth.setSubject(this.getSubject());
            }
            if (this.isset_ry) {
                kf_dbdth.setRy(this.getRy());
            }
            if (this.isset_rymc) {
                kf_dbdth.setRymc(this.getRymc());
            }
            if (this.isset_jg) {
                kf_dbdth.setJg(this.getJg());
            }
            if (this.isset_jgmc) {
                kf_dbdth.setJgmc(this.getJgmc());
            }
            if (this.isset_qy) {
                kf_dbdth.setQy(this.getQy());
            }
            if (this.isset_qydx) {
                kf_dbdth.setQydx(this.getQydx());
            }
            if (this.isset_cjr) {
                kf_dbdth.setCjr(this.getCjr());
            }
            if (this.isset_cjrmc) {
                kf_dbdth.setCjrmc(this.getCjrmc());
            }
            if (this.isset_cjsj) {
                kf_dbdth.setCjsj(this.getCjsj());
            }
            if (this.isset_sxh) {
                kf_dbdth.setSxh(this.getSxh());
            }
            if (this.isset_pic) {
                kf_dbdth.setPic(this.getPic());
            }
            if (this.isset_fj) {
                kf_dbdth.setFj(this.getFj());
            }
            if (this.isset_fid) {
                kf_dbdth.setFid(this.getFid());
            }
            return kf_dbdth;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}