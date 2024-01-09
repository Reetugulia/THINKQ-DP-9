package com.advancelogicloops;

import java.util.Scanner;

public class  Krishnamurti {
	public static long calculatefactorial(int n) 
	{
		long fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	
	public static void checkKrishnamurti(int no)
	{
		int original=no;
		long sum=0;
		do
		{
			int rem=no%10;
			sum=sum+calculatefactorial(rem);
			/*
			 * long fact=1;
			for(int i=1;i<=rem;i++)
				fact=fact*i;
			 sum=sum+fact;
			 */
			no/=10;
		}while(no!=0);
		if(original==sum)
			System.out.println(original+"  a krishmutri number");
		else
			System.out.println(original+" is not a krishmutri number");
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		checkKrishnamurti(n);
		
		
	}

}
