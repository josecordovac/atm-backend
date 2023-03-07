package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.Detail;

public interface DetailDao extends JpaRepository<Detail, Long>{
	List<Detail> findAll();
}
