package com.atm.web.services.dto;

import java.util.ArrayList;
import java.util.List;

public class DetailGroupInfo {
	
	private String name;
	private List<String> details;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}
	
	public DetailGroupInfo(String name, List<String> details) {
		this.name = name;
		this.details = new ArrayList<>();
		this.details = details;
	}
	
}
