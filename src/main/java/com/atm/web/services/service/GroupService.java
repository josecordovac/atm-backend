package com.atm.web.services.service;

import java.util.List;

import com.atm.web.services.model.Group;
import com.atm.web.services.model.GroupDetail;

public interface GroupService {
	List<Group> list();
	List<GroupDetail> listDetails(Long detail);
}
