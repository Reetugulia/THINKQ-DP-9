package com.whileloop;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=1;
		int sum=0;
		while(num!=0)
		 {
			System.out.println("enter any number");
			num=sc.nextInt();
			sum+=num;
		}
		System.out.println("sum is"+sum);
		sc.close();
	}

}
