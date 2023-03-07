package com.atm.web.services.dto;

public class ContactInfo {
	
	private Long id;
	private String name;
	private String image;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getImage() {
		return image;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
