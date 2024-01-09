package com.advancelogicloops;

import java.util.Scanner;

public class PerfectSquare {
	public static boolean checkPerfactsq(int num)
	{
		for(int i=1;i<num;i++)
		{
			if((i*i)==num)
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your number");
		int num=sc.nextInt();
		
		if(checkPerfactsq(num))
			System.out.println(num+" is a perfect square");
		else
			System.out.println(num+" is  not a perfect square");
		
		
	}

}
