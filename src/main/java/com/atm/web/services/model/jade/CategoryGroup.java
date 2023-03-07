package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_CATEGORY_GROUP", schema = "public")
public class CategoryGroup implements Serializable{
	
	public Long getId() {
		return id;
	}

	public Long getGroup() {
		return category;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setGroup(Long group) {
		this.category = group;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "CATEGORY_GROUP_ID")
    private Long id;
	
	@Column(name = "CATEGORY_ID")
    private Long category;
	
	@Column(name = "CATEGORY_GROUP_NAME")
    private String name;
	
	
}
