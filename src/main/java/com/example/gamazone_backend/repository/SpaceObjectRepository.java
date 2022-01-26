package com.example.gamazone_backend.repository;

import com.example.gamazone_backend.model.SpaceObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpaceObjectRepository extends CrudRepository<SpaceObject, Long> {

    SpaceObject findSpaceObjectByName(String name);

    SpaceObject findSpaceObjectById(Long id);

    SpaceObject findSpaceObjectByCategory(String category);

    List<SpaceObject> findAll();
}
