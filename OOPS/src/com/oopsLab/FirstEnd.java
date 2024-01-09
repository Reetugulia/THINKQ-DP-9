package com.oopsLab;

import java.util.Scanner;

public class FirstEnd {
	public static boolean CheckPrime(int num)
	{
		if(num==0||num==1)
			return false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if((num%i)==0)
				{
					return false;
				}
			}
			return true;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your starting number");
		int num1=sc.nextInt();
		System.out.println("enter your end number");
		int num2=sc.nextInt();
		System.out.println("prime number from:"+num1+"to "+num2);
		for(int i=num1;i<=num2;i++)
		{
			if( CheckPrime(i))
				System.out.println(i);
			
		}
		

	}

}
