package com.sedena.app.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sedena.app.entities.Adopter;

public interface IMicroserviceDAO extends CrudRepository<Adopter, Long>{
	@Query("SELECT i FROM Adopter i WHERE i.email=:email")
	Optional<Adopter> searchByEmail(@Param("email") String email);
	
	@Query("SELECT i FROM Adopter i WHERE i.lastName=:lastName")
	List<Adopter> searchBylastName(@Param("lastName") String lastName);
}
