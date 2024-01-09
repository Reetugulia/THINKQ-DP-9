package com.pojo;

public class Course {
	private int cid;
	private String cname;
	private Double cfees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname, Double cfees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfees = cfees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getCfees() {
		return cfees;
	}
	public void setCfees(Double cfees) {
		this.cfees = cfees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
	}
	

}
