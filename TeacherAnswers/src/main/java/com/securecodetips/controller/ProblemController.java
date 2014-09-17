package com.securecodetips.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.securecodetips.model.Problem;
import com.securecodetips.model.Professor;
import com.securecodetips.service.ProblemService;

@Controller
@SessionAttributes("problem")

public class ProblemController {
	@Autowired
	private ProblemService problemService;

	@RequestMapping(value="/addQuestion", method=RequestMethod.GET)
	public String addProblem(Model model, HttpSession session){
		
		Problem problem=new Problem();		
		model.addAttribute("problem", problem);
		//model.addAttribute("pmessage", "The new question added is: ");
		
		return "addQuestion";
		
	}
	
	
@RequestMapping(value="/addQuestion", method=RequestMethod.POST)
public String updateProblem(@ModelAttribute("problem") Problem problem, HttpSession session){
	System.out.println("Question was Updated "+problem.getQuestion());
	Professor professor=(Professor)session.getAttribute("professor");
	//tSystem.out.println("*******************"+professor.getPname());
	
	
		problem.setProfessor(professor);
	problemService.save(problem);
	return "redirect:showFaculty.html";
	
}
}
