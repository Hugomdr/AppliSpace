package com.example.applispace.model;

import com.google.gson.annotations.SerializedName;

public class Planet {
    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription(){return description;}
}
