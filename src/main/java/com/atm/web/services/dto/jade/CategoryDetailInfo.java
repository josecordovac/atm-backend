package com.atm.web.services.dto.jade;

import java.util.List;

public class CategoryDetailInfo {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	private Long id;
	private String name;
	private List<String> details;
	
	
}
