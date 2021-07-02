package com.example.gamazone_backend.controller;

import com.example.gamazone_backend.model.Cart;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cart")
public class CartController {

    /**
     * Returns all created carts
     * @return carts as ArrayList
     */
    @GetMapping()
    public ArrayList<Cart> getCart(){
        return null;
    }

    /**
     * Returns a specific cart
     * @param cartId the id of the requested cart
     * @return the requested cart
     */
    @GetMapping("/{cartId}")
    public Cart getCart(@PathVariable int cartId){
        return null;
    }

    /**
     * creates a new cart
     * @param cart the cart to be created
     */
    @PostMapping()
    public void createCart(@RequestBody Cart cart){
        //create cart
    }

    /**
     * updates a specific cart
     * @param cartId the id of the specified cart
     */
    @PutMapping("/{cartId}")
    public void updateCart(@PathVariable int cartId){
        //update cart
    }

    /**
     * deletes a specific cart
     * @param cartId id of the requested cart
     */
    @DeleteMapping("/{cartId}")
    public void deleteCart(@PathVariable int cartId){
        //delete planet
    }



}
