package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.TourDetail;

public interface TourDetailDao extends JpaRepository<TourDetail, Long>{
	List<TourDetail> findByTour(Long tour);
}
