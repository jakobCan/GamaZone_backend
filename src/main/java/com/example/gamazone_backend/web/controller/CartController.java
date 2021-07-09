package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.data.model.Cart;
import com.example.gamazone_backend.web.api.CartApi;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RequestMapping("/carts")
public class CartController implements CartApi {

    @Override
    @GetMapping()
    public ArrayList<Cart> getCart() {
        return null;
    }

    @Override
    @GetMapping("/{cartId}")
    public Cart getCart(@PathVariable int cartId) {
        return null;
    }

    @Override
    @PostMapping()
    public void createCart(@RequestBody Cart cart) {
        //create cart
    }

    @Override
    @PutMapping("/{cartId}")
    public void updateCart(@PathVariable int cartId) {
        //update cart
    }

    @Override
    @DeleteMapping("/{cartId}")
    public void deleteCart(@PathVariable int cartId) {
        //delete planet
    }

}
