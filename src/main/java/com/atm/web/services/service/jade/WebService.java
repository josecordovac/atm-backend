package com.atm.web.services.service.jade;

import java.util.List;

import com.atm.web.services.dto.jade.CategoryDetailInfo;
import com.atm.web.services.dto.jade.CategoryInfo;
import com.atm.web.services.dto.jade.ProgramInfo;

public interface WebService {
	
	List<ProgramInfo> getPrograms(Long type);
	
	List<CategoryInfo> getMenu();
	
	List<CategoryDetailInfo> getMenuDetail(Long category);
}
