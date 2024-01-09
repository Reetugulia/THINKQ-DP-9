package com.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		sc.close();
		try
		{
			if(age<0)
				throw new InputMismatchException();//handled by jvm

			System.out.println("you are:"+age+" years old.");	
		}
		catch(InputMismatchException e)
		{
			System.out.println("you have entered negative age in input:"+e);
		}
	}

}
