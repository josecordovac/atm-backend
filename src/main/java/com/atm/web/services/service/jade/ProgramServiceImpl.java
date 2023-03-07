package com.atm.web.services.service.jade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.jade.Gallery;
import com.atm.web.services.model.jade.Information;
import com.atm.web.services.model.jade.InformationDetail;
import com.atm.web.services.model.jade.Program;
import com.atm.web.services.model.jade.Tour;
import com.atm.web.services.model.jade.TourDetail;
import com.atm.web.services.repository.jade.GalleryDao;
import com.atm.web.services.repository.jade.InformationDao;
import com.atm.web.services.repository.jade.InformationDetailDao;
import com.atm.web.services.repository.jade.ProgramDao;
import com.atm.web.services.repository.jade.TourDao;
import com.atm.web.services.repository.jade.TourDetailDao;

@Service
public class ProgramServiceImpl implements ProgramService{
	
	@Autowired
	private ProgramDao programDao;
	
	@Autowired
	private InformationDao informationDao;
	
	@Autowired
	private InformationDetailDao informationDetailDao;
	
	@Autowired
	private GalleryDao galleryDao;
	
	@Autowired
	private TourDao tourDao;
	
	@Autowired
	private TourDetailDao tourDetailDao;
	
	@Override
	public List<Program> list() {
		return programDao.findAll();
	}
	
	@Override
	public List<Program> listByType(Long type) {
		return programDao.findByType(type);
	}

	@Override
	public List<Information> listInformation(Long program) {
		return informationDao.findByProgram(program);
	}

	@Override
	public List<InformationDetail> listInformationDetail(Long information) {
		return informationDetailDao.findByInformation(information);
	}

	@Override
	public List<Gallery> listGallery(Long program) {
		return galleryDao.findByProgram(program);
	}

	@Override
	public List<Tour> listTour(Long program) {
		return tourDao.findByProgram(program);
	}

	@Override
	public List<TourDetail> listTourDetail(Long tour) {
		return tourDetailDao.findByTour(tour);
	}

}
