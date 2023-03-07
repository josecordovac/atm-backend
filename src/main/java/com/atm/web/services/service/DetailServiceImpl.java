package com.atm.web.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.Detail;
import com.atm.web.services.repository.DetailDao;

@Service
public class DetailServiceImpl implements DetailService{
	
	@Autowired
	private DetailDao detailDao;
	
	@Override
	public List<Detail> list() {
		return detailDao.findAll();
	}
	
}
