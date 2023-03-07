package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.PlanDetail;

public interface PlanDetailDao extends JpaRepository<PlanDetail, Long>{
	List<PlanDetail> findByPlan(Long plan);
}
