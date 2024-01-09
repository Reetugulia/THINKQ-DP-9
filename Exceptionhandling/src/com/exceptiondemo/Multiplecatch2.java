package com.exceptiondemo;

import java.util.Scanner;

public class Multiplecatch2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		int ar[]=new int[3];
		try
		{
			for(int i=0;i<ar.length;i++)
			{
				ar[i]=sc.nextInt();
			}
			System.out.println("---------------------");
			for(int i=0;i<=ar.length;i++)
			{
				System.out.println("value:"+100/ar[i]);
			}
		}//we cannot or exception/Runtimeexception
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	
	}

}
