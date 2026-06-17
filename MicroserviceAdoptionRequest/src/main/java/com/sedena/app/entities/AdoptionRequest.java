package com.sedena.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "adoption_requests")
public class AdoptionRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private long adopterId;
	
	@Column(nullable=false)
	private long idPet;
	
	@Column(length = 20)
	private String emailAdopter;
	
	@Column(length = 50)
	private String namePet;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private AdoptionRequestStatus status;
	
	@PrePersist
	public void beforeInsert() {
		if(status == null)
			this.status=AdoptionRequestStatus.PENDING;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAdopterId() {
		return adopterId;
	}
	public void setAdopterId(long adopterId) {
		this.adopterId = adopterId;
	}
	public long getIdPet() {
		return idPet;
	}
	public void setIdPet(long idPet) {
		this.idPet = idPet;
	}
	public String getEmailAdopter() {
		return emailAdopter;
	}
	public void setEmailAdopter(String emailAdopter) {
		this.emailAdopter = emailAdopter;
	}
	public String getNamePet() {
		return namePet;
	}
	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}
	public AdoptionRequestStatus getStatus() {
		return status;
	}
	public void setStatus(AdoptionRequestStatus status) {
		this.status = status;
	}
}
