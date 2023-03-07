package com.atm.web.services.service.jade;

import java.util.List;

import com.atm.web.services.model.jade.Category;
import com.atm.web.services.model.jade.CategoryDetail;
import com.atm.web.services.model.jade.CategoryGroup;

public interface CategoryService {
	List<Category> list();
	Category itemById(Long id);
	List<CategoryDetail> listDetails(Long group);
	List<CategoryGroup> listGroups(Long category);
}
