package com.example.gamazone_backend.data.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class SpaceObject {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;
    private int price;
    private String description;
    private String tagline;
    private String type;    //Kategorie (moon, planet, ...)
    private String picture; // TODO: 15.10.2021 String ok?

    public SpaceObject() {

    }

    public SpaceObject(String name, int price, String description, String tagline, String type) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.tagline = tagline;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}