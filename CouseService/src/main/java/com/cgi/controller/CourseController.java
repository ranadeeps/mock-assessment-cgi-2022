package com.cgi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.model.Course;
import com.cgi.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	private CourseService cs;
	
	@PostMapping("/save")
	public ResponseEntity<Course> save(@RequestBody Course c){
		Course course = this.cs.saveCourse(c);
		return new ResponseEntity<Course>(course, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/allcourse")
	public ResponseEntity<List<Course>> getAll(){
		List<Course> lc = this.cs.getAll();
		return new ResponseEntity<List<Course>>(lc, HttpStatus.OK);
	}
	
	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getById(@PathVariable("id") int id){
		Course course = this.cs.getById(id);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
}
