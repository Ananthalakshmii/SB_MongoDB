package com.accolite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.collection.Student;
import com.accolite.repository.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		return new ResponseEntity<Student>( studentRepo.save(student),HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
		
	}
	

}
