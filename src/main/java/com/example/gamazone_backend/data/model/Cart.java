package com.example.gamazone_backend.data.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Cart {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private ArrayList<SpaceObject> spaceObjects;
    // TODO: 15.10.2021 wie löst man das Problem? OneToMany oder embeddable?
    private int totalSum;
    private int numberOfItems;  // TODO: 15.10.2021 brauchen wir eigentlich nicht, weil spaceObjects.length?

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cart() {
    }

    public Cart(ArrayList<SpaceObject> spaceObjects, int totalSum, int numberOfItems) {
        this.spaceObjects = spaceObjects;
        this.totalSum = totalSum;
        this.numberOfItems = numberOfItems;
    }

    public ArrayList<SpaceObject> getPlanet() {
        return spaceObjects;
    }

    public void setPlanet(ArrayList<SpaceObject> planet) {
        this.spaceObjects = planet;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
}

