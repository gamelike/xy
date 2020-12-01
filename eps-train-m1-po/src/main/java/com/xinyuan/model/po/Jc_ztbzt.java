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
 * 表名:JC_ZTBZT
 */
public class Jc_ztbzt extends BasePo<Jc_ztbzt> {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    public static final RowMapper<Jc_ztbzt> ROW_MAPPER = new BeanPropertyRowMapper<>(Jc_ztbzt.class);

    // 主键
    private String id = null;
    private boolean isset_id = false;

    // 属性列表
    private String logo = null;
    private boolean isset_logo = false;

    private String ztmc = null;
    private boolean isset_ztmc = false;

    private String ztlb = null;
    private boolean isset_ztlb = false;

    private String ztzjlx = null;
    private boolean isset_ztzjlx = false;

    private String ztdm = null;
    private boolean isset_ztdm = false;

    private String ztjs = null;
    private boolean isset_ztjs = false;

    private String frmc = null;
    private boolean isset_frmc = false;

    private String frjglb = null;
    private boolean isset_frjglb = false;

    private String frlxdh = null;
    private boolean isset_frlxdh = false;

    private String zjlx = null;
    private boolean isset_zjlx = false;

    private String zjhm = null;
    private boolean isset_zjhm = false;

    private String zxdj = null;
    private boolean isset_zxdj = false;

    private String gbdq = null;
    private boolean isset_gbdq = false;

    private String jgdz = null;
    private boolean isset_jgdz = false;

    private String xzqy = null;
    private boolean isset_xzqy = false;

    private java.math.BigDecimal zczb = null;
    private boolean isset_zczb = false;

    private String bz = null;
    private boolean isset_bz = false;

    private String zbdw = null;
    private boolean isset_zbdw = false;

    private String lxr = null;
    private boolean isset_lxr = false;

    private String lxrdh = null;
    private boolean isset_lxrdh = false;

    private String lxrdz = null;
    private boolean isset_lxrdz = false;

    private String dwwz = null;
    private boolean isset_dwwz = false;

    private String yzbm = null;
    private boolean isset_yzbm = false;

    private String dzyx = null;
    private boolean isset_dzyx = false;

    private String frywzt = null;
    private boolean isset_frywzt = false;

    private String jyfw = null;
    private boolean isset_jyfw = false;

    private String cz = null;
    private boolean isset_cz = false;

    private String aqscxkz = null;
    private boolean isset_aqscxkz = false;

    private Integer clrq = null;
    private boolean isset_clrq = false;

    private String jj = null;
    private boolean isset_jj = false;

    private Integer zt = null;
    private boolean isset_zt = false;

    private String jgbh = null;
    private boolean isset_jgbh = false;

    private Long xgsj = null;
    private boolean isset_xgsj = false;

    private Long cjsj = null;
    private boolean isset_cjsj = false;

    private String bz1 = null;
    private boolean isset_bz1 = false;

    private String bz2 = null;
    private boolean isset_bz2 = false;

    private String bz3 = null;
    private boolean isset_bz3 = false;

    private String ztjc = null;
    private boolean isset_ztjc = false;

    private String gssyz = null;
    private boolean isset_gssyz = false;

    private String gysxz = null;
    private boolean isset_gysxz = false;

    private String ryid = null;
    private boolean isset_ryid = false;

    /**
     * 默认构造函数
     */
    public Jc_ztbzt() {
    }

    /**
     * 根据主键构造对象
     */
    public Jc_ztbzt(String id) {
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

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
        this.isset_logo = true;
    }

    public boolean isEmptyLogo() {
        return this.logo == null || this.logo.length() == 0;
    }

    public String getZtmc() {
        return this.ztmc;
    }

    public void setZtmc(String ztmc) {
        this.ztmc = ztmc;
        this.isset_ztmc = true;
    }

    public boolean isEmptyZtmc() {
        return this.ztmc == null || this.ztmc.length() == 0;
    }

    public String getZtlb() {
        return this.ztlb;
    }

    public void setZtlb(String ztlb) {
        this.ztlb = ztlb;
        this.isset_ztlb = true;
    }

    public boolean isEmptyZtlb() {
        return this.ztlb == null || this.ztlb.length() == 0;
    }

