package com.loopsLab;

import java.util.Scanner;

public class RandomNumber {
	public static void guessnumber()
	{
		int n=6;
		
		System.out.println("guess the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		do
		{
			if(num>6) 
				{
				System.out.println("to high try again");
			    int n1=sc.nextInt();
				}
			else if(num<6)
				{
				System.out.println("to low try again");
			    int no=sc.nextInt();
			    }
			else
				System.out.println("correct number");
			    break;
		}while(num<10);
		
		   
		    		    
		    
		
	}
	
	
	
	
	public static void main(String[] args) {
		guessnumber();
		
	}

}
