package com.atm.web.services.service;

import java.util.List;

import com.atm.web.services.model.Product;
import com.atm.web.services.model.ProductPlan;

public interface ProductService {
	List<Product> list();
	List<ProductPlan> listPlans(long product);
}
