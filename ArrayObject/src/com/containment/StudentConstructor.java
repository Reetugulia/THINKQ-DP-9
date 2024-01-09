package com.containment;

public class StudentConstructor {
	public static void main(String[] args) {
		Course c1=new Course(1,"java",65000); 
		Course c2=new Course(2,".ne1",68000); 
		
		Student st[]=new Student[4];
		st[0]=new Student(101,"reetu",c1);
		st[1]=new Student(102,"arpita",c2);
		st[2]=new Student(103,"pranay",c1);
		

		for(Student s:st)
		{
			System.out.println(s);
		}
	}

}
