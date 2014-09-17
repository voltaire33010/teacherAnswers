package com.securecodetips.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.securecodetips.model.Professor;
import com.securecodetips.model.ProfessorReport;
import com.securecodetips.repository.ProfessorsRepository;


@Service("Professorsservice")
public class Professorsserviceimpl implements Professorsservice {
	@Autowired
	private ProfessorsRepository professorsRepository;
	
    @Transactional
	public Professor save(Professor professor) {
		// TODO Auto-generated method stub
		return professorsRepository.save(professor);
	}

	public List<Professor> findALLProfessors() {
		// TODO Auto-generated method stub
		
		return professorsRepository.loadAll();
	}

	public List<ProfessorReport> findALLProfessorReport() {
		// TODO Auto-generated method stub
		return professorsRepository.findAllProfessorReport();
	}

	public List<ProfessorReport> searchProfessor(String professorName) {
		// TODO Auto-generated method stub
		return professorsRepository.searchProfessor(professorName);
		
	}

	public List<Professor> searchProfessorRecord(String professorName) {
		// TODO Auto-generated method stub
		return professorsRepository.searchProfessorRecord(professorName);
	}

}
