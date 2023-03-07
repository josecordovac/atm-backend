package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.ContactType;

public interface ContactTypeDao extends JpaRepository<ContactType, Long>{
	List<ContactType> findByContact(Long contact);
}
