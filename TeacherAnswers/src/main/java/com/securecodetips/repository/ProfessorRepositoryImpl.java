package com.securecodetips.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.securecodetips.model.Professor;
import com.securecodetips.model.ProfessorReport;

@Repository("ProfessorRepository")
public class ProfessorRepositoryImpl implements ProfessorsRepository {
	
	@PersistenceContext
	private EntityManager em;

	public Professor save(Professor professor) {
		// TODO Auto-generated method stub
		em.persist(professor);
		em.flush();
		return professor;
	}

	@SuppressWarnings("unchecked")
	public List<Professor> loadAll() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("Select p from Professor p" );
		@SuppressWarnings("rawtypes")
		List professors=query.getResultList();
		return professors;
	}

	@SuppressWarnings("unchecked")
	public List<ProfessorReport> findAllProfessorReport() {
		// TODO Auto-generated method stub
		
			
		Query query = em.createQuery("Select new com.securecodetips.model.ProfessorReport(p.pname, pm.question, pm.answer) "
				+"from Professor p, Problem pm where p.id = pm.professor.id");
	
		@SuppressWarnings("rawtypes")
		List professorreport=query.getResultList();
		
		
		Object[] arr=professorreport.toArray();
			
		for(int i=0; i<arr.length; i++)
			
		System.out.println("**********************"+((ProfessorReport)arr[i]).getProfessorName());
		
		
		return professorreport;
	}

	@SuppressWarnings("unchecked")
	public List<ProfessorReport> searchProfessor(String professorName) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("Select new com.securecodetips.model.ProfessorReport(p.pname, pm.question, pm.answer) "
				+"from Professor p, Problem pm where p.id = pm.professor.id and p.pname LIKE :cname").setParameter("cname", professorName);
		
		
		
		
		@SuppressWarnings("rawtypes")
		List sprofessorreport=query.getResultList();
		
		// debugging information
		Object[] arr=sprofessorreport.toArray();
		 for(int i=0; i<arr.length; i++)
		 System.out.println("**********************"+((ProfessorReport)arr[i]).getProfessorName());
		// end of debugging
		
		return sprofessorreport;
		
	}

	@SuppressWarnings("unchecked")
	public List<Professor> searchProfessorRecord(String professorName) {
		
		//try
	//{	
		Query query=em.createQuery("Select p from Professor p where p.pname = '" +professorName + "'" );
		
		@SuppressWarnings("rawtypes")
		List professorreport=query.getResultList();
		
	// debugging information	
	Object[] arr=professorreport.toArray();
		for(int i=0; i<arr.length; i++)
		System.out.println("*******************^^^^^^^^^^^^"+((Professor)arr[i]).getPname());
		// end of debugging
		
		return professorreport;	
		
	//}
	/*catch(Exception e){
		e.printStackTrace();
		//e.getSuppressed().getClass().getGenericSuperclass();
		return null;
		
		
	}*/
	
	
	}

}
