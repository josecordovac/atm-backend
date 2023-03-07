package com.atm.web.services.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_CONTACT_TYPE", schema = "public")
public class ContactType implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "CONTACT_TYPE_ID")
    private Long id;
	
	@Column(name = "CONTACT_ID")
    private Long contact;

    @Column(name = "CONTACT_TYPE_NAME")
    private String name;
    
    @Column(name = "CONTACT_TYPE_DESCRIPTION")
    private String description;
    
    @Column(name = "CONTACT_TYPE_ICON")
    private String icon;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public String getIcon() {
		return icon;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}
    
    
}
