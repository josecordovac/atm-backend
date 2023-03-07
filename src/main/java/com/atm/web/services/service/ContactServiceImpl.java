package com.atm.web.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.Contact;
import com.atm.web.services.model.ContactDetail;
import com.atm.web.services.model.ContactType;
import com.atm.web.services.repository.ContactDao;
import com.atm.web.services.repository.ContactDetailDao;
import com.atm.web.services.repository.ContactTypeDao;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactDao contactDao;
	
	@Autowired
	private ContactTypeDao contactTypeDao;
	
	@Autowired
	private ContactDetailDao contactDetailDao;
	
	@Override
	public List<Contact> list() {
		return contactDao.findAll();
	}

	@Override
	public List<ContactType> listTypes(Long contact) {
		return contactTypeDao.findByContact(contact);
	}

	@Override
	public List<ContactDetail> listDetails(Long type) {
		return contactDetailDao.findByType(type);
	}

}
