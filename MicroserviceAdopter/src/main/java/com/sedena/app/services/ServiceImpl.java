package com.sedena.app.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.sedena.app.daos.IMicroserviceDAO;
import com.sedena.app.entities.Adopter;

@Service
public class ServiceImpl implements IService {
 
 private IMicroserviceDAO dao;
 
 public ServiceImpl(IMicroserviceDAO dao) {
  this.dao=dao;
 }
 

 @Override
 public boolean insert(Adopter p) {
  if(p.getId()==0) {
   Adopter result=dao.save(p);
   return result!=null;
  }
  return false;
 }

 @Override
 public List<Adopter> findAll() {
  return (List<Adopter>)dao.findAll();
 }

 @Override
 public Adopter findByEmail(String email) {
  return dao.searchByEmail(email).orElseThrow();
 }
 
 @Override
 public List<Adopter> findBylastName(String lastName) {
  return dao.searchBylastName(lastName);
 }

 @Override
 public boolean update(Adopter p) {
  if(dao.existsById(p.getId())) {
   return dao.save(p)!=null;
   
  }
  throw new NoSuchElementException();
 }


 @Override
 public boolean deleteById(long id) {
  if(dao.existsById(id)) {
   dao.deleteById(id);
   return true;
  }
   
  throw new NoSuchElementException();
 }
 
 @Override
 public Adopter findById(long id) {
	 return dao.findById(id).orElseThrow();
 }
 
}
