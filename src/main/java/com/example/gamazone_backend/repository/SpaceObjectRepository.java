package com.example.gamazone_backend.repository;

import com.example.gamazone_backend.data.model.SpaceObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceObjectRepository extends CrudRepository<SpaceObject, Long> {

}
