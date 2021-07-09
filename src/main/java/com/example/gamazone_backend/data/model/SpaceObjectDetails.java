package com.example.gamazone_backend.data.model;

import java.util.ArrayList;

public class SpaceObjectDetails {
    private int id;
    private String name;
    private int price;
    private String description;
    private String tagline;
    private ArrayList<Category> categories;


    public SpaceObjectDetails(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public SpaceObjectDetails(String name, int price, String description, String tagline) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.tagline = tagline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
