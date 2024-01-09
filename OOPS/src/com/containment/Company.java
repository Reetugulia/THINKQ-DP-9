package com.containment;

import java.util.Scanner;

public class Company {
	 static Scanner sc=new Scanner (System.in);
	 
	 static void employeedetail(Employee e)
	 {
		 System.out.println("enter employee name");
		 e.setEname(sc.next());
		 
		 System.out.println("enter employee id");
		 e.setEid(sc.nextInt());
		 
		 e.setDepartment(new Department());
		 
		 System.out.println("enter the department name");
		 e.getDepartment().setDpname(sc.next());
		 
		 System.out.println("enter the department id");
		 e.getDepartment().setDpid(sc.nextInt());
		 
	 }
	 public static void main(String[] args) {
		Employee e1=new Employee();
		employeedetail(e1);
		System.out.println(e1);
	}

}
