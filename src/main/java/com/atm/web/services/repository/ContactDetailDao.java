package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.ContactDetail;

public interface ContactDetailDao extends JpaRepository<ContactDetail, Long>{
	List<ContactDetail> findByType(Long type);
}
