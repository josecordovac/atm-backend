package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.Tour;

public interface TourDao extends JpaRepository<Tour, Long>{
	List<Tour> findByProgram(Long program);
}
