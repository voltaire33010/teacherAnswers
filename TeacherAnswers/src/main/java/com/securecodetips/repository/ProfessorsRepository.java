package com.securecodetips.repository;

import java.util.List;

import com.securecodetips.model.Professor;
import com.securecodetips.model.ProfessorReport;

public interface ProfessorsRepository {
	
	Professor save(Professor professor);

	List<Professor> loadAll();

	List<ProfessorReport> findAllProfessorReport();

	List<ProfessorReport> searchProfessor(String professorName);

	List<Professor> searchProfessorRecord(String professorName);

}
