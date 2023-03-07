package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.CategoryDetail;

public interface CategoryDetailDao extends JpaRepository<CategoryDetail, Long>{
	List<CategoryDetail> findByGroup(Long group);
}
