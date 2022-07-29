package com.cgi.template;

public class Course {
	
	private int cid;
	
	private String name;
	
	private int duration;

	public Course(int cid, String name, int duration) {
		super();
		this.cid = cid;
		this.name = name;
		this.duration = duration;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Course() {
		super();
	}
}
