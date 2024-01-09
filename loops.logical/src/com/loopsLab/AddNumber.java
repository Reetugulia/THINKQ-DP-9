package com.loopsLab;

import java.util.Scanner;

public class AddNumber {
	public static void numbersAddition()
	{
		int sum=0;
		char ch;
		
		do
		{
			System.out.println("enter two numbers");
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			sum=num1+num2;
			System.out.println("sum:"+sum);
			
			 System.out.println("Do you want to print the sum again");
	         ch=sc.next().charAt(0);
	         
		}while((ch=='y')||(ch=='Y'));
		
		
			
	}
	
	
	public static void main(String[] args) {
		
		numbersAddition();
		
		
		
		
	}

}
