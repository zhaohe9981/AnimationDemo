package com.xiaoniu.animation.transition;

import java.io.Serializable;

public class NewBean implements Serializable {

    private int iconId;
    private String title;
    private String description;

    public NewBean() {
    }

    public NewBean(int iconId, String title, String descrition) {
        this.iconId = iconId;
        this.title = title;
        this.description = descrition;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
