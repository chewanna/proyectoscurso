package com.sedena.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sedena.app.entities.AdoptionStatus;
import com.sedena.app.entities.Pet;

public interface IMicroserviceDAO extends CrudRepository<Pet, Long> {
	@Query("SELECT i FROM Pet i WHERE i.spice=:spice")
	List<Pet> searchBySpecie(@Param("spice") String spice);
	
	@Query("SELECT i FROM Pet i WHERE i.AdoptionStatus=:status")
	List<Pet> searchByAdoptionStatus(@Param("status") AdoptionStatus status);
}
