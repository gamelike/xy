package com.xinyuan.model.to;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;


/**
 * 表名:TEACHER
 */
public class Teacher_t implements Serializable {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    // 主键
    private String id = null;

    // 属性列表
    private String xm = null;

    private Integer xb = null;

    private String lxfs = null;

    private String zgxl = null;

    private Integer csny = null;

    private String jtzz = null;

    private String zc = null;

    private String bz = null;

    /**
     * 默认构造函数
     */
    public Teacher_t() {
    }

    /**
     * 根据主键构造对象
     */
    public Teacher_t(String id) {
        this.setId(id);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXm() {
        return this.xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public Integer getXb() {
        return this.xb;
    }

    public void setXb(Integer xb) {
        this.xb = xb;
    }

    public String getLxfs() {
        return this.lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public String getZgxl() {
        return this.zgxl;
    }

    public void setZgxl(String zgxl) {
        this.zgxl = zgxl;
    }

    public Integer getCsny() {
        return this.csny;
    }

    public void setCsny(Integer csny) {
        this.csny = csny;
    }

    public String getJtzz() {
        return this.jtzz;
    }

    public void setJtzz(String jtzz) {
        this.jtzz = jtzz;
    }

    public String getZc() {
        return this.zc;
    }

    public void setZc(String zc) {
        this.zc = zc;
    }

    public String getBz() {
        return this.bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
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
                .append("csny", this.csny)
                .append("jtzz", this.jtzz)
                .append("zc", this.zc)
                .append("bz", this.bz)
                .toString();
    }
}