package com.atm.web.services.dto;

import java.util.List;

public class DetailsInfo {
	
	private List<DetailGroupInfo> coberturas;
	private List<DetailGroupInfo> dias;
	private List<DetailGroupInfo> anios;
	
	public List<DetailGroupInfo> getCoberturas() {
		return coberturas;
	}
	public void setCoberturas(List<DetailGroupInfo> coberturas) {
		this.coberturas = coberturas;
	}
	public List<DetailGroupInfo> getDias() {
		return dias;
	}
	public void setDias(List<DetailGroupInfo> dias) {
		this.dias = dias;
	}
	public List<DetailGroupInfo> getAnios() {
		return anios;
	}
	public void setAnios(List<DetailGroupInfo> anios) {
		this.anios = anios;
	}
	
}
