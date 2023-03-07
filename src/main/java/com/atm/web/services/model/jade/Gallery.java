package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_GALLERY", schema = "public")
public class Gallery implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "GALLERY_ID")
    private Long id;
	
	@Column(name = "GALLERY_PROGRAM")
    private Long program;
	
	@Column(name = "GALLERY_URI")
    private String uri;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Long getProgram() {
		return program;
	}

	public void setProgram(Long program) {
		this.program = program;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
