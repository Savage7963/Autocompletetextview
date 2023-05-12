package com.example.firstapplication.autocompletetextview;

import java.io.Serializable;

public class ItemsModal implements Serializable {
    private int image;
    private String name;

    private String description;


    public ItemsModal(int image,String name, String description ) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
