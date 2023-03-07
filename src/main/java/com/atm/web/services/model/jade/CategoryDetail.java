package com.atm.web.services.model.jade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JADE_CATEGORY_DETAIL", schema = "public")
public class CategoryDetail implements Serializable{

	public Long getId() {
		return id;
	}

	public Long getCategory() {
		return category;
	}

	public Long getGroup() {
		return group;
	}

	public String getDetail() {
		return detail;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

	public void setGroup(Long group) {
		this.group = group;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "DETAIL_ID")
    private Long id;
	
	@Column(name = "CATEGORY_ID")
    private Long category;
	
	@Column(name = "GROUP_ID")
    private Long group;
	
	@Column(name = "DETAIL_DETAIL", columnDefinition="TEXT")
    private String detail;
	
	
}
