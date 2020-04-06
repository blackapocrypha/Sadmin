package com.SoftAdmin.bean;

public class Blogtools {
    private Integer nid;

    private String webname;

    private String weburl;

    private String webdis;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl == null ? null : weburl.trim();
    }

    public String getWebdis() {
        return webdis;
    }

    public void setWebdis(String webdis) {
        this.webdis = webdis == null ? null : webdis.trim();
    }
}