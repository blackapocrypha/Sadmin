package com.SoftAdmin.bean;

public class Softlist {
    private Integer sid;

    private String softname;

    private String softtype;

    private String imgurl;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSoftname() {
        return softname;
    }

    public void setSoftname(String softname) {
        this.softname = softname == null ? null : softname.trim();
    }

    public String getSofttype() {
        return softtype;
    }

    public void setSofttype(String softtype) {
        this.softtype = softtype == null ? null : softtype.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}