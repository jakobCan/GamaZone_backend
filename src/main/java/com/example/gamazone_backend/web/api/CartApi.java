package com.example.gamazone_backend.web.api;

import com.example.gamazone_backend.data.model.Cart;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public interface CartApi {

    /**
     * Returns all created carts
     * @return carts as ArrayList
     */
    ArrayList<Cart> getCart();

    /**
     * Returns a specific cart
     * @param cartId the id of the requested cart
     * @return the requested cart
     */
    Cart getCart(@PathVariable int cartId);

    /**
     * creates a new cart
     * @param cart the cart to be created
     */
    void createCart(@RequestBody Cart cart);

    /**
     * updates a specific cart
     * @param cartId the id of the specified cart
     */
    void updateCart(@PathVariable int cartId);

    /**
     * deletes a specific cart
     * @param cartId id of the requested cart
     */
    void deleteCart(@PathVariable int cartId);
}
