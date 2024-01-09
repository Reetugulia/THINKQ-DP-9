package com.comparable;

public class Student implements Comparable <Student>{
	private String name;
	private int id;
	private float marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, float marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
/*		if (this.getId()==s.getId())
			return 0;
		else if(this.getId()<s.getId())
			return -1;
		else 
			return 1;*/
		//***********************************************************
	//	return(this.getId()-s.getId());
		//*********************************************************
	/*	if(this.marks==s.marks)
			return 0;
		else if(this.marks<s.marks)
			return -1;
		else
			return 1;*/
		//************************************************************
		if(this.marks==s.marks)
			return(this.name).compareTo(s.name);
		else if(this.marks<s.marks)
			return -1;
		else
			return 1;
		
	}


}
