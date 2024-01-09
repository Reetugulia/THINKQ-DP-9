package com.logicalloops;

import java.util.Scanner;

public class ExtractDigits {
	public static void findDigit(int num)
	{
		do
		{
			int rem=num%10;
			System.out.println(rem);
			num/=10;
		}while(num!=0);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		findDigit(n);
		sc.close();
		
	}

}
