package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.CategoryGroup;

public interface CategoryGroupDao extends JpaRepository<CategoryGroup, Long>{
	List<CategoryGroup> findByCategory(Long category);
}
