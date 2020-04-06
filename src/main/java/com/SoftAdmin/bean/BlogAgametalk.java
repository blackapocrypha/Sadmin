package com.SoftAdmin.bean;

public class BlogAgametalk {
    private Integer btid;

    private String tname;

    private Integer kissid;

    private String talktime;

    private String talk;

    private String imgurl;

    public Integer getBtid() {
        return btid;
    }

    public void setBtid(Integer btid) {
        this.btid = btid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getKissid() {
        return kissid;
    }

    public void setKissid(Integer kissid) {
        this.kissid = kissid;
    }

    public String getTalktime() {
        return talktime;
    }

    public void setTalktime(String talktime) {
        this.talktime = talktime == null ? null : talktime.trim();
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk == null ? null : talk.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}