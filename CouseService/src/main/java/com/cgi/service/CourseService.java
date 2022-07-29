package com.cgi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.model.Course;
import com.cgi.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository cr;
	
	public Course saveCourse(Course c) {
		return this.cr.save(c);
	}
	
	public Course getById(int id) {
		return this.cr.findById(id).get();
	}
	
	public List<Course> getAll(){
		return this.cr.findAll();
	}
}
