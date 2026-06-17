package com.sedena.app.services;

import java.util.List;

import com.sedena.app.entities.AdoptionStatus;
import com.sedena.app.entities.Pet;

public interface IServices {
 boolean insert(Pet p);
 Pet findById(long id);
 List<Pet> findAll();
 List<Pet> findBySpecie(String specie);
 List<Pet> findByAdoptionStatus(AdoptionStatus status);
 boolean update(Pet p);
 boolean udpateAdoptionStatus(long id, AdoptionStatus status);
 boolean deleteById(long id);
}
 
