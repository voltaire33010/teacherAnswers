package com.securecodetips.service;

import java.util.List;

import com.securecodetips.model.Professor;
import com.securecodetips.model.ProfessorReport;

public interface Professorsservice {
	Professor save(Professor professor);

	List<Professor> findALLProfessors();

	List<ProfessorReport> findALLProfessorReport();

	List<ProfessorReport> searchProfessor(String professorName);

	List<Professor> searchProfessorRecord(String professorName);

}
