package com.sedena.app.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sedena.app.entities.Adopter;
import com.sedena.app.services.IService;

@RestController
@RequestMapping("/adopter")
public class MicroserviceController {
	
	private IService service;

	public MicroserviceController(IService service) {
		this.service = service;
	}
	
	@PostMapping
	public  ResponseEntity<String> insert(@RequestBody Adopter a){
		
		try {
			if(service.insert(a))
				return new ResponseEntity<String>("inserted", HttpStatus.OK);
			else
				return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}catch(Exception e) {
			
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
	
	@GetMapping
	public ResponseEntity<List<Adopter>> all(){
		
		try {
			
			return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Adopter> findById(@PathVariable("id") long id){
		try {
			return new ResponseEntity<>(service.findById(id), HttpStatus.OK);	
			
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/email/{email}")
	public ResponseEntity<Adopter> findByEmail(@PathVariable("email") String email){
	
		try {
			return new ResponseEntity<>(service.findByEmail(email), HttpStatus.OK);	
			
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/lastname/{lastname}")
	public ResponseEntity<List<Adopter>> findBylastName(@PathVariable("lastname") String lastname){
	
		try {
			return new ResponseEntity<>(service.findBylastName(lastname), HttpStatus.OK);	
			
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Adopter a){
		try {
			if(service.update(a)) 
				return new ResponseEntity<>("updated", HttpStatus.OK);
			else
				return new ResponseEntity<>("check request", HttpStatus.BAD_REQUEST);
			
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") long id){
		try {
			if(service.deleteById(id)) 
				return new ResponseEntity<>("deleted", HttpStatus.OK);
			else
				return new ResponseEntity<>("check request", HttpStatus.BAD_REQUEST);
			
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	

}
