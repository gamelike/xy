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
 * 表名:gg_student
 */
public class Gg_student extends BasePo<Gg_student> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Gg_student> ROW_MAPPER = new BeanPropertyRowMapper<>(Gg_student.class);

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

    private Long code = null;
    private boolean isset_code = false;

    private String fid = null;
    private boolean isset_fid = false;

    private String qydx = null;
    private boolean isset_qydx = false;

    private Integer age = null;
    private boolean isset_age = false;

    /**
    * 默认构造函数
    */
    public Gg_student() {
    }

    /**
    * 根据主键构造对象
    */
    public Gg_student(String id) {
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

        public String getname() {
    return this.name;
    }

    public void setname(String name) {
        this.name = name;
        this.isset_name = true;
    }

    public boolean isEmptyname() {
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

        public Long getCode() {
    return this.code;
    }

    public void setCode(Long code) {
        this.code = code;
        this.isset_code = true;
    }

    public boolean isEmptyCode() {
        return this.code == null;
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

        public Integer getAge() {
    return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
        this.isset_age = true;
    }

    public boolean isEmptyAge() {
        return this.age == null;
    }


    /**
     * 获取表名
     */
    @Override
    public String getTableName_() {
        return "gg_student";
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
        ib.set("cjr", this.cjr, this.isset_cjr);
        ib.set("cjrmc", this.cjrmc, this.isset_cjrmc);
        ib.set("cjsj", this.cjsj, this.isset_cjsj);
        ib.set("sxh", this.sxh, this.isset_sxh);
        ib.set("pic", this.pic, this.isset_pic);
        ib.set("fj", this.fj, this.isset_fj);
        ib.set("code", this.code, this.isset_code);
        ib.set("fid", this.fid, this.isset_fid);
        ib.set("qydx", this.qydx, this.isset_qydx);
        ib.set("age", this.age, this.isset_age);
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
        ub.set("cjr", this.cjr, this.isset_cjr);
        ub.set("cjrmc", this.cjrmc, this.isset_cjrmc);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("pic", this.pic, this.isset_pic);
        ub.set("fj", this.fj, this.isset_fj);
        ub.set("code", this.code, this.isset_code);
        ub.set("fid", this.fid, this.isset_fid);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("age", this.age, this.isset_age);
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
        ub.set("cjr", this.cjr, this.isset_cjr);
        ub.set("cjrmc", this.cjrmc, this.isset_cjrmc);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("pic", this.pic, this.isset_pic);
        ub.set("fj", this.fj, this.isset_fj);
        ub.set("code", this.code, this.isset_code);
        ub.set("fid", this.fid, this.isset_fid);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("age", this.age, this.isset_age);

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
        ub.set("cjr", this.cjr, this.isset_cjr);
        ub.set("cjrmc", this.cjrmc, this.isset_cjrmc);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("sxh", this.sxh, this.isset_sxh);
        ub.set("pic", this.pic, this.isset_pic);
        ub.set("fj", this.fj, this.isset_fj);
        ub.set("code", this.code, this.isset_code);
        ub.set("fid", this.fid, this.isset_fid);
        ub.set("qydx", this.qydx, this.isset_qydx);
        ub.set("age", this.age, this.isset_age);

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
        return new SqlAndParameters<>("select id, name, sex, birthday, beiz, zxtid, hobby, subject, ry, rymc, jg, jgmc, qy, cjr, cjrmc, cjsj, sxh, pic, fj, code, fid, qydx, age from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, name, sex, birthday, beiz, zxtid, hobby, subject, ry, rymc, jg, jgmc, qy, cjr, cjrmc, cjsj, sxh, pic, fj, code, fid, qydx, age from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Gg_student mapRow(ResultSet rs, int i) throws SQLException {
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
                .append("cjr", this.cjr)
                .append("cjrmc", this.cjrmc)
                .append("cjsj", this.cjsj)
                .append("sxh", this.sxh)
                .append("pic", this.pic)
                .append("fj", this.fj)
                .append("code", this.code)
                .append("fid", this.fid)
                .append("qydx", this.qydx)
                .append("age", this.age)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Gg_student clone() {
        try {
            Gg_student gg_student = (Gg_student) super.clone();
            //主键
            if (this.isset_id) {
                gg_student.setId(this.getId());
            }
            //普通属性
            if (this.isset_name) {
                gg_student.setname(this.getname());
            }
            if (this.isset_sex) {
                gg_student.setSex(this.getSex());
            }
            if (this.isset_birthday) {
                gg_student.setBirthday(this.getBirthday());
            }
            if (this.isset_beiz) {
                gg_student.setBeiz(this.getBeiz());
            }
            if (this.isset_zxtid) {
                gg_student.setZxtid(this.getZxtid());
            }
            if (this.isset_hobby) {
                gg_student.setHobby(this.getHobby());
            }
            if (this.isset_subject) {
                gg_student.setSubject(this.getSubject());
            }
            if (this.isset_ry) {
                gg_student.setRy(this.getRy());
            }
            if (this.isset_rymc) {
                gg_student.setRymc(this.getRymc());
            }
            if (this.isset_jg) {
                gg_student.setJg(this.getJg());
            }
            if (this.isset_jgmc) {
                gg_student.setJgmc(this.getJgmc());
            }
            if (this.isset_qy) {
                gg_student.setQy(this.getQy());
            }
            if (this.isset_cjr) {
                gg_student.setCjr(this.getCjr());
            }
            if (this.isset_cjrmc) {
                gg_student.setCjrmc(this.getCjrmc());
            }
            if (this.isset_cjsj) {
                gg_student.setCjsj(this.getCjsj());
            }
            if (this.isset_sxh) {
                gg_student.setSxh(this.getSxh());
            }
            if (this.isset_pic) {
                gg_student.setPic(this.getPic());
            }
            if (this.isset_fj) {
                gg_student.setFj(this.getFj());
            }
            if (this.isset_code) {
                gg_student.setCode(this.getCode());
            }
            if (this.isset_fid) {
                gg_student.setFid(this.getFid());
            }
            if (this.isset_qydx) {
                gg_student.setQydx(this.getQydx());
            }
            if (this.isset_age) {
                gg_student.setAge(this.getAge());
            }
            return gg_student;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}