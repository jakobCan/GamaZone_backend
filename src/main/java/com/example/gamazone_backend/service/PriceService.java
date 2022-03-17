package com.example.gamazone_backend.service;

import com.example.gamazone_backend.model.SpaceObject;
import com.example.gamazone_backend.repository.IPriceService;
import org.springframework.stereotype.Service;

@Service
public class PriceService implements IPriceService {

    /**
     * This is mainly a stub for any more serious logic to come.
     *
     * Papayas are 50p each, but are available as ‘three for the price of two’.
     * Given a shopping list with items, calculate the total cost of those items.
     */
    @Override
    public double getDiscount(SpaceObject spaceObject, int quantity) {
        if (!(spaceObject.getName().equals("Papaya")) || (quantity < 3)) return 0;
        return quantity / 3;
    }

}
