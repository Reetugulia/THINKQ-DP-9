package com.encapsulation;

public class Section {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(1);
		s1.setMarks(90);
		s1.setName("Sunil");
		
		System.out.println("student name:"+s1.getName()+"  "+"student id:"+s1.getId());
	}

}
