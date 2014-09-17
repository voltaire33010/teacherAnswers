package com.securecodetips.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.securecodetips.model.Problem;
import com.securecodetips.repository.ProblemRepository;

@Service("Problemservice")
public class ProblemServiceImpl implements ProblemService {
	@Autowired
     private ProblemRepository problemRepository;
	
	@Transactional
	public Problem save(Problem problem) {
		// TODO Auto-generated method stub
		problem=problemRepository.save(problem);
		return problem;
	}

}
