package com.example.gamazone_backend.repository;

import com.example.gamazone_backend.model.CartItem;
import com.example.gamazone_backend.model.SpaceObject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
    List<CartItem> findBySpaceObject(SpaceObject spaceObject);

    //CartItem findByCartItemById(Long CartItem);
}
