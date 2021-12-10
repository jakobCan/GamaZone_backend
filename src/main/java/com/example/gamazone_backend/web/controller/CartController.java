package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.data.model.Cart;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RequestMapping("/carts")
public class CartController {

    @GetMapping()
    public ArrayList<Cart> getCart() {
        return null;
    }

    @GetMapping("/{cartId}")
    public Cart getCart(@PathVariable int cartId) {
        return null;
    }

    @PostMapping()
    public void createCart(@RequestBody Cart cart) {
        //create cart
    }

    @PutMapping("/{cartId}")
    public void updateCart(@PathVariable int cartId) {
        //update cart
    }

    @DeleteMapping("/{cartId}")
    public void deleteCart(@PathVariable int cartId) {
        //delete planet
    }
}
