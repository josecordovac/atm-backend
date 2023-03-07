package com.atm.web.services.service;

import java.util.List;

import com.atm.web.services.model.Contact;
import com.atm.web.services.model.ContactDetail;
import com.atm.web.services.model.ContactType;

public interface ContactService {
	List<Contact> list();
	List<ContactType> listTypes(Long contact);
	List<ContactDetail> listDetails(Long type);
}
