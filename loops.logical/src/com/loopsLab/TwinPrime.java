package com.loopsLab;

import java.util.Scanner;

public class TwinPrime {
	public static boolean checkPrime(int num)
	{
		if(num==0||num==1)
		{
			return false;
		}
		else
		{
			for (int i=2;i<num;i++)
			{
				if(num%i==0)
					return false;
			}
			
		}return true;
	}
		public static boolean checktwinprime(int n1,int n2)
		{
			if(checkPrime(n1)&& checkPrime(n2)&& (n2-n1==2))
					return true;
			else
				return false;
					
					
		}
		
		
		
	
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		 n1=sc.nextInt();
		n2=sc.nextInt();
		if(checktwinprime(n1,n2))
			System.out.println(n1+" and "+n2+ " are twin prime numbers");
		else
			System.out.println(n1+" and "+n2+ " are not a twin prime numbers");
				
				
				
		
		
		
		
		
	}

}
