package com.atm.web.services.dto;

import java.util.List;

public class ContactDetailInfo {

	private Long id;
	private String description;
	private String icon;
	private List<String> details;
	
	public Long getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public String getIcon() {
		return icon;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	
}
