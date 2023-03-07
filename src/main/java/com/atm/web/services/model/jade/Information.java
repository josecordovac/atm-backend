package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_INFORMATION", schema = "public")
public class Information implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "INFORMATION_ID")
    private Long id;
	
	@Column(name = "INFORMATION_PROGRAM")
    private Long program;
	
	@Column(name = "INFORMATION_PRICE")
    private Double price;
	
	@Column(name = "INFORMATION_TIME")
    private String time;
	
	@Column(name = "INFORMATION_DETAIL")
    private String detail;

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
