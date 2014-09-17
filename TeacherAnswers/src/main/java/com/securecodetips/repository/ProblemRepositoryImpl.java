package com.securecodetips.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.securecodetips.model.Problem;


@Repository("problemRepository")
public class ProblemRepositoryImpl implements ProblemRepository {
	
	@PersistenceContext
	private EntityManager em;

	public Problem save(Problem problem) {
		// TODO Auto-generated method stub
		em.persist(problem);
		em.flush();
		return problem;
	}

}
