package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_INFORMATION_DETAIL", schema = "public")
public class InformationDetail implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "INFORMATION_DETAIL_ID")
    private Long id;
	
	@Column(name = "INFORMATION_DETAIL_INFORMATION")
    private Long information;
	
	@Column(name = "INFORMATION_DETAIL_DESCRIPCION")
    private String description;
	
    @Column(name = "INFORMATION_DETAIL_TYPE")
    private Long type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInformation() {
		return information;
	}

	public void setInformation(Long information) {
		this.information = information;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
