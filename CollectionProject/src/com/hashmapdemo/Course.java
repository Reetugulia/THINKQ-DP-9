package com.hashmapdemo;

public class Course {
	private int cid;
	private String name;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
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
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + "]";
	}
	

}
