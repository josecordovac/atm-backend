package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_TOUR_DETAIL", schema = "public")
public class TourDetail implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "DETAIL_ID")
    private Long id;
	
	@Column(name = "DETAIL_TOUR")
    private Long tour;
	
	@Column(name = "DETAIL_TITLE")
    private String title;
	
	@Column(name = "DETAIL_DETAIL", columnDefinition="TEXT")
    private String detail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTour() {
		return tour;
	}

	public void setTour(Long tour) {
		this.tour = tour;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
