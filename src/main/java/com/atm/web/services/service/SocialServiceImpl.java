package com.atm.web.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.Social;
import com.atm.web.services.repository.SocialDao;

@Service
public class SocialServiceImpl implements SocialService{

	@Autowired
	private SocialDao socialDao;
	
	@Override
	public List<Social> list() {
		return socialDao.findAll();
	}

}
