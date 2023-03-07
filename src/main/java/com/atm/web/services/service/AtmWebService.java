package com.atm.web.services.service;

import java.util.List;

import com.atm.web.services.dto.ContactDetailInfo;
import com.atm.web.services.dto.ContactInfo;
import com.atm.web.services.dto.DetailsInfo;
import com.atm.web.services.dto.MenuCentralInfo;
import com.atm.web.services.dto.PlanInfo;
import com.atm.web.services.dto.ProductInfo;

public interface AtmWebService {
	
	List<ProductInfo> getProducts();
	List<PlanInfo> getPlans(Long product);
	DetailsInfo getDetails(Long plan);
	MenuCentralInfo getMenuCentrals();
	List<ContactInfo> getContacts();
	List<ContactDetailInfo> getContactDetails(Long contact);
}
