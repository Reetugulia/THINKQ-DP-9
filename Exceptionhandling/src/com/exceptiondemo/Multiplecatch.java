package com.exceptiondemo;

import java.util.Scanner;

public class Multiplecatch {
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
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+"zero error");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e+"array index is greater");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	
	}

}
