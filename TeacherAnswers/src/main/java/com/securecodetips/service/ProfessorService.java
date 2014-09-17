package com.securecodetips.service;

import java.util.List;

import com.securecodetips.model.Professor;

public interface ProfessorService {

	void addProfessor(Professor professor);

	List<Professor> findAllProfessors();

}