package com.advancelogicloops;

import java.util.Scanner;

public class SumReachesOneDigit {
	public static int reduceNum(int n)
	{
		int sum=0;
		while(n>0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			sum=sum+(n%10);
			n/=10;
		}
		return sum;	
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("rduced number is:"+reduceNum(num));
		reduceNum(num);
		
	}

}
