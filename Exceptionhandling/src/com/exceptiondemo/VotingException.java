package com.exceptiondemo;

import java.util.Scanner;

public class VotingException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		try
		{
			int age=sc.nextInt();
			if(age>18)
				System.out.println("eligible for vote");
			else
				System.out.println("not eligible");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			sc.close();
			System.out.println("compulsory code");
		}
		System.out.println("vote ends........");
		
	}

}
