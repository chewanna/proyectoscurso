package com.sedena.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sedena.app.entities.AdoptionStatus;
import com.sedena.app.entities.pet;

public interface IMicroserviceDAO extends CrudRepository<pet, Long> {
	@Query("SELECT i FROM pet i WHERE i.spice=:spice")
	List<pet> searchBySpecie(@Param("spice") String spice);
	
	@Query("SELECT i FROM pet i WHERE i.AdoptionStatus=:status")
	List<pet> searchByAdoptionStatus(@Param("status") AdoptionStatus status);
}