    public String getZtzjlx() {
        return this.ztzjlx;
    }

    public void setZtzjlx(String ztzjlx) {
        this.ztzjlx = ztzjlx;
        this.isset_ztzjlx = true;
    }

    public boolean isEmptyZtzjlx() {
        return this.ztzjlx == null || this.ztzjlx.length() == 0;
    }

    public String getZtdm() {
        return this.ztdm;
    }

    public void setZtdm(String ztdm) {
        this.ztdm = ztdm;
        this.isset_ztdm = true;
    }

    public boolean isEmptyZtdm() {
        return this.ztdm == null || this.ztdm.length() == 0;
    }

    public String getZtjs() {
        return this.ztjs;
    }

    public void setZtjs(String ztjs) {
        this.ztjs = ztjs;
        this.isset_ztjs = true;
    }

    public boolean isEmptyZtjs() {
        return this.ztjs == null || this.ztjs.length() == 0;
    }

    public String getFrmc() {
        return this.frmc;
    }

    public void setFrmc(String frmc) {
        this.frmc = frmc;
        this.isset_frmc = true;
    }

    public boolean isEmptyFrmc() {
        return this.frmc == null || this.frmc.length() == 0;
    }

    public String getFrjglb() {
        return this.frjglb;
    }

    public void setFrjglb(String frjglb) {
        this.frjglb = frjglb;
        this.isset_frjglb = true;
    }

    public boolean isEmptyFrjglb() {
        return this.frjglb == null || this.frjglb.length() == 0;
    }

    public String getFrlxdh() {
        return this.frlxdh;
    }

    public void setFrlxdh(String frlxdh) {
        this.frlxdh = frlxdh;
        this.isset_frlxdh = true;
    }

    public boolean isEmptyFrlxdh() {
        return this.frlxdh == null || this.frlxdh.length() == 0;
    }

    public String getZjlx() {
        return this.zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
        this.isset_zjlx = true;
    }

    public boolean isEmptyZjlx() {
        return this.zjlx == null || this.zjlx.length() == 0;
    }

    public String getZjhm() {
        return this.zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
        this.isset_zjhm = true;
    }

    public boolean isEmptyZjhm() {
        return this.zjhm == null || this.zjhm.length() == 0;
    }

    public String getZxdj() {
        return this.zxdj;
    }

    public void setZxdj(String zxdj) {
        this.zxdj = zxdj;
        this.isset_zxdj = true;
    }

    public boolean isEmptyZxdj() {
        return this.zxdj == null || this.zxdj.length() == 0;
    }

    public String getGbdq() {
        return this.gbdq;
    }

    public void setGbdq(String gbdq) {
        this.gbdq = gbdq;
        this.isset_gbdq = true;
    }

    public boolean isEmptyGbdq() {
        return this.gbdq == null || this.gbdq.length() == 0;
    }

    public String getJgdz() {
        return this.jgdz;
    }

    public void setJgdz(String jgdz) {
        this.jgdz = jgdz;
        this.isset_jgdz = true;
    }

    public boolean isEmptyJgdz() {
        return this.jgdz == null || this.jgdz.length() == 0;
    }

    public String getXzqy() {
        return this.xzqy;
    }

    public void setXzqy(String xzqy) {
        this.xzqy = xzqy;
        this.isset_xzqy = true;
    }

    public boolean isEmptyXzqy() {
        return this.xzqy == null || this.xzqy.length() == 0;
    }

    public java.math.BigDecimal getZczb() {
        return this.zczb;
    }

    public void setZczb(java.math.BigDecimal zczb) {
        this.zczb = zczb;
        this.isset_zczb = true;
    }

