package com.abstractassign;
abstract class Student
{
	 abstract void show();
	   
	  void detail() 
	  {
		  System.out.println("abstract class");
	  }
	 
}
class Schoolstudent extends Student
{
	 String name;
	 int id;
     final static String schoolname="DhLawrence";
	
	public Schoolstudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Schoolstudent(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override

	public  void detail() 
	  {
		  System.out.println("child class");
	  }
		void show() {
			// TODO Auto-generated method stub
			System.out.println("student id:"+id+" "+"school name:"+schoolname);
		}
	}
public class AbstractClass {
	public static void main(String[] args) {
		Student s;
		s=new Schoolstudent("sunil",2);
		s.show();
		System.out.println("----------------------------------------------------");
		s.detail();
	}


}
