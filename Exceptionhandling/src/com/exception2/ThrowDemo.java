package com.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		sc.close();
		if(age<0)
			throw new InputMismatchException();//handled by jvm
		else
			System.out.println("you are:"+age+" old.");
	}

}
