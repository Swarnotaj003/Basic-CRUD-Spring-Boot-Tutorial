package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	
	@Query(value="SELECT * FROM student WHERE name LIKE CONCAT(?1, '%')", nativeQuery=true)
	List<Student> findByStartName(String name);
}
