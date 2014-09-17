package com.securecodetips.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Problem {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne 
	private Professor professor;
	
	private String question;
	private String answer;
	public String getAnswer() {
		return answer;
	}
	public long getId() {
		return id;
	}
	public Professor getProfessor() {
		return professor;
	}
	public String getQuestion() {
		return question;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	

}