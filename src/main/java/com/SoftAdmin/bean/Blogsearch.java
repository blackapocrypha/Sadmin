package com.SoftAdmin.bean;

public class Blogsearch {
    private Integer blogid;

    private String blogweb;

    private String blogname;

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public String getBlogweb() {
        return blogweb;
    }

    public void setBlogweb(String blogweb) {
        this.blogweb = blogweb == null ? null : blogweb.trim();
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname == null ? null : blogname.trim();
    }
}