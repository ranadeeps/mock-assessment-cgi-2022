package com.cgi.template;

import com.cgi.model.Student;

public class ResponseTemplate {
	
	private Student student;
	
	private Course course;

	public ResponseTemplate(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}

	public ResponseTemplate() {
		super();
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
