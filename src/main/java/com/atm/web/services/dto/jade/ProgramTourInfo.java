package com.atm.web.services.dto.jade;

import java.util.List;

public class ProgramTourInfo {
	
	private String key;
	private int step;
	private List<ProgramTourDetailInfo> value;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public List<ProgramTourDetailInfo> getValue() {
		return value;
	}
	public void setValue(List<ProgramTourDetailInfo> value) {
		this.value = value;
	}
	
}
