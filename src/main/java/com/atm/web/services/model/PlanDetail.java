package com.atm.web.services.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_PLAN_DETAIL", schema = "public")
public class PlanDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "PLAN_DETAIL_ID")
    private Long id;

    @Column(name = "PLAN_ID")
    private Long plan;

    @Column(name = "DETAIL_ID")
    private Long detail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPlan() {
		return plan;
	}

	public void setPlan(Long plan) {
		this.plan = plan;
	}

	public Long getDetail() {
		return detail;
	}

	public void setDetail(Long detail) {
		this.detail = detail;
	}
    
}
