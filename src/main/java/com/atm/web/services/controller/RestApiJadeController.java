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

import com.atm.web.services.dto.jade.CategoryDetailInfo;
import com.atm.web.services.dto.jade.CategoryInfo;
import com.atm.web.services.dto.jade.ProgramInfo;
import com.atm.web.services.model.jade.request.RequestCategory;
import com.atm.web.services.model.jade.request.RequestType;
import com.atm.web.services.service.jade.WebServiceImpl;

@RestController
@RequestMapping("/api/jade")
@CrossOrigin(origins = "*")
public class RestApiJadeController {
	
	public static final Logger logger = LoggerFactory.getLogger(RestApiJadeController.class);
	
	@Autowired
    private WebServiceImpl jadeWebService;
	
	@RequestMapping("/")
    public String index() {
        return "Web Rest API";
    }
	
	@PostMapping("/listProgram")
    public @ResponseBody List<ProgramInfo> listProgram(@RequestBody RequestType request) {
    	return jadeWebService.getPrograms(request.getType());
    }
	
	@PostMapping("/listMenu")
    public @ResponseBody List<CategoryInfo> listMenu() {
    	return jadeWebService.getMenu();
    }
	
	@PostMapping("/listProgramTypes")
    public @ResponseBody String listProgramTypes() {
    	return "TYPES";
    }
	
	@PostMapping("/menuDetail")
    public @ResponseBody List<CategoryDetailInfo> menuDetail(@RequestBody RequestCategory request) {
    	return jadeWebService.getMenuDetail(request.getCategory());
    }
	
}
