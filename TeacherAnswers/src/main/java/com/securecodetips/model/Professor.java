package com.securecodetips.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;

@Entity
@Table(name="professors")
@Scope("professor")
public class Professor {
	
	@Id
	@GeneratedValue
	@Column(name="PROFESSOR_ID")
	private Long id;
	
	@OneToMany(mappedBy="professor", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Problem> problems=new ArrayList<Problem>();
	
		
    @Size(min = 2, max = 14)
    private String pname;
	private String psubject;
	public Long getId() {
		return id;
	}
	public String getPname() {
		return pname;
	}
	
	
	public List<Problem> getProblems() {
		return problems;
	}
	public String getPsubject() {
		return psubject;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}
	public void setPsubject(String psubject) {
		this.psubject = psubject;
	}

}
