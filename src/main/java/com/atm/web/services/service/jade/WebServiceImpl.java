package com.atm.web.services.service.jade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.dto.jade.ProgramInformationInfo;
import com.atm.web.services.dto.jade.ProgramTourDetailInfo;
import com.atm.web.services.dto.jade.ProgramTourInfo;
import com.atm.web.services.model.jade.Category;
import com.atm.web.services.model.jade.CategoryDetail;
import com.atm.web.services.model.jade.CategoryGroup;
import com.atm.web.services.model.jade.Gallery;
import com.atm.web.services.model.jade.Information;
import com.atm.web.services.model.jade.InformationDetail;
import com.atm.web.services.model.jade.Program;
import com.atm.web.services.model.jade.Tour;
import com.atm.web.services.model.jade.TourDetail;
import com.atm.web.services.dto.jade.ProgramInfo;
import com.atm.web.services.dto.jade.CategoryDetailInfo;
import com.atm.web.services.dto.jade.CategoryInfo;
import com.atm.web.services.dto.jade.ProgramGalleryInfo;

@Service
public class WebServiceImpl implements WebService{
	
	@Autowired
	private ProgramService programService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Override
	public List<ProgramInfo> getPrograms(Long type) {
		List<ProgramInfo> listPrograms = new ArrayList<>();
		List<Program> jadePrograms = new ArrayList<>();
		jadePrograms = (type == 0) ? programService.list() : programService.listByType(type);
		for (Program jadeProgram : jadePrograms) {
			ProgramInfo item = new ProgramInfo();
			item.set_id(jadeProgram.getId());
			item.setCountry(jadeProgram.getCountry());
			item.setImageURL(jadeProgram.getImageURL());
			item.setPlace(jadeProgram.getPlace());
			
			Information information = programService.listInformation(jadeProgram.getId()).get(0);
			ProgramInformationInfo programInformationInfo = new ProgramInformationInfo();
			programInformationInfo.setDetail(information.getDetail());
			programInformationInfo.setPrice(information.getPrice());
			programInformationInfo.setTime(information.getTime());
			
			List<String> included = new ArrayList<>();
			List<String> noIncluded = new ArrayList<>();
			for (InformationDetail jadeInformationDetail : programService.listInformationDetail(information.getId())) {
				if (jadeInformationDetail.getType() == 1) {
					included.add(jadeInformationDetail.getDescription());
				}else {
					noIncluded.add(jadeInformationDetail.getDescription());
				}
			}
			programInformationInfo.setIncluded(included);
			programInformationInfo.setNoIncluded(noIncluded);
			item.setInformation(programInformationInfo);
			
			List<ProgramGalleryInfo> listGallery = new ArrayList<>();
			for (Gallery jadeGallery : programService.listGallery(jadeProgram.getId())) {
				ProgramGalleryInfo itemGallery = new ProgramGalleryInfo();
				itemGallery.setUri(jadeGallery.getUri());
				listGallery.add(itemGallery);
			}
			item.setGallery(listGallery);
			
			List<ProgramTourInfo> listTour = new ArrayList<>();
			for (Tour jadeTour : programService.listTour(jadeProgram.getId())) {
				ProgramTourInfo itemTour = new ProgramTourInfo();
				itemTour.setKey(jadeTour.getKey());
				itemTour.setStep(jadeTour.getStep());
				
				List<ProgramTourDetailInfo> listTourDetail = new ArrayList<>();
				for (TourDetail jadeTourDetail : programService.listTourDetail(jadeTour.getId())) {
					ProgramTourDetailInfo itemDetail = new ProgramTourDetailInfo();
					itemDetail.setTitle(jadeTourDetail.getTitle());
					itemDetail.setDetail(jadeTourDetail.getDetail());
					listTourDetail.add(itemDetail);
				}
				itemTour.setValue(listTourDetail);
				listTour.add(itemTour);
			}
			item.setTourPlan(listTour);
			
			listPrograms.add(item);
		}
		return listPrograms;
	}

	@Override
	public List<CategoryInfo> getMenu() {
		List<CategoryInfo> listMenu = new ArrayList<>();
		for (Category category : categoryService.list()) {
			CategoryInfo item = new CategoryInfo();
			item.setId(category.getId());
			item.setName(category.getName());
			item.setOrder(category.getOrder());
			listMenu.add(item);
		}
		return listMenu;
	}

	@Override
	public List<CategoryDetailInfo> getMenuDetail(Long category) {
		List<CategoryDetailInfo> menudetails = new ArrayList<>();
		
		for (CategoryGroup categoryGroup : categoryService.listGroups(category)) {
			CategoryDetailInfo item = new CategoryDetailInfo();
			item.setId(categoryGroup.getId());
			item.setName(categoryGroup.getName());
			List<String> items = new ArrayList<>();
			for (CategoryDetail categoryDetail : categoryService.listDetails(item.getId())) {
				items.add(categoryDetail.getDetail());
			}
			item.setDetails(items);
			menudetails.add(item);
		}
		return menudetails;
	}

}
