package com.logicalloops;

import java.util.Scanner;

public class Palimdrom {
	public static boolean checkpalimdrom(int num)
	{
		int original=num;
		int revnum=0;
		do
		{
			int rem=num%10;
			revnum=(revnum*10)+rem;
			num/=10;
			
		}while(num!=0);
		if(original==revnum)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any number");
		int n=sc.nextInt();
		if(checkpalimdrom(n))
			System.out.println(n+" is a palimdrom");
		else
			System.out.println(n+" is not palimdrom");
		sc.close();
		
	}

}
