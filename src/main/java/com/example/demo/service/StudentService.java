package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

import jakarta.annotation.PostConstruct;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	@PostConstruct
    public void init() {
        addDefaultStudents();
    }
	
	public void addDefaultStudents() {
		if (studentDao.count() == 0) {
			studentDao.save(new Student(1, "Swarnotaj", 10003L, "Java"));
			studentDao.save(new Student(2, "Baibhab", 10004L, "JSP"));
			studentDao.save(new Student(3, "Tarif", 10005L, "Javascript"));
			studentDao.save(new Student(4, "Sonu", 10006L, "Java"));
			studentDao.save(new Student(5, "Arco", 10007L, "Java"));
		}
	}

	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}

	public List<Student> searchStudentByPrefix(String prefix) {
		return studentDao.findByStartName(prefix);
	}
	
	public List<Student> searchStudentByRoll(Integer roll) {
		if (roll == null)
			return getAllStudents();
		List<Student> lst = new ArrayList<>();
		Student st = studentDao.findById(roll).orElse(null);
		if (st == null)
			return null;
		lst.add(st);
		return lst;
	}

	public void addStudent(Student student) {
		studentDao.save(student);
	}

	public void deleteStudent(int roll) {
		studentDao.deleteById(roll);		
	}

}
