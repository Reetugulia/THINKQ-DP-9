package com.logicalloops;

import java.util.Scanner;

public class ReverseOfNumber {
	public static int reversenum(int num)
	{
		int revnum=0;
		do
		{
			int rem=num%10;
			revnum=(revnum*10)+rem;
			num/=10;
			
		}while(num!=0);
		return revnum;
	}
	
	
	public static void main(String[]args) {
		System.out.println("enter your number");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println("reversenum(n): "+reversenum(n));
		sc.close();
		
	}
	

	}


