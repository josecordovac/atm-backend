package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.GroupDetail;

public interface GroupDetailDao extends JpaRepository<GroupDetail, Long>{
	List<GroupDetail> findByDetail(Long detail);
}
