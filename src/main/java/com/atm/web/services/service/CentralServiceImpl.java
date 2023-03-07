package com.atm.web.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.Central;
import com.atm.web.services.repository.CentralDao;

@Service
public class CentralServiceImpl implements CentralService{

	@Autowired
	private CentralDao centralDao;
	
	@Override
	public List<Central> list() {
		return centralDao.findAll();
	}

}
