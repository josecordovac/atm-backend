package com.atm.web.services.service.jade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.jade.Category;
import com.atm.web.services.model.jade.CategoryDetail;
import com.atm.web.services.model.jade.CategoryGroup;
import com.atm.web.services.repository.jade.CategoryDao;
import com.atm.web.services.repository.jade.CategoryDetailDao;
import com.atm.web.services.repository.jade.CategoryGroupDao;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private CategoryDetailDao categoryDetailDao;
	
	@Autowired
	private CategoryGroupDao categoryGroupDao;
	
	@Override
	public List<Category> list() {
		return categoryDao.findAll();
	}

	@Override
	public Category itemById(Long id) {
		return categoryDao.findById(id);
	}

	@Override
	public List<CategoryDetail> listDetails(Long group) {
		return categoryDetailDao.findByGroup(group);
	}

	@Override
	public List<CategoryGroup> listGroups(Long category) {
		return categoryGroupDao.findByCategory(category);
	}

	
}
