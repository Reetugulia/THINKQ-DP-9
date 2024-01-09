package com.loopsassignment;

import java.util.Scanner;

public class HarshadNumber {

		
				
	
	public static void checkharshad(int num)
	{
		int originalno=num;
		int sum=0;
		int rem;
		do
		{
			 rem=num%10;
			 sum=sum+rem;
			 num=num/10;

			
		}while(num!=0);
		if(originalno%sum==0)
			System.out.println(originalno+"is a harshad number");
		else
			System.out.println(originalno+"is not a harshad number");
		
		
	}

	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		checkharshad(n);
		
		
		
		
	}

}
