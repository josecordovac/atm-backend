package com.atm.web.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_GROUP_DETAIL", schema = "public")
public class GroupDetail {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "GROUP_DETAIL_ID")
    private Long id;

    @Column(name = "GROUP_ID")
    private Long group;

    @Column(name = "DETAIL_ID")
    private Long detail;
    
    @Column(name = "DETAIL_DESCRIPTION")
    private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPlan() {
		return detail;
	}

	public void setPlan(Long plan) {
		this.detail = plan;
	}

	public Long getGroup() {
		return group;
	}

	public void setGroup(Long group) {
		this.group = group;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}
