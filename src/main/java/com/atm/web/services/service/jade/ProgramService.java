package com.atm.web.services.service.jade;

import java.util.List;

import com.atm.web.services.model.jade.Gallery;
import com.atm.web.services.model.jade.Information;
import com.atm.web.services.model.jade.InformationDetail;
import com.atm.web.services.model.jade.Program;
import com.atm.web.services.model.jade.Tour;
import com.atm.web.services.model.jade.TourDetail;

public interface ProgramService {
	List<Program> list();
	List<Program> listByType(Long type);
	
	List<Information> listInformation(Long program);
	List<InformationDetail> listInformationDetail(Long information);
	
	List<Gallery> listGallery(Long program);
	
	List<Tour> listTour(Long program);
	List<TourDetail> listTourDetail(Long tour);
}
