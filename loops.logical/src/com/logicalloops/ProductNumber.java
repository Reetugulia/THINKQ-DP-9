package com.logicalloops;

import java.util.Scanner;

public class ProductNumber {
	public static long numberproduct(int num)
	{
	     long pro=1;
	     do 
	     {
	    	 pro*=(num%10);
	    	 num/=10;
	    	 
	     }while(num!=0);
	   return pro;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		System.out.println("poductnumber "+numberproduct(n));
		sc.close();
	}

}
