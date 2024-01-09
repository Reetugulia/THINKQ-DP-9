package com.logicalloops;

import java.util.Scanner;

public class Primelogical {
	public static void checkprime(int num)
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
		if(status)
			System.out.println(num+"num is a prime number");
		else
			System.out.println(num+"num is not a prime number");
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		checkprime(n);
		sc.close();
		
		
	}

}
