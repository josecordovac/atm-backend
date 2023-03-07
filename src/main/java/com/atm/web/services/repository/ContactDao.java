package com.atm.web.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.Contact;

public interface ContactDao extends JpaRepository<Contact, Long>{
	List<Contact> findAll();
}
