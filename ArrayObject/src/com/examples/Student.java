package com.examples;

public class Student {
	 private int marks;
	private String name;
	private int rollno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int marks, String name, int rollno) {
		super();
		this.marks = marks;
		this.name = name;
		this.rollno = rollno;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [sid=" + marks + ", name=" + name + ", rollno=" + rollno + "]";
	}
	

}
