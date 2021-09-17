package com.example.gamazone_backend.data.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Cart {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private ArrayList<Planet> planet;
    private int totalSum;
    private int numberOfItems;
    private int cartId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cart() {
    }

    public Cart(ArrayList<Planet> planet, int totalSum, int numberOfItems, int cartId) {
        this.planet = planet;
        this.totalSum = totalSum;
        this.numberOfItems = numberOfItems;
        this.cartId = cartId;
    }

    public ArrayList<Planet> getPlanet() {
        return planet;
    }

    public void setPlanet(ArrayList<Planet> planet) {
        this.planet = planet;
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

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }
}
