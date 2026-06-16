package com.sedena.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "adopter")
public class Adopter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 
	 @Column(length = 20)
	 private String firstName;
	 
	 @Column(length = 20)
	 private String lastName;
	 
	 @Column(length = 20, unique = true)
	 private String email;
	 
	 @Column(length = 50)
	 private int phone;
	 
	 @Column(length = 50)
	 private String address;

	 public long getId() {
		 return id;
	 }

	 public void setId(long id) {
		 this.id = id;
	 }

	 public String getFirstName() {
		 return firstName;
	 }

	 public void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }

	 public String getLastName() {
		 return lastName;
	 }

	 public void setLastName(String lastName) {
		 this.lastName = lastName;
	 }

	 public String getEmail() {
		 return email;
	 }

	 public void setEmail(String email) {
		 this.email = email;
	 }

	 public int getPhone() {
		 return phone;
	 }

	 public void setPhone(int phone) {
		 this.phone = phone;
	 }

	 public String getAddress() {
		 return address;
	 }

	 public void setAddress(String address) {
		 this.address = address;
	 }
	 
}
