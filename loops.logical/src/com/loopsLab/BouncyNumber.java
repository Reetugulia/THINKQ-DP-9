package com.loopsLab;

import java.util.Scanner;

public class BouncyNumber {
	public static boolean incresingNumber(int num)
	{
		int rem;
		int temp=10;
		
		while(num!=0) {
			
			rem=num%10; //1 2
			
			if(temp>rem) {//321>1
			num=num/10;// 32
			temp=rem;// 1
			}
			else {
				break;
			}
		}
		if(num==0) {
			return true;
		}
		return false;
		
	}
	public static boolean descresingNumber(int num)
	{
		int rem;
		int temp=0;//652
		
		while(num!=0) {
			
			rem=num%10; //2
			//System.out.println("rem:"+rem);
			//System.out.println("temp:"+temp);
			if(temp<rem) {//321>1
			num=num/10;// 32
			temp=rem;// 1
			}
			else {
				break;
			}
		}
		if(num==0) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();

		if(incresingNumber(n)) {
			System.out.println(n+" is incresing number");
		}
		else if(descresingNumber(n)) {
			System.out.println(n+" is descresing number");
		}
		else {
			System.out.println("bouncy number");
		}
		
		
		
		
		
	}

}
