package com.testpractice;
import java.util.Scanner;
public class CountDigit {
	public static int count(int n) 
	{
		
		int count=0;
		do
		{
			
			count++;
			n/=10;
			
		}while(n!=0);
		return count;
		
		
		
		}
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number");
		int num=sc.nextInt()	;
		System.out.println("count"+count(num)) ;
		
	}

}
