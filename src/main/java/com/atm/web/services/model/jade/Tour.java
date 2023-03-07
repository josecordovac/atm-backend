package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_TOUR", schema = "public")
public class Tour implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "TOUR_ID")
    private Long id;
	
	@Column(name = "TOUR_PROGRAM")
    private Long program;
	
	@Column(name = "TOUR_KEY")
    private String key;
	
	@Column(name = "TOUR_STEP")
    private Integer step;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProgram() {
		return program;
	}

	public void setProgram(Long program) {
		this.program = program;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
