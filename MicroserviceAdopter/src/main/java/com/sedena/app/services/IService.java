package com.sedena.app.services;

import java.util.List;
import com.sedena.app.entities.Adopter;

public interface IService {
	boolean insert(Adopter p);
	List<Adopter> findAll(); 
	Adopter findById(long id); 
	List<Adopter> findByEmail(String email);
	List<Adopter> findBylastName(String lastName);
	boolean update(Adopter p);
	boolean deleteById(long id);
}

