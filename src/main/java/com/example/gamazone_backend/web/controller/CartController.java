package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.model.CartItem;
import com.example.gamazone_backend.repository.CartItemRepository;
import com.example.gamazone_backend.repository.SpaceObjectRepository;
import com.example.gamazone_backend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "Http://localhost:8080")
@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    private CartItemRepository cartItemRepository;


    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping(value="/items", method=RequestMethod.GET)
    public List<CartItem> getItems()
    {
        return cartService.getItems(cartService.currentUserName());
    }

    @RequestMapping(value="/add/{product}/{quantity}", method=RequestMethod.POST)
    public CartItem addSpaceObject(@PathVariable String product, @PathVariable int quantity)
    {
        return cartService.addSpaceObject(product, quantity, cartService.currentUserName());
    }

    @RequestMapping(value="/empty", method=RequestMethod.GET)
    public void emptyCart()
    {
        cartService.emptyCart(cartService.currentUserName());
    }

    @DeleteMapping(value="/delete/{itemId}")
    public void deleteCartItem(@PathVariable Long itemId){
        //CartItem cartItem = cartItemRepository.findBySpaceObject(itemId);
        cartItemRepository.deleteById(itemId);
    }

    @RequestMapping(value="/cost", method=RequestMethod.GET)
    public double getTotalCost()
    {
        return cartService.getTotalCost(cartService.currentUserName());
    }


}
