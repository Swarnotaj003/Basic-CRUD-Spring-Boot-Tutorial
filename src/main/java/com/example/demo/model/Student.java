package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNum;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false, unique = true)
	private Long regnNum;
	
	@Column(nullable = false)
	private String language;

	public Student() {
	}

	public Student(int rollNum, String name, Long regnNum, String language) {
		this.rollNum = rollNum;
		this.name = name;
		this.regnNum = regnNum;
		this.language = language;
	}
	
	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRegnNum() {
		return regnNum;
	}

	public void setRegnNum(Long regnNum) {
		this.regnNum = regnNum;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", regnNum=" + regnNum + ", language=" + language + "]";
	}
	
}
