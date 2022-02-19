package com.table.webip.pojo;

public class ImgInfo {
    private String img_name;
    private String path;
    private String visible;

    public String getImg_name() {
        return img_name;
    }

    public void setImg_name(String img_name) {
        this.img_name = img_name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ImgInfo(String img_name, String path) {
        this.img_name = img_name;
        this.path = path;
        this.visible = "true";
    }
}
