package com.securecodetips.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.securecodetips.model.ProfessorReport;
import com.securecodetips.model.Professor;
import com.securecodetips.service.Professorsservice;

@Controller
@SessionAttributes("Professor")
public class ProfessorReportController {
	@Autowired
	private Professorsservice professorsservice;
	
	
	@RequestMapping(value="/searchProfessor", method=RequestMethod.GET)
	public String searchProfessor(Model model, HttpSession session){
		Professor professor=new Professor();
		//problem.setQuestion("What is a geometric series");
		//problem.setAnswer(" I dont know");
		
		model.addAttribute("professor", professor);
		//model.addAttribute("pmessage", "The new question added is: ");
		//Professor professor=(Professor)session.getAttribute("professor");
		//System.out.println("*******************"+professor.getPname());
		//problem.setProfessor(professor);
		//problemService.save(problem);
		return "searchProfessor";
		
	}
@RequestMapping(value="/searchProfessor", method=RequestMethod.POST)
public String updateProfessor(@ModelAttribute("professor") Professor professor, HttpSession session, Model model){
	System.out.println("profesor report was Updated "+professor.getPname());
	String professorName=professor.getPname();
	//Professor professor=(Professor)session.getAttribute("professor");
	//System.out.println("*******************"+professor.getPname());
	List<ProfessorReport> professorReport=professorsservice.searchProfessor(professorName);
	model.addAttribute("professorReport", professorReport);
		//problem.setProfessor(professor);
	//problemService.save(problem);
	//return "redirect:admin.html";
	//return "redirect:showFaculty.html";
	return "getProfessorReport";
	
}






@RequestMapping(value="/searchProfessorRecord", method=RequestMethod.GET)
public String searchProfessorRecord(Model model, HttpSession session){
	Professor professor=new Professor();
	//problem.setQuestion("What is a geometric series");
	//problem.setAnswer(" I dont know");
	
	model.addAttribute("professor", professor);
	//model.addAttribute("pmessage", "The new question added is: ");
	//Professor professor=(Professor)session.getAttribute("professor");
	//System.out.println("*******************"+professor.getPname());
	//problem.setProfessor(professor);
	//problemService.save(problem);
	return "searchProfessorRecord";
	
}







@RequestMapping(value="/searchProfessorRecord", method=RequestMethod.POST)
public String updateProfessorRecord(@ModelAttribute("professor") Professor professor, HttpSession session, Model model){
	System.out.println("profesor report was Updated "+professor.getPname());
	String professorName=professor.getPname();
	//Professor professor=(Professor)session.getAttribute("professor");
	//System.out.println("*******************"+professor.getPname());
	List<Professor> professorReportRecord=professorsservice.searchProfessorRecord(professorName);
	model.addAttribute("professorReportRecord", professorReportRecord);
		//problem.setProfessor(professor);
	//problemService.save(problem);
	//return "redirect:admin.html";
	//return "redirect:showFaculty.html";
	return "getProfessorRecord";
	
}








}
