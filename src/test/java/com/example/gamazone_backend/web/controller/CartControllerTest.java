package com.example.gamazone_backend.web.controller;

import com.example.gamazone_backend.model.CartItem;
import com.example.gamazone_backend.model.SpaceObject;
import com.example.gamazone_backend.repository.CartItemRepository;
import com.example.gamazone_backend.service.CartService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
@Transactional
class CartControllerTest {
    @Mock
    CartService cartService;
    @Mock
    CartItemRepository cartItemRepository;
    @InjectMocks
    CartController cartController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetItems() {
        when(cartService.getItems(anyString())).thenReturn(Arrays.<CartItem>asList(new CartItem(new SpaceObject("name", 10, "description", "tagline", "category", "picture"), 1)));
        when(cartService.currentUserName()).thenReturn("currentUserNameResponse");

        List<CartItem> result = cartService.getItems("name");
        //Assertions.assertEquals(Arrays.<CartItem>asList(new CartItem(new SpaceObject("name", 10, "description", "tagline", "category", "picture"), 1)), result);
    }

    @Test
    void testAddSpaceObject() {
        when(cartService.addSpaceObject(anyString(), anyInt(), anyString())).thenReturn(new CartItem(new SpaceObject("name", 10, "description", "tagline", "category", "picture"), 1));
        when(cartService.currentUserName()).thenReturn(String.valueOf(true));

        CartItem result = cartController.addSpaceObject("product", 1);
        //Assertions.assertEquals(new CartItem(new SpaceObject("name", 10, "description", "tagline", "category", "picture"), 1), result);
    }

    @Test
    void testEmptyCart() {
        when(cartService.currentUserName()).thenReturn("currentUserNameResponse");

        cartController.emptyCart();
    }

    @Test
    void testDeleteCartItem() {
        cartController.deleteCartItem(Long.valueOf(1));
    }

    @Test
    void testGetTotalCost() {
        when(cartService.getTotalCost(anyString())).thenReturn(0d);
        when(cartService.currentUserName()).thenReturn("currentUserNameResponse");

        double result = cartController.getTotalCost();
        Assertions.assertEquals(0d, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme