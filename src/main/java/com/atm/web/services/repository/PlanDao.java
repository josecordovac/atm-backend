package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.Plan;

public interface PlanDao extends JpaRepository<Plan, Long>{
	List<Plan> findAll();
}
