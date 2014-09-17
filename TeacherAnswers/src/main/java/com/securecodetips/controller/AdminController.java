package com.securecodetips.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.securecodetips.model.Professor;
import com.securecodetips.service.ProfessorService;
import com.securecodetips.service.Professorsservice;



@Controller
@SessionAttributes("user")
public class AdminController {
	//@Autowired
	//private ProfessorService professorService;
	//@Autowired
	//private Professorsservice professorsservice;
	//  public List<Professor> professors=new ArrayList<Professor>();
      @RequestMapping(value="/admin")
     
      public String faculty( Model model){
    //  public String faculty( Model model, @Valid @ModelAttribute("professor") Professor professor,BindingResult result){
    	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	 String name = auth.getName();
    	 model.addAttribute("user", name);
    	  //model.addAttribute("professor", professor);
    	//  if (professor.getPname()!=null){
    	  //professorService.addProfessor(professor);
    	 // professorsservice.save(professor);
    	//  }
    	 // professors.clear();
    	  //professors.set(1, new Professor());
    	 // if (professor.getPname()!=null)
    	 //  professors.add(professor) ; 
    	//  System.out.println("results had errors: "+result.hasErrors());
    	//  System.out.println(professor.getPname()+" of "+professor.getPsubject());
    	//  if (result.hasErrors()){
    	//	  model.addAttribute("error", "your name has too much characteres");
    	//  }
    	// return "showFaculty";
    	  return "redirect:showFaculty.html";
      }
      
      
      /** 	@RequestMapping(value = "/professors", method = RequestMethod.GET)
  	public @ResponseBody List<Professor> findAllProfessors() {
  		//List<Professor> professors=new ArrayList<Professor>();
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
  		professors.add(paulina);
  		return professorService.findAllProfessors();
  		
  	}**/
}
