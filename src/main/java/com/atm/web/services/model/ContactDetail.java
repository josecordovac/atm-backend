package com.atm.web.services.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_CONTACT_DETAIL", schema = "public")
public class ContactDetail implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "CONTACT_DETAIL_ID")
    private Long id;

    @Column(name = "CONTACT_TYPE_ID")
    private Long type;
    
    @Column(name = "CONTACT_DETAIL_NAME")
    private String name;

	public Long getId() {
		return id;
	}

	public Long getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
