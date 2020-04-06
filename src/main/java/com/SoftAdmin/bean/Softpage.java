package com.SoftAdmin.bean;

public class Softpage {
    private Integer softid;

    private String url;

    private String softname;

    private String disline;

    public Integer getSoftid() {
        return softid;
    }

    public void setSoftid(Integer softid) {
        this.softid = softid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getSoftname() {
        return softname;
    }

    public void setSoftname(String softname) {
        this.softname = softname == null ? null : softname.trim();
    }

    public String getDisline() {
        return disline;
    }

    public void setDisline(String disline) {
        this.disline = disline == null ? null : disline.trim();
    }
}