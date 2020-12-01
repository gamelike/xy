package com.xinyuan.model.po;



import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * 表名:STUDENT
 */
public class Student_t implements Serializable {
    // 序列化版本号
    private static final long serialVersionUID = 1L;

    // 主键
    private String id = null;

    // 属性列表
    private String xm = null;

    private Integer xb = null;

    private String jsid = null;

    private String xh = null;

    private String zz = null;

    private Integer zy = null;

    private String lxfs = null;

    private Integer csny = null;

    private Integer rxsj = null;

    private String bz = null;

    /**
     * 默认构造函数
     */
    public Student_t() {
    }

    /**
     * 根据主键构造对象
     */
    public Student_t(String id) {
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

    public String getJsid() {
        return this.jsid;
    }

    public void setJsid(String jsid) {
        this.jsid = jsid;
    }

    public String getXh() {
        return this.xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getZz() {
        return this.zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }

    public Integer getZy() {
        return this.zy;
    }

    public void setZy(Integer zy) {
        this.zy = zy;
    }

    public String getLxfs() {
        return this.lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public Integer getCsny() {
        return this.csny;
    }

    public void setCsny(Integer csny) {
        this.csny = csny;
    }

    public Integer getRxsj() {
        return this.rxsj;
    }

    public void setRxsj(Integer rxsj) {
        this.rxsj = rxsj;
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
}