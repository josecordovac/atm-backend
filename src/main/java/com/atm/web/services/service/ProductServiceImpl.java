package com.atm.web.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.Product;
import com.atm.web.services.model.ProductPlan;
import com.atm.web.services.repository.ProductDao;
import com.atm.web.services.repository.ProductPlanDao;

@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductDao productDao;
    
    @Autowired
    private ProductPlanDao productPlanDao; 
    
	@Override
	public List<Product> list() {
		return productDao.findAll(); 
	}

	@Override
	public List<ProductPlan> listPlans(long product) {
		return productPlanDao.findByProduct(product);
	}

}
