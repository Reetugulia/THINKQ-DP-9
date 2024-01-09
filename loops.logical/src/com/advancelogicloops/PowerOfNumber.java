package com.advancelogicloops;

import java.util.Scanner;

public class PowerOfNumber {
	public static int calpower(int b,int p)
	{
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result*=b;
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base");
		int base=sc.nextInt();
		
		System.out.println("enter the power");
		int pow=sc.nextInt();
		System.out.println("power is:"+calpower(base,pow));
		calpower(base,pow);
		
	}

}
