package com.example.gamazone_backend.repository;

import com.example.gamazone_backend.model.SpaceObject;

public interface IPriceService {
    double getDiscount(SpaceObject spaceObject, int quantity);
}
