package com.securecodetips.model;

public class ProfessorReport {
	
	
	private String professorName;
	private String problemQuestion;
	private String problemAnswer;
	
	
	public ProfessorReport(String professorName, String problemQuestion, String problemAnswer){
	this.professorName=professorName;
	this.problemAnswer=problemAnswer;
	this.problemQuestion=problemQuestion;
		
	}
	
	public String getProblemAnswer() {
		return problemAnswer;
	}
	public String getProblemQuestion() {
		return problemQuestion;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProblemAnswer(String problemAnswer) {
		this.problemAnswer = problemAnswer;
	}
	public void setProblemQuestion(String problemQuestion) {
		this.problemQuestion = problemQuestion;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	

}
