package com.exception2;

import java.util.Scanner;



public class MethodThrow {
	static Scanner sc=new Scanner(System.in);
	public static void enterdetails()
	{
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter marks");
		int marks=sc.nextInt();
		try
		{
			if(marks<0||marks>100)
				throw new RuntimeException("Marks should be between 1 to 100");
			
			
				if(marks>40)
					System.out.println(name+" has passed");
				else
					System.out.println(name+" has not cleared the exam");
			
		}catch(Exception e) 
		{
			System.out.println(e);
		}

			
		
	}
	public static void main(String[] args) {
		enterdetails();
		
	}

}
