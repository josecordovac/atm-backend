package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.Gallery;

public interface GalleryDao extends JpaRepository<Gallery, Long>{
	List<Gallery> findByProgram(Long program);
}
