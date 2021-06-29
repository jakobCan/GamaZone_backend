package com.example.gamazone_backend.controller;

import com.example.gamazone_backend.model.Cart;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping()
    public ArrayList<Cart> getCart(){
        return null;
    }

    @GetMapping("/{cartId}")
    public Cart getCart(@PathVariable int cartId){
        return null;
    }

    @PostMapping()
    public void createCart(@RequestBody Cart cart){
        //create cart
    }

    @PutMapping("/{cartId}")
    public void uppdatedCart(@PathVariable int cartId){
        //update cart
    }
    @DeleteMapping("/{cartId}")
    public void deleteCart(@PathVariable int cartId){
        //delete planet
    }



}
