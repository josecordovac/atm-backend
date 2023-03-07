package com.atm.web.services.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atm.web.services.dto.ContactDetailInfo;
import com.atm.web.services.dto.ContactInfo;
import com.atm.web.services.dto.DetailsInfo;
import com.atm.web.services.dto.MenuCentralInfo;
import com.atm.web.services.dto.PlanInfo;
import com.atm.web.services.dto.ProductInfo;
import com.atm.web.services.model.request.RequestContact;
import com.atm.web.services.model.request.RequestDetail;
import com.atm.web.services.model.request.RequestPlan;
import com.atm.web.services.service.AtmWebServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RestApiController {
	
	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	
	@Autowired
    private AtmWebServiceImpl atmWebService;
	
	
	@RequestMapping("/")
    public String index() {
        return "Web Rest API";
    }
	
	@PostMapping("/listProduct")
    public @ResponseBody List<ProductInfo> listProduct() {
    	return atmWebService.getProducts();
    }
	
	@PostMapping("/listPlan")
    public @ResponseBody List<PlanInfo> listPlan(@RequestBody RequestPlan request) {
    	return atmWebService.getPlans(request.getProduct());
    }
	
	@PostMapping("/listDetail")
    public @ResponseBody DetailsInfo listDetail(@RequestBody RequestDetail request) {
    	return atmWebService.getDetails(request.getPlan());
    }
	
	@PostMapping("/menuCentrales")
    public @ResponseBody MenuCentralInfo menuCentrales() {
    	return atmWebService.getMenuCentrals();
    }
	
	@PostMapping("/menuContacts")
    public @ResponseBody List<ContactInfo> menuContactenos() {
    	return atmWebService.getContacts();
    }
	
	@PostMapping("/menuContactDetail")
    public @ResponseBody List<ContactDetailInfo> menuContactDetail(@RequestBody RequestContact request) {
    	return atmWebService.getContactDetails(request.getContact());
    }
}

