package com.SoftAdmin.bean;

public class Ufaver {
    private String usernamer;

    private Integer uid;

    private String tim;

    private String dis;

    public String getUsernamer() {
        return usernamer;
    }

    public void setUsernamer(String usernamer) {
        this.usernamer = usernamer == null ? null : usernamer.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim == null ? null : tim.trim();
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis == null ? null : dis.trim();
    }
}