package com.advancelogicloops;

import java.util.Scanner;

public class ArmstrongNumber { 
	public static int countDigit(int n)
	{
		int count=0;
		do
		{
			count++;
			n/=10;
		}while(n!=0);
		return count;
		
	}
	public static int callpower(int b,int p)
	{
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result*=b;
		}
		return result;	
	}
	
	public static void checkArmstrong(int n)
	{
		int original=n;
		int sum=0;
		
		int noOfDigits= countDigit(n);
		do
		{
			int rem=n%10;
			sum=sum+callpower(rem,noOfDigits);
			n/=10;
		}while(n!=0);
		if(original==sum)
			System.out.println(original+" is a armstrong number");
		else
			System.out.println(original+"is not a armstrong number");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		checkArmstrong(num);
		
		

  }
}