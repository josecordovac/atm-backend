package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.ProductPlan;

public interface ProductPlanDao extends JpaRepository<ProductPlan, Long>{
	List<ProductPlan> findByProduct(Long product);
}
