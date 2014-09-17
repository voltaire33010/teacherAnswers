package com.securecodetips.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.securecodetips.model.Professor;
import com.securecodetips.model.ProfessorReport;
import com.securecodetips.service.ProfessorService;
import com.securecodetips.service.Professorsservice;


@Controller
@SessionAttributes("user")
public class ProfessorController {

	@Autowired
	private Professorsservice professorsservice;
	@Autowired
	private ProfessorService professorService;
	
	@RequestMapping(value="/showFaculty", method=RequestMethod.GET)
	public String addProblem(Model model, HttpSession session){
		
		// Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	 //String name = auth.getName();
    	// model.addAttribute("user", name);
    	 
    	 Professor professor=new Professor();
    	 model.addAttribute("professor", professor);
	
		 return "showFaculty";
		
		
	}
@RequestMapping(value="/showFaculty", method=RequestMethod.POST)
public String updateProfessor(@ModelAttribute("professor") Professor professor, HttpSession session ){
	
	
	professorsservice.save(professor);
	session.setAttribute("professor", professor);
	return "redirect:showFaculty.html";
}







@RequestMapping(value="getProfessors", method=RequestMethod.GET)
public String getProfessors(Model model){
	
	List<Professor>professors=professorsservice.findALLProfessors();
	
	
	model.addAttribute("professors", professors);
	return "getProfessors";
	
	
}

@RequestMapping(value="getProfessorReport", method=RequestMethod.GET)
public String getProfessorReport(Model model){
	
	List<ProfessorReport> professorReport=professorsservice.findALLProfessorReport();
	
	
	model.addAttribute("professorReport", professorReport);
	return "getProfessorReport";
	
	
}








 @RequestMapping(value = "/professors", method = RequestMethod.GET)
	public @ResponseBody List<Professor> findAllProfessors() {
	/**	List<Professor> professors=new ArrayList<Professor>();
	Professor rosa=new Professor();
		rosa.setPname("Rosa Quiala");
		rosa.setPsubject("Writing");
		professors.add(rosa);
		
		Professor benita=new Professor();
		benita.setPname("Benita Melba");
		benita.setPsubject("History");
		professors.add(benita);
		
		Professor paulina=new Professor();
		paulina.setPname("Paulina Garcia");
		paulina.setPsubject("Biology");
		professors.add(paulina);**/
		return professorService.findAllProfessors();
		
	}
}
