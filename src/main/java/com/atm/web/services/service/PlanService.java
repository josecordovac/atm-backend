package com.atm.web.services.service;

import java.util.List;

import com.atm.web.services.model.Plan;
import com.atm.web.services.model.PlanDetail;
import com.atm.web.services.model.PlanGroup;

public interface PlanService {
	List<Plan> list(); 
	List<PlanGroup> listGroup(Long plan);
	List<PlanDetail> listDetail(Long plan);
}
