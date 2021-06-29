package com.example.gamazone_backend.model;

public class Planet {
    private int planetId;
    private String name;
    private int price;
    private String description;
    private String tagline;

    public Planet(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Planet(String name, int price, String description, String tagline) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.tagline = tagline;
    }

    public int getPlanetId() {
        return planetId;
    }

    public void setPlanetId(int planetId) {
        this.planetId = planetId;
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
}
