package com.atm.web.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.Group;
import com.atm.web.services.model.GroupDetail;
import com.atm.web.services.repository.GroupDao;
import com.atm.web.services.repository.GroupDetailDao;

@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired
	private GroupDao groupDao;
	
	@Autowired
	private GroupDetailDao groupDetailDao;
	
	@Override
	public List<Group> list() {
		return groupDao.findAll();
	}

	@Override
	public List<GroupDetail> listDetails(Long detail) {
		return groupDetailDao.findByDetail(detail);
	}
	
}
