package com.advancelogicloops;

import java.util.Scanner;

public class PerfectNumber {
	public static void checkperfectnum(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			
			if(num%i==0)
			 sum+=i;
		}
		if(sum==num)
			System.out.println(num+"is a perfect number");
		else
			System.out.println(num+"is a  not perfect number");
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		checkperfectnum(n);
		
			
				
		
		
	}

}
