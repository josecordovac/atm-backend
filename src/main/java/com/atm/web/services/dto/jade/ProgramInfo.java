package com.atm.web.services.dto.jade;

import java.util.List;

public class ProgramInfo {
	
	private long _id;
	private String imageURL;
	private String place;
	private String country;
	private ProgramInformationInfo information;
	private List<ProgramGalleryInfo> gallery;
	private List<ProgramTourInfo> tourPlan;
	
	public long get_id() {
		return _id;
	}
	public void set_id(long _id) {
		this._id = _id;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public ProgramInformationInfo getInformation() {
		return information;
	}
	public void setInformation(ProgramInformationInfo information) {
		this.information = information;
	}
	public List<ProgramGalleryInfo> getGallery() {
		return gallery;
	}
	public void setGallery(List<ProgramGalleryInfo> gallery) {
		this.gallery = gallery;
	}
	public List<ProgramTourInfo> getTourPlan() {
		return tourPlan;
	}
	public void setTourPlan(List<ProgramTourInfo> tourPlan) {
		this.tourPlan = tourPlan;
	}
	
}
