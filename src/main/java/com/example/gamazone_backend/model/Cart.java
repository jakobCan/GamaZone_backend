package com.example.gamazone_backend.model;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Planet> planet;
    private int totalSum;
    private int numberOfItems;
    private int cartId;

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
