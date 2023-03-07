package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_PROGRAM_TYPE", schema = "public")
public class ProgramType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROGRAM_TYPE_ID")
	private Long id;

	@Column(name = "PROGRAM_TYPE_NAME")
	private String name;

	@Column(name = "PROGRAM_TYPE_IMAGE")
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
