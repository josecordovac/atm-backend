package com.atm.web.services.dto.jade;

import java.util.List;

public class ProgramInformationInfo {
	
	private Double price;
	private String time;
	private String detail;
	private List<String> included;
	private List<String> noIncluded;
	
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
	public List<String> getIncluded() {
		return included;
	}
	public void setIncluded(List<String> included) {
		this.included = included;
	}
	public List<String> getNoIncluded() {
		return noIncluded;
	}
	public void setNoIncluded(List<String> noIncluded) {
		this.noIncluded = noIncluded;
	}
		
}
