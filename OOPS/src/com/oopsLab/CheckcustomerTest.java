package com.oopsLab;

import java.util.Scanner;

public class CheckcustomerTest {
	  static Scanner sc=new Scanner(System.in);
	 public static void customerdetail(Customer c1) {
		 System.out.println("enter customer name");
		 c1.setCustomname(sc.next());
		 
		 System.out.println("enter customer id");
		 c1.setCustomid(sc.nextInt());
		 
		 System.out.println("enter customer email");
		 c1.setCustomemail(sc.next());
		 
		 System.out.println("enter customer contact");
		 c1.setCustomcontact(sc.nextInt());
		 	 
	 }
	 public static void main(String[] args) {
		Customer c2=new Customer();
		 customerdetail(c2);
		 System.out.println(c2);
		 
	}
	
			

}
