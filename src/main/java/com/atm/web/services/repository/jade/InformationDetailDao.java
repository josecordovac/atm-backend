package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.InformationDetail;

public interface InformationDetailDao extends JpaRepository<InformationDetail, Long>{
	List<InformationDetail> findByInformation(Long information);
}
