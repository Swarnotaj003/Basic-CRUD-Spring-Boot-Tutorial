package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public String getAllStudents(Model model) {
		List<Student> studentList = studentService.getAllStudents();
		model.addAttribute("studentList", studentList);
		return "student/home";
	}
	
	@GetMapping("/search/prefix")
	public String searchStudentByPrefix(Model model, @RequestParam String prefix) {
		List<Student> studentList = studentService.searchStudentByPrefix(prefix);
		model.addAttribute("studentList", studentList);
		return "student/home";
	}
	
	@GetMapping("/search/roll")
	public String searchStudentByRoll(Model model, @RequestParam Integer roll) {
		List<Student> studentList = studentService.searchStudentByRoll(roll);
		model.addAttribute("studentList", studentList);
		return "student/home";
	}
	
	@PostMapping("/add")
	public String addStudent(@Validated @ModelAttribute Student student) {
		studentService.addStudent(student);
		return "redirect:/student";
	}
	
	@PostMapping("/delete")
	public String deleteStudent(@RequestParam int roll) {
		studentService.deleteStudent(roll);
		return "redirect:/student";
	}
}
