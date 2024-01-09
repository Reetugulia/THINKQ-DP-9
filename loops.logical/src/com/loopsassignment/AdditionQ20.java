package com.loopsassignment;

import java.util.Scanner;

public class AdditionQ20 {
	public static void milkoil()
	{ 
		long total=0;
		int milk;
		int oil;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter quantity of milk");
			 milk=sc.nextInt();
			System.out.println("enter quantity of oil");
			oil=sc.nextInt();
			total=(40*milk)+(50*oil);
			
			total+=total;
			System.out.println("total:"+total);
			
			
		}while(total<=500);
		System.out.println("total quantity exceed than 500");
		System.out.println("milk quanity:"+milk);
		System.out.println("oil quanity:"+oil);
		
		
	
	}
	
	
	public static void main(String[] args) {
		
		milkoil();
			
	}

}
