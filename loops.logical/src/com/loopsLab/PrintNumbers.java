package com.loopsLab;

import java.util.Scanner;

public class PrintNumbers {
	public static void divisible(int num)
	{
		for(int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		divisible(n);
		sc.close();
		
	}

}
