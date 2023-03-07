package com.atm.web.services.dto;

import java.util.List;

public class MenuCentralInfo {
	private List<SocialInfo> redesSociales;
	private List<CentralInfo> centrales;
	
	public List<SocialInfo> getRedesSociales() {
		return redesSociales;
	}
	public List<CentralInfo> getCentrales() {
		return centrales;
	}
	public void setRedesSociales(List<SocialInfo> redesSociales) {
		this.redesSociales = redesSociales;
	}
	public void setCentrales(List<CentralInfo> centrales) {
		this.centrales = centrales;
	}
	
	
}
