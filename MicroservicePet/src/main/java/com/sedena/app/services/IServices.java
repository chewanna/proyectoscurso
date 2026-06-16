package com.sedena.app.services;

import java.util.List;

import com.sedena.app.entities.AdoptionStatus;
import com.sedena.app.entities.pet;

public interface IServices {
 boolean insert(pet p);
 pet findById(long id);
 List<pet> findAll();
 List<pet> findBySpecie(String specie);
 List<pet> findByAdoptionStatus(AdoptionStatus status);
 boolean update(pet p);
 boolean udpateAdoptionStatus(long id, AdoptionStatus status);
 boolean deleteById(long id);
}
 
