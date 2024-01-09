package com.containment;

import java.util.Scanner;

import com.oopsLab.MainClas;

public class CollegeUserInput {
	
	static Scanner sc=new Scanner(System.in);
	
	static void enterstudentdetail(Student sd)
	{
		System.out.println("enter the student id");
		sd.setSid(sc.nextInt());
		
		System.out.println("enter the student name");
		sd.setSname(sc.next());
		
		sd.setCourse(new Course());
		System.out.println("enter the course id");
		
		sd.getCourse().setCid(sc.nextInt());
		
		System.out.println("enter course name");
		sd.getCourse().setCname(sc.next());
		
		System.out.println("enter the course fees");
		sd.getCourse().setFees(sc.nextDouble());
		
		
	}
	public static void main(String[] args) {
		Student s2=new Student();
		enterstudentdetail(s2);
		System.out.println(s2);
		
		
		
		
	}
	
	
	

}
