package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.Group;

public interface GroupDao extends JpaRepository<Group, Long>{
	List<Group> findAll();
}
