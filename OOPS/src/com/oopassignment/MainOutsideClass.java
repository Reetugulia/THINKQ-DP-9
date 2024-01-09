package com.oopassignment;

public class MainOutsideClass {
	//Main outside class
	public static void main(String[] args) {
		OopsQ1Student object=new OopsQ1Student ();
		object.Sname="isha";
		object.studentid=102;
		System.out.println("student name:"+object.Sname);
		System.out.println("student name:"+object.studentid);
		
		//Q4 INITIALISATION THROUGH REFERENCE
		OopsQ1Student object1=new OopsQ1Student ();
		System.out.println("student name:"+object1.Sname);
		
	}
	

}
