package com.atm.web.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.*;
import com.atm.web.services.repository.PlanDao;
import com.atm.web.services.repository.PlanDetailDao;
import com.atm.web.services.repository.PlanGroupDao;

@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanDao planDao;
	
	@Autowired
	private PlanDetailDao planDetailDao;
	
	@Autowired
	private PlanGroupDao planGroupDao;
	
	@Override
	public List<Plan> list() {
		return planDao.findAll();
	}

	@Override
	public List<PlanGroup> listGroup(Long plan) {
		return planGroupDao.findByPlan(plan);
	}

	@Override
	public List<PlanDetail> listDetail(Long plan) {
		return planDetailDao.findByPlan(plan);
	}
	
}
