package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.model.CartItem;
import com.example.gamazone_backend.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = CartController.PATH, produces = CartController.APPLICATION_JSON_VALUE)
public class CartController {

    //	protected static final String PATH = "/0.1/cart";
    protected static final String PATH = "/cart";
    protected static final String APPLICATION_JSON_VALUE = "application/json; charset=utf-8";

    @Autowired
    ICartService cart;

    @RequestMapping(value="/items", method=RequestMethod.GET)
    public List<CartItem> getItems(@RequestParam(value="user", defaultValue="anonymous") String username)
    {
        return cart.getItems(username);
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public CartItem addSpaceObject(@RequestParam(value="spaceObject") String spaceObjectName, @RequestParam(value="qty", defaultValue="1") int quantity,
                                   @RequestParam(value="user", defaultValue="anonymous") String username)
    {
        return cart.addSpaceObject(spaceObjectName, quantity, username);
    }

    @RequestMapping(value="/empty", method=RequestMethod.GET)
    public void emptyCart(@RequestParam(value="user", defaultValue="anonymous") String username)
    {
        cart.emptyCart(username);
    }

    @RequestMapping(value="/cost", method=RequestMethod.GET)
    public double getTotalCost(@RequestParam(value="user", defaultValue="anonymous") String username)
    {
        return cart.getTotalCost(username);
    }
}
