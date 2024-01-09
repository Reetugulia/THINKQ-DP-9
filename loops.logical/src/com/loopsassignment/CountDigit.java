package com.loopsassignment;

import java.util.Scanner;

public class CountDigit {
	public static int count(int num)
	{
		int count=0;
		do
		{
			
			num=num/10;
			count++;
		}while(num!=0);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		System.out.println("count:"+count(n));
		
	}

}
