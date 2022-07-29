package com.cgi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.model.Student;
import com.cgi.service.StudentService;
import com.cgi.template.Course;
import com.cgi.template.ResponseTemplate;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@PostMapping("/save")
	public ResponseEntity<Student> save(@RequestBody Student s){
		Student student = this.ss.save(s);
		return new ResponseEntity<Student>(student, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/student/{id}")
	public ResponseTemplate getAllDetails(@PathVariable("id") int id) {
		ResponseTemplate rt = new ResponseTemplate();
		Student s = this.ss.getById(id);
		Course c = this.ss.getCourseById(s.getCid());
		rt.setStudent(s);
		rt.setCourse(c);
		return rt;
	}
}
