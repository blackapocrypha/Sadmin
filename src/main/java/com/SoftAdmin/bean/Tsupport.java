package com.SoftAdmin.bean;

public class Tsupport {
    private Integer tid;

    private String tname;

    private String ttype;

    private String ttypetwo;

    private String turl;

    private String tdis;

    private String tenglist;

    private String imgurl;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype == null ? null : ttype.trim();
    }

    public String getTtypetwo() {
        return ttypetwo;
    }

    public void setTtypetwo(String ttypetwo) {
        this.ttypetwo = ttypetwo == null ? null : ttypetwo.trim();
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl == null ? null : turl.trim();
    }

    public String getTdis() {
        return tdis;
    }

    public void setTdis(String tdis) {
        this.tdis = tdis == null ? null : tdis.trim();
    }

    public String getTenglist() {
        return tenglist;
    }

    public void setTenglist(String tenglist) {
        this.tenglist = tenglist == null ? null : tenglist.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}