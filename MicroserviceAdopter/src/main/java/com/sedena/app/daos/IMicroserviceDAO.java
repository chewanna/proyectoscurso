package com.sedena.app.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sedena.app.entities.Adopter;

public interface IMicroserviceDAO extends CrudRepository<Adopter, Long>{
	@Query("SELECT i FROM adopter i WHERE i.email=:email")
	List<Adopter> searchByEmail(@Param("email") String email);
	
	@Query("SELECT i FROM adopter i WHERE i.lastName=:lastName")
	List<Adopter> searchBylastName(@Param("lastName") String lastName);
}
