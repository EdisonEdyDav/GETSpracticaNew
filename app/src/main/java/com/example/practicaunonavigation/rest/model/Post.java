package com.example.practicaunonavigation.rest.model;

import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("title")
    private String Tittle;

    @SerializedName("description")
    private String Description;

    @SerializedName("url_image")
    private String UrlImage;


    public String getTittle() {
        return Tittle;
    }

    public String getDescription() {
        return Description;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public Post(String tittle, String description, String urlImage) {
        Tittle = tittle;
        Description = description;
        UrlImage = urlImage;
    }





}
