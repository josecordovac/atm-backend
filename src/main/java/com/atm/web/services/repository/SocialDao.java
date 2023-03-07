package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.Social;

public interface SocialDao extends JpaRepository<Social, Long>{
	List<Social> findAll(); 
}
