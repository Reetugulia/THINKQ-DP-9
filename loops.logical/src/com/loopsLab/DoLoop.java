package com.loopsLab;

import java.util.Scanner;

public class DoLoop {
	public static void LoopDo(){
		int sum;
		char ch;
		
		do
		{
			
			Scanner sc =new Scanner(System.in);
			System.out.println("enter your first number");
			int num1=sc.nextInt();
			System.out.println("enter second number");
			int num2=sc.nextInt();
			sum=num1+num2;
			System.out.println("sum:"+sum);
			System.out.println("Do you want to repeat the addition again");
			 ch=sc.next().charAt(0);
				
		}while(ch=='y'||ch=='Y');
		System.out.println("sum"+sum);
		
	
			
	
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		LoopDo();
		
	}

}
