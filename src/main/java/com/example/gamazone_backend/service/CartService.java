package com.example.gamazone_backend.service;

import com.example.gamazone_backend.model.Cart;
import com.example.gamazone_backend.model.CartItem;
import com.example.gamazone_backend.model.SpaceObject;
import com.example.gamazone_backend.model.User;
import com.example.gamazone_backend.repository.CartItemRepository;
import com.example.gamazone_backend.repository.SpaceObjectRepository;
import com.example.gamazone_backend.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService{

    private static final Logger log = LoggerFactory.getLogger(CartService.class);

    @Autowired
    private SpaceObjectRepository spaceObjectRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private UserRepository userRepository;

    public List<CartItem> getItems(String username) {
        List<CartItem> result = new ArrayList<CartItem>();
        for (CartItem item : cartItemRepository.findAll()) {
            result.add(item);
        }
        return result;
    }

    public CartItem addSpaceObject(String spaceObjectName, int quantity, String username){
        final String currentUsername = currentUserName();
        Cart cart = userRepository.findByUsername(currentUsername).getCart();
        log.debug("Adding spaceObject to cart: {}", spaceObjectName);
        // Sanity check for quantity and spaceObject existence.
        assert quantity > 0;
        List<SpaceObject> foundSpaceObjects = spaceObjectRepository.findSpaceObjectByName(spaceObjectName);
        if (foundSpaceObjects.size() == 0) {
            throw new IllegalArgumentException(); //SpaceObjectNotFoundException();
        }
        // Is spaceObject already in the cart?
        SpaceObject spaceObject = foundSpaceObjects.get(0);
        List<CartItem> foundItems = cartItemRepository.findBySpaceObject(spaceObject);
        CartItem cartItem;
        if (foundItems.size() > 0) {
            // yes, increment count
            cartItem = foundItems.get(0);
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
            cartItem.setCart(cart);
        } else {
            // not yet, add a new spaceObject
            cartItem = new CartItem(foundSpaceObjects.get(0), quantity);
        }
        return cartItemRepository.save(cartItem);
    }

    public void emptyCart(String username){
        cartItemRepository.deleteAll();
    }


    public double getTotalCost(String username) {
        double totalPrice = 0;
        for (CartItem item : cartItemRepository.findAll()) {
            // Add up price times count
            totalPrice += item.getSpaceObject().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    public String currentUserName (){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
