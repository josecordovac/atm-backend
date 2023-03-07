package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_PROGRAM", schema = "public")
public class Program implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "PROGRAM_ID")
    private Long id;
	
	@Column(name = "PROGRAM_IMAGE_URL")
    private String imageURL;
	
	@Column(name = "PROGRAM_PLACE")
    private String place;
	
	@Column(name = "PROGRAM_COUNTRY")
    private String country;
	
	@Column(name = "PROGRAM_TYPE")
    private Long type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
