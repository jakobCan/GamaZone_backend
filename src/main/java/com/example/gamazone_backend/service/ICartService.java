package com.example.gamazone_backend.service;

import com.example.gamazone_backend.model.CartItem;

import java.util.List;

public interface ICartService {
    List<CartItem> getItems(String username);
    CartItem addSpaceObject(String productName, int quantity, String username);
    public void emptyCart(String username);
    double getTotalCost(String username);
}
