package com.securecodetips.service;

import org.springframework.stereotype.Service;


import com.securecodetips.model.Professor;

import java.util.ArrayList;
import java.util.List;

@Service("professorServiceImpl")
public class ProfessorServiceImpl implements ProfessorService {
	public List<Professor> professors=new ArrayList<Professor>();
	public void addProfessor(Professor professor){
		if (professor.getPname()!=null)
	    	   professors.add(professor) ; 
		
	}

	public  List<Professor> findAllProfessors() {
		
		return professors;
	}
}
