package com.sedena.app.entities;

public class Pet {
	private long id;
	private String name;
	private AdoptionStatus AdoptionStatus;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AdoptionStatus getAdoptionStatus() {
		return AdoptionStatus;
	}
	public void setAdoptionStatus(AdoptionStatus adoptionStatus) {
		AdoptionStatus = adoptionStatus;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", AdoptionStatus=" + AdoptionStatus + "]";
	}
	
	
}
