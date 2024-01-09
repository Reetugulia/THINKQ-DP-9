package com.loopsassignment;

import java.util.Scanner;

public class Oddsum {
	public static int sumodd(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0) {
				sum=sum+i;
			
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		
		System.out.println("odd sum"+sumodd(n));
		sc.close();
	}

}
