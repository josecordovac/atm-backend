package com.atm.web.services.repository.jade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.web.services.model.jade.Program;

public interface ProgramDao extends JpaRepository<Program, Long> {
	List<Program> findAll();
	List<Program> findByType(Long type);
}
