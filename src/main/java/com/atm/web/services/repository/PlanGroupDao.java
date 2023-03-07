package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.PlanGroup;

public interface PlanGroupDao extends JpaRepository<PlanGroup, Long>{
	List<PlanGroup> findByPlan(Long plan);
}
