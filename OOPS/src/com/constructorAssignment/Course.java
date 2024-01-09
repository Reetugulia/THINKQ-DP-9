package com.constructorAssignment;


class subcourse{
	int subCourseId;
	String subCourseName;
	
	public subcourse(){
		System.out.println("i am subcourse default constructor");
	}
	
}

public class Course {
	int courseid;
	String coursename;
	String subcourse;
	
	 public Course(){
		 System.out.println("i am default course constructor");
		
	}
	 public static void main(String[] args) {
		 subcourse s1=new subcourse();
		 System.out.println(s1);
		 
		 Course s2=new Course();
		 System.out.println(s2);
		 
		 	
		 }
	

}
