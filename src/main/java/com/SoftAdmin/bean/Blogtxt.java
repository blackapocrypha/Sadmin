package com.SoftAdmin.bean;

public class Blogtxt {
    private Integer nid;

    private String appname;

    private String appimgurl;

    private String appdis;

    private String appdownurl;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public String getAppimgurl() {
        return appimgurl;
    }

    public void setAppimgurl(String appimgurl) {
        this.appimgurl = appimgurl == null ? null : appimgurl.trim();
    }

    public String getAppdis() {
        return appdis;
    }

    public void setAppdis(String appdis) {
        this.appdis = appdis == null ? null : appdis.trim();
    }

    public String getAppdownurl() {
        return appdownurl;
    }

    public void setAppdownurl(String appdownurl) {
        this.appdownurl = appdownurl == null ? null : appdownurl.trim();
    }
}