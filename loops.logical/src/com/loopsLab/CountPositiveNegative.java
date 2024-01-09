package com.loopsLab;

import java.util.Scanner;

public class CountPositiveNegative {
	public static void countpositive() {
		int poscount=0;
		int negcount=0;
		int zerocount=0;
		int num;
		char ch;
		do
		{
			System.out.println("Enter number :");
			Scanner sc=new Scanner(System.in);
			 num=sc.nextInt();
			if(num>0)
				poscount++;
			else if(num<0)
				negcount++;
			else
				zerocount++;
			System.out.println("do you want enter more number:");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		System.out.println("positivecount"+poscount);
		System.out.println("negativecount"+negcount);
		System.out.println("negativecount"+zerocount);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		countpositive();
		
	}

}
