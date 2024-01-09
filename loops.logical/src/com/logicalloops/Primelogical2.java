package com.logicalloops;

import java.util.Scanner;

public class Primelogical2 {
	public static boolean checkprime(int num)
	{
		boolean status=true;
		if((num==0)||(num==1))
			status=false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					status=false;
					break;
					
				}
			}
		}
		return status;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		if(checkprime(n))
			System.out.println("prime number");
		else
			System.out.println("Not a prime number");
		sc.close();
		
		
		
	}

}
