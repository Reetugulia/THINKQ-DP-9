package com.oopsLab;

import java.util.Scanner;

public class CheckArmstrong {
	public static int countDigit(int num) 
	{
		int count=0;
		do
		{
			count++;
			num=num/10;
			
		}while(num!=0);
		return count;
	}
	public static  int power(int num,int p)
	{
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow*=num;
		}
		return pow;
		
	}
	public static void armstrongnumber(int num) {
		int original=num;
		int sum=0;
		int noofdigit= countDigit(num) ;
		do
		{
			int rem=num%10;
			sum=sum+power(rem,noofdigit);
			num/=10;
		}while(num!=0);
		if(original==sum)
			System.out.println(original+" is armstrong num");
		else
			System.out.println(original+" is not a armstrong num");
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter your number");
        int n=sc.nextInt();
		
		//System.out.println("count digit:"+countDigit(n) ); */
		//System.out.println("power of number:"+power(2,4));
		
        armstrongnumber(n);
	}

}
