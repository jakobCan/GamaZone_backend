package com.example.gamazone_backend.repository;

import com.example.gamazone_backend.model.SpaceObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpaceObjectRepository extends JpaRepository<SpaceObject, Long> {

    List<SpaceObject> findSpaceObjectByName(String name);

    SpaceObject findSpaceObjectById(Long id);

    List<SpaceObject> findSpaceObjectByCategory(String category);

    List<SpaceObject> findAll();
}
