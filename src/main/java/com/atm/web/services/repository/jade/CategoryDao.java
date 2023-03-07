package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.Category;

public interface CategoryDao extends JpaRepository<Category, Long>{
	List<Category> findAll();
	Category findById(Long id);
}
