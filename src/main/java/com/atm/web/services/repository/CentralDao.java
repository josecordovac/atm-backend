package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.Central;

public interface CentralDao extends JpaRepository<Central, Long>{
	List<Central> findAll();
}
