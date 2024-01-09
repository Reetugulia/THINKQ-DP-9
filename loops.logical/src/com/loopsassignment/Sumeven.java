package com.loopsassignment;

import java.util.Scanner;

public class Sumeven {
	public static int evensum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0) {
				sum=sum+i;
			
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		sc.close();
		
		System.out.println("even sum"+evensum(n));
		
		
		
	}

}
