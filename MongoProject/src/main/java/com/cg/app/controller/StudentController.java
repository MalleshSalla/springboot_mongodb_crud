package com.cg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.Student;
import com.cg.app.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	public StudentRepository studentRepository;
	
	@GetMapping(value= "/all")
	public List<Student> getAllStudents(){
		
		return studentRepository.findAll();
		
	}
	
	@PostMapping("/create")
	public String createStudent(@RequestBody Student student) {
		
		Student insertedStudent = studentRepository.insert(student);
		
		return "Student created "+ insertedStudent.getName();
	}
	
	@PutMapping(value="/updateStudent")
	  public Student updateStudent(@RequestBody Student student) {
		
		studentRepository.save(student);
		return student;
	  }
	
	 
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Student id){
	studentRepository.delete(id);
	return "one student is deleted";
		
    }
	
	
}