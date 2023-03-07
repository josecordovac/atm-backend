package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.Information;

public interface InformationDao extends JpaRepository<Information, Long>{
	List<Information> findByProgram(Long program);
}
