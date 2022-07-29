package com.cgi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cgi.model.Student;
import com.cgi.repository.StudentRepository;
import com.cgi.template.Course;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository sr;
	
	@Autowired
	private RestTemplate rt;
	
	public Student save(Student s) {
		return this.sr.save(s);
	}
	
	public Student getById(int id) {
		return this.sr.findById(id).get();
	}
	
	public Course getCourseById(int id) {
		Course c = this.rt.getForObject("http://localhost:7001/api/course/"+id,Course.class);
		return c;
	}

}