    public boolean isEmptyZczb() {
        return this.zczb == null;
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

    public String getZbdw() {
        return this.zbdw;
    }

    public void setZbdw(String zbdw) {
        this.zbdw = zbdw;
        this.isset_zbdw = true;
    }

    public boolean isEmptyZbdw() {
        return this.zbdw == null || this.zbdw.length() == 0;
    }

    public String getLxr() {
        return this.lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
        this.isset_lxr = true;
    }

    public boolean isEmptyLxr() {
        return this.lxr == null || this.lxr.length() == 0;
    }

    public String getLxrdh() {
        return this.lxrdh;
    }

    public void setLxrdh(String lxrdh) {
        this.lxrdh = lxrdh;
        this.isset_lxrdh = true;
    }

    public boolean isEmptyLxrdh() {
        return this.lxrdh == null || this.lxrdh.length() == 0;
    }

    public String getLxrdz() {
        return this.lxrdz;
    }

    public void setLxrdz(String lxrdz) {
        this.lxrdz = lxrdz;
        this.isset_lxrdz = true;
    }

    public boolean isEmptyLxrdz() {
        return this.lxrdz == null || this.lxrdz.length() == 0;
    }

    public String getDwwz() {
        return this.dwwz;
    }

    public void setDwwz(String dwwz) {
        this.dwwz = dwwz;
        this.isset_dwwz = true;
    }

    public boolean isEmptyDwwz() {
        return this.dwwz == null || this.dwwz.length() == 0;
    }

    public String getYzbm() {
        return this.yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
        this.isset_yzbm = true;
    }

    public boolean isEmptyYzbm() {
        return this.yzbm == null || this.yzbm.length() == 0;
    }

    public String getDzyx() {
        return this.dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
        this.isset_dzyx = true;
    }

    public boolean isEmptyDzyx() {
        return this.dzyx == null || this.dzyx.length() == 0;
    }

    public String getFrywzt() {
        return this.frywzt;
    }

    public void setFrywzt(String frywzt) {
        this.frywzt = frywzt;
        this.isset_frywzt = true;
    }

    public boolean isEmptyFrywzt() {
        return this.frywzt == null || this.frywzt.length() == 0;
    }

    public String getJyfw() {
        return this.jyfw;
    }

    public void setJyfw(String jyfw) {
        this.jyfw = jyfw;
        this.isset_jyfw = true;
    }

    public boolean isEmptyJyfw() {
        return this.jyfw == null || this.jyfw.length() == 0;
    }

    public String getCz() {
        return this.cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
        this.isset_cz = true;
    }

    public boolean isEmptyCz() {
        return this.cz == null || this.cz.length() == 0;
    }

    public String getAqscxkz() {
        return this.aqscxkz;
    }

    public void setAqscxkz(String aqscxkz) {
        this.aqscxkz = aqscxkz;
        this.isset_aqscxkz = true;
    }

    public boolean isEmptyAqscxkz() {
        return this.aqscxkz == null || this.aqscxkz.length() == 0;
    }

    public Integer getClrq() {
        return this.clrq;
    }

    public void setClrq(Integer clrq) {
        this.clrq = clrq;
        this.isset_clrq = true;
    }

    public boolean isEmptyClrq() {
        return this.clrq == null;
    }

    public String getJj() {
        return this.jj;
    }

    public void setJj(String jj) {
        this.jj = jj;
        this.isset_jj = true;
    }

    public boolean isEmptyJj() {
        return this.jj == null || this.jj.length() == 0;
    }

    public Integer getZt() {
        return this.zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
        this.isset_zt = true;
    }

    public boolean isEmptyZt() {
        return this.zt == null;
    }

    public String getJgbh() {
        return this.jgbh;
    }

    public void setJgbh(String jgbh) {
        this.jgbh = jgbh;
        this.isset_jgbh = true;
    }

    public boolean isEmptyJgbh() {
        return this.jgbh == null || this.jgbh.length() == 0;
    }

    public Long getXgsj() {
        return this.xgsj;
    }

    public void setXgsj(Long xgsj) {
        this.xgsj = xgsj;
        this.isset_xgsj = true;
    }

    public boolean isEmptyXgsj() {
        return this.xgsj == null;
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

    public String getBz1() {
        return this.bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1;
        this.isset_bz1 = true;
    }

    public boolean isEmptyBz1() {
        return this.bz1 == null || this.bz1.length() == 0;
    }

    public String getBz2() {
        return this.bz2;
    }

    public void setBz2(String bz2) {
        this.bz2 = bz2;
        this.isset_bz2 = true;
    }

    public boolean isEmptyBz2() {
        return this.bz2 == null || this.bz2.length() == 0;
    }

    public String getBz3() {
        return this.bz3;
    }

    public void setBz3(String bz3) {
        this.bz3 = bz3;
        this.isset_bz3 = true;
    }

    public boolean isEmptyBz3() {
        return this.bz3 == null || this.bz3.length() == 0;
    }

    public String getZtjc() {
        return this.ztjc;
    }

    public void setZtjc(String ztjc) {
        this.ztjc = ztjc;
        this.isset_ztjc = true;
    }

    public boolean isEmptyZtjc() {
        return this.ztjc == null || this.ztjc.length() == 0;
    }

    public String getGssyz() {
        return this.gssyz;
    }

    public void setGssyz(String gssyz) {
        this.gssyz = gssyz;
        this.isset_gssyz = true;
    }

    public boolean isEmptyGssyz() {
        return this.gssyz == null || this.gssyz.length() == 0;
    }

    public String getGysxz() {
        return this.gysxz;
    }

    public void setGysxz(String gysxz) {
        this.gysxz = gysxz;
        this.isset_gysxz = true;
    }

    public boolean isEmptyGysxz() {
        return this.gysxz == null || this.gysxz.length() == 0;
    }

    public String getRyid() {
        return this.ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
        this.isset_ryid = true;
    }

    public boolean isEmptyRyid() {
        return this.ryid == null || this.ryid.length() == 0;
    }


    /**
     * 获取表名
     */
    @Override
    public String getTableName_() {
        return "JC_ZTBZT";
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
        ib.set("logo", this.logo, this.isset_logo);
        ib.set("ztmc", this.ztmc, this.isset_ztmc);
        ib.set("ztlb", this.ztlb, this.isset_ztlb);
        ib.set("ztzjlx", this.ztzjlx, this.isset_ztzjlx);
        ib.set("ztdm", this.ztdm, this.isset_ztdm);
        ib.set("ztjs", this.ztjs, this.isset_ztjs);
        ib.set("frmc", this.frmc, this.isset_frmc);
        ib.set("frjglb", this.frjglb, this.isset_frjglb);
        ib.set("frlxdh", this.frlxdh, this.isset_frlxdh);
        ib.set("zjlx", this.zjlx, this.isset_zjlx);
        ib.set("zjhm", this.zjhm, this.isset_zjhm);
        ib.set("zxdj", this.zxdj, this.isset_zxdj);
        ib.set("gbdq", this.gbdq, this.isset_gbdq);
        ib.set("jgdz", this.jgdz, this.isset_jgdz);
        ib.set("xzqy", this.xzqy, this.isset_xzqy);
        ib.set("zczb", this.zczb, this.isset_zczb);
        ib.set("bz", this.bz, this.isset_bz);
        ib.set("zbdw", this.zbdw, this.isset_zbdw);
        ib.set("lxr", this.lxr, this.isset_lxr);
        ib.set("lxrdh", this.lxrdh, this.isset_lxrdh);
        ib.set("lxrdz", this.lxrdz, this.isset_lxrdz);
        ib.set("dwwz", this.dwwz, this.isset_dwwz);
        ib.set("yzbm", this.yzbm, this.isset_yzbm);
        ib.set("dzyx", this.dzyx, this.isset_dzyx);
        ib.set("frywzt", this.frywzt, this.isset_frywzt);
        ib.set("jyfw", this.jyfw, this.isset_jyfw);
        ib.set("cz", this.cz, this.isset_cz);
        ib.set("aqscxkz", this.aqscxkz, this.isset_aqscxkz);
        ib.set("clrq", this.clrq, this.isset_clrq);
        ib.set("jj", this.jj, this.isset_jj);
        ib.set("zt", this.zt, this.isset_zt);
        ib.set("jgbh", this.jgbh, this.isset_jgbh);
        ib.set("xgsj", this.xgsj, this.isset_xgsj);
        ib.set("cjsj", this.cjsj, this.isset_cjsj);
        ib.set("bz1", this.bz1, this.isset_bz1);
        ib.set("bz2", this.bz2, this.isset_bz2);
        ib.set("bz3", this.bz3, this.isset_bz3);
        ib.set("ztjc", this.ztjc, this.isset_ztjc);
        ib.set("gssyz", this.gssyz, this.isset_gssyz);
        ib.set("gysxz", this.gysxz, this.isset_gysxz);
        ib.set("ryid", this.ryid, this.isset_ryid);
        return ib.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_() {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("logo", this.logo, this.isset_logo);
        ub.set("ztmc", this.ztmc, this.isset_ztmc);
        ub.set("ztlb", this.ztlb, this.isset_ztlb);
        ub.set("ztzjlx", this.ztzjlx, this.isset_ztzjlx);
        ub.set("ztdm", this.ztdm, this.isset_ztdm);
        ub.set("ztjs", this.ztjs, this.isset_ztjs);
        ub.set("frmc", this.frmc, this.isset_frmc);
        ub.set("frjglb", this.frjglb, this.isset_frjglb);
        ub.set("frlxdh", this.frlxdh, this.isset_frlxdh);
        ub.set("zjlx", this.zjlx, this.isset_zjlx);
        ub.set("zjhm", this.zjhm, this.isset_zjhm);
        ub.set("zxdj", this.zxdj, this.isset_zxdj);
        ub.set("gbdq", this.gbdq, this.isset_gbdq);
        ub.set("jgdz", this.jgdz, this.isset_jgdz);
        ub.set("xzqy", this.xzqy, this.isset_xzqy);
        ub.set("zczb", this.zczb, this.isset_zczb);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("zbdw", this.zbdw, this.isset_zbdw);
        ub.set("lxr", this.lxr, this.isset_lxr);
        ub.set("lxrdh", this.lxrdh, this.isset_lxrdh);
        ub.set("lxrdz", this.lxrdz, this.isset_lxrdz);
        ub.set("dwwz", this.dwwz, this.isset_dwwz);
        ub.set("yzbm", this.yzbm, this.isset_yzbm);
        ub.set("dzyx", this.dzyx, this.isset_dzyx);
        ub.set("frywzt", this.frywzt, this.isset_frywzt);
        ub.set("jyfw", this.jyfw, this.isset_jyfw);
        ub.set("cz", this.cz, this.isset_cz);
        ub.set("aqscxkz", this.aqscxkz, this.isset_aqscxkz);
        ub.set("clrq", this.clrq, this.isset_clrq);
        ub.set("jj", this.jj, this.isset_jj);
        ub.set("zt", this.zt, this.isset_zt);
        ub.set("jgbh", this.jgbh, this.isset_jgbh);
        ub.set("xgsj", this.xgsj, this.isset_xgsj);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("bz1", this.bz1, this.isset_bz1);
        ub.set("bz2", this.bz2, this.isset_bz2);
        ub.set("bz3", this.bz3, this.isset_bz3);
        ub.set("ztjc", this.ztjc, this.isset_ztjc);
        ub.set("gssyz", this.gssyz, this.isset_gssyz);
        ub.set("gysxz", this.gysxz, this.isset_gysxz);
        ub.set("ryid", this.ryid, this.isset_ryid);
        ub.where(this.getPkName_(), this.getPkValue_());
        return ub.genMapSql();
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Map<String, Object>> getUpdateSql_(String where, Map<String, Object> parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("logo", this.logo, this.isset_logo);
        ub.set("ztmc", this.ztmc, this.isset_ztmc);
        ub.set("ztlb", this.ztlb, this.isset_ztlb);
        ub.set("ztzjlx", this.ztzjlx, this.isset_ztzjlx);
        ub.set("ztdm", this.ztdm, this.isset_ztdm);
        ub.set("ztjs", this.ztjs, this.isset_ztjs);
        ub.set("frmc", this.frmc, this.isset_frmc);
        ub.set("frjglb", this.frjglb, this.isset_frjglb);
        ub.set("frlxdh", this.frlxdh, this.isset_frlxdh);
        ub.set("zjlx", this.zjlx, this.isset_zjlx);
        ub.set("zjhm", this.zjhm, this.isset_zjhm);
        ub.set("zxdj", this.zxdj, this.isset_zxdj);
        ub.set("gbdq", this.gbdq, this.isset_gbdq);
        ub.set("jgdz", this.jgdz, this.isset_jgdz);
        ub.set("xzqy", this.xzqy, this.isset_xzqy);
        ub.set("zczb", this.zczb, this.isset_zczb);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("zbdw", this.zbdw, this.isset_zbdw);
        ub.set("lxr", this.lxr, this.isset_lxr);
        ub.set("lxrdh", this.lxrdh, this.isset_lxrdh);
        ub.set("lxrdz", this.lxrdz, this.isset_lxrdz);
        ub.set("dwwz", this.dwwz, this.isset_dwwz);
        ub.set("yzbm", this.yzbm, this.isset_yzbm);
        ub.set("dzyx", this.dzyx, this.isset_dzyx);
        ub.set("frywzt", this.frywzt, this.isset_frywzt);
        ub.set("jyfw", this.jyfw, this.isset_jyfw);
        ub.set("cz", this.cz, this.isset_cz);
        ub.set("aqscxkz", this.aqscxkz, this.isset_aqscxkz);
        ub.set("clrq", this.clrq, this.isset_clrq);
        ub.set("jj", this.jj, this.isset_jj);
        ub.set("zt", this.zt, this.isset_zt);
        ub.set("jgbh", this.jgbh, this.isset_jgbh);
        ub.set("xgsj", this.xgsj, this.isset_xgsj);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("bz1", this.bz1, this.isset_bz1);
        ub.set("bz2", this.bz2, this.isset_bz2);
        ub.set("bz3", this.bz3, this.isset_bz3);
        ub.set("ztjc", this.ztjc, this.isset_ztjc);
        ub.set("gssyz", this.gssyz, this.isset_gssyz);
        ub.set("gysxz", this.gysxz, this.isset_gysxz);
        ub.set("ryid", this.ryid, this.isset_ryid);

        return ub.genMapSql(where, parameters);
    }

    /**
     * 获取更新语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getUpdateSql_(String where, Object[] parameters) {
        UpdateBuilder ub = new UpdateBuilder(this.getTableName_());
        ub.set("logo", this.logo, this.isset_logo);
        ub.set("ztmc", this.ztmc, this.isset_ztmc);
        ub.set("ztlb", this.ztlb, this.isset_ztlb);
        ub.set("ztzjlx", this.ztzjlx, this.isset_ztzjlx);
        ub.set("ztdm", this.ztdm, this.isset_ztdm);
        ub.set("ztjs", this.ztjs, this.isset_ztjs);
        ub.set("frmc", this.frmc, this.isset_frmc);
        ub.set("frjglb", this.frjglb, this.isset_frjglb);
        ub.set("frlxdh", this.frlxdh, this.isset_frlxdh);
        ub.set("zjlx", this.zjlx, this.isset_zjlx);
        ub.set("zjhm", this.zjhm, this.isset_zjhm);
        ub.set("zxdj", this.zxdj, this.isset_zxdj);
        ub.set("gbdq", this.gbdq, this.isset_gbdq);
        ub.set("jgdz", this.jgdz, this.isset_jgdz);
        ub.set("xzqy", this.xzqy, this.isset_xzqy);
        ub.set("zczb", this.zczb, this.isset_zczb);
        ub.set("bz", this.bz, this.isset_bz);
        ub.set("zbdw", this.zbdw, this.isset_zbdw);
        ub.set("lxr", this.lxr, this.isset_lxr);
        ub.set("lxrdh", this.lxrdh, this.isset_lxrdh);
        ub.set("lxrdz", this.lxrdz, this.isset_lxrdz);
        ub.set("dwwz", this.dwwz, this.isset_dwwz);
        ub.set("yzbm", this.yzbm, this.isset_yzbm);
        ub.set("dzyx", this.dzyx, this.isset_dzyx);
        ub.set("frywzt", this.frywzt, this.isset_frywzt);
        ub.set("jyfw", this.jyfw, this.isset_jyfw);
        ub.set("cz", this.cz, this.isset_cz);
        ub.set("aqscxkz", this.aqscxkz, this.isset_aqscxkz);
        ub.set("clrq", this.clrq, this.isset_clrq);
        ub.set("jj", this.jj, this.isset_jj);
        ub.set("zt", this.zt, this.isset_zt);
        ub.set("jgbh", this.jgbh, this.isset_jgbh);
        ub.set("xgsj", this.xgsj, this.isset_xgsj);
        ub.set("cjsj", this.cjsj, this.isset_cjsj);
        ub.set("bz1", this.bz1, this.isset_bz1);
        ub.set("bz2", this.bz2, this.isset_bz2);
        ub.set("bz3", this.bz3, this.isset_bz3);
        ub.set("ztjc", this.ztjc, this.isset_ztjc);
        ub.set("gssyz", this.gssyz, this.isset_gssyz);
        ub.set("gysxz", this.gysxz, this.isset_gysxz);
        ub.set("ryid", this.ryid, this.isset_ryid);

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
        return new SqlAndParameters<>("select id, logo, ztmc, ztlb, ztzjlx, ztdm, ztjs, frmc, frjglb, frlxdh, zjlx, zjhm, zxdj, gbdq, jgdz, xzqy, zczb, bz, zbdw, lxr, lxrdh, lxrdz, dwwz, yzbm, dzyx, frywzt, jyfw, cz, aqscxkz, clrq, jj, zt, jgbh, xgsj, cjsj, bz1, bz2, bz3, ztjc, gssyz, gysxz, ryid from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 获取查询语句和参数
     */
    @Override
    public SqlAndParameters<Object[]> getSelectSql_(String where, Object[] parameters) {
        return new SqlAndParameters<>("select id, logo, ztmc, ztlb, ztzjlx, ztdm, ztjs, frmc, frjglb, frlxdh, zjlx, zjhm, zxdj, gbdq, jgdz, xzqy, zczb, bz, zbdw, lxr, lxrdh, lxrdz, dwwz, yzbm, dzyx, frywzt, jyfw, cz, aqscxkz, clrq, jj, zt, jgbh, xgsj, cjsj, bz1, bz2, bz3, ztjc, gssyz, gysxz, ryid from " + this.getTableName_() + " " + where, parameters);
    }

    /**
     * 将resultset的一行转化为po
     */
    @Override
    public Jc_ztbzt mapRow(ResultSet rs, int i) throws SQLException {
        return ROW_MAPPER.mapRow(rs, i);
    }

    /**
     * 重写 toString() 方法
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", this.id)
                .append("logo", this.logo)
                .append("ztmc", this.ztmc)
                .append("ztlb", this.ztlb)
                .append("ztzjlx", this.ztzjlx)
                .append("ztdm", this.ztdm)
                .append("ztjs", this.ztjs)
                .append("frmc", this.frmc)
                .append("frjglb", this.frjglb)
                .append("frlxdh", this.frlxdh)
                .append("zjlx", this.zjlx)
                .append("zjhm", this.zjhm)
                .append("zxdj", this.zxdj)
                .append("gbdq", this.gbdq)
                .append("jgdz", this.jgdz)
                .append("xzqy", this.xzqy)
                .append("zczb", this.zczb)
                .append("bz", this.bz)
                .append("zbdw", this.zbdw)
                .append("lxr", this.lxr)
                .append("lxrdh", this.lxrdh)
                .append("lxrdz", this.lxrdz)
                .append("dwwz", this.dwwz)
                .append("yzbm", this.yzbm)
                .append("dzyx", this.dzyx)
                .append("frywzt", this.frywzt)
                .append("jyfw", this.jyfw)
                .append("cz", this.cz)
                .append("aqscxkz", this.aqscxkz)
                .append("clrq", this.clrq)
                .append("jj", this.jj)
                .append("zt", this.zt)
                .append("jgbh", this.jgbh)
                .append("xgsj", this.xgsj)
                .append("cjsj", this.cjsj)
                .append("bz1", this.bz1)
                .append("bz2", this.bz2)
                .append("bz3", this.bz3)
                .append("ztjc", this.ztjc)
                .append("gssyz", this.gssyz)
                .append("gysxz", this.gysxz)
                .append("ryid", this.ryid)
                .toString();
    }

    /**
     * 克隆
     */
    @Override
    public Jc_ztbzt clone() {
        try {
            Jc_ztbzt jc_ztbzt = (Jc_ztbzt) super.clone();
            //主键
            if (this.isset_id) {
                jc_ztbzt.setId(this.getId());
            }
            //普通属性
            if (this.isset_logo) {
                jc_ztbzt.setLogo(this.getLogo());
            }
            if (this.isset_ztmc) {
                jc_ztbzt.setZtmc(this.getZtmc());
            }
            if (this.isset_ztlb) {
                jc_ztbzt.setZtlb(this.getZtlb());
            }
            if (this.isset_ztzjlx) {
                jc_ztbzt.setZtzjlx(this.getZtzjlx());
            }
            if (this.isset_ztdm) {
                jc_ztbzt.setZtdm(this.getZtdm());
            }
            if (this.isset_ztjs) {
                jc_ztbzt.setZtjs(this.getZtjs());
            }
            if (this.isset_frmc) {
                jc_ztbzt.setFrmc(this.getFrmc());
            }
            if (this.isset_frjglb) {
                jc_ztbzt.setFrjglb(this.getFrjglb());
            }
            if (this.isset_frlxdh) {
                jc_ztbzt.setFrlxdh(this.getFrlxdh());
            }
            if (this.isset_zjlx) {
                jc_ztbzt.setZjlx(this.getZjlx());
            }
            if (this.isset_zjhm) {
                jc_ztbzt.setZjhm(this.getZjhm());
            }
            if (this.isset_zxdj) {
                jc_ztbzt.setZxdj(this.getZxdj());
            }
            if (this.isset_gbdq) {
                jc_ztbzt.setGbdq(this.getGbdq());
            }
            if (this.isset_jgdz) {
                jc_ztbzt.setJgdz(this.getJgdz());
            }
            if (this.isset_xzqy) {
                jc_ztbzt.setXzqy(this.getXzqy());
            }
            if (this.isset_zczb) {
                jc_ztbzt.setZczb(this.getZczb());
            }
            if (this.isset_bz) {
                jc_ztbzt.setBz(this.getBz());
            }
            if (this.isset_zbdw) {
                jc_ztbzt.setZbdw(this.getZbdw());
            }
            if (this.isset_lxr) {
                jc_ztbzt.setLxr(this.getLxr());
            }
            if (this.isset_lxrdh) {
                jc_ztbzt.setLxrdh(this.getLxrdh());
            }
            if (this.isset_lxrdz) {
                jc_ztbzt.setLxrdz(this.getLxrdz());
            }
            if (this.isset_dwwz) {
                jc_ztbzt.setDwwz(this.getDwwz());
            }
            if (this.isset_yzbm) {
                jc_ztbzt.setYzbm(this.getYzbm());
            }
            if (this.isset_dzyx) {
                jc_ztbzt.setDzyx(this.getDzyx());
            }
            if (this.isset_frywzt) {
                jc_ztbzt.setFrywzt(this.getFrywzt());
            }
            if (this.isset_jyfw) {
                jc_ztbzt.setJyfw(this.getJyfw());
            }
            if (this.isset_cz) {
                jc_ztbzt.setCz(this.getCz());
            }
            if (this.isset_aqscxkz) {
                jc_ztbzt.setAqscxkz(this.getAqscxkz());
            }
            if (this.isset_clrq) {
                jc_ztbzt.setClrq(this.getClrq());
            }
            if (this.isset_jj) {
                jc_ztbzt.setJj(this.getJj());
            }
            if (this.isset_zt) {
                jc_ztbzt.setZt(this.getZt());
            }
            if (this.isset_jgbh) {
                jc_ztbzt.setJgbh(this.getJgbh());
            }
            if (this.isset_xgsj) {
                jc_ztbzt.setXgsj(this.getXgsj());
            }
            if (this.isset_cjsj) {
                jc_ztbzt.setCjsj(this.getCjsj());
            }
            if (this.isset_bz1) {
                jc_ztbzt.setBz1(this.getBz1());
            }
            if (this.isset_bz2) {
                jc_ztbzt.setBz2(this.getBz2());
            }
            if (this.isset_bz3) {
                jc_ztbzt.setBz3(this.getBz3());
            }
            if (this.isset_ztjc) {
                jc_ztbzt.setZtjc(this.getZtjc());
            }
            if (this.isset_gssyz) {
                jc_ztbzt.setGssyz(this.getGssyz());
            }
            if (this.isset_gysxz) {
                jc_ztbzt.setGysxz(this.getGysxz());
            }
            if (this.isset_ryid) {
                jc_ztbzt.setRyid(this.getRyid());
            }
            return jc_ztbzt;
        } catch (Exception e) {
            throw new MisException(e);
        }
    }
}