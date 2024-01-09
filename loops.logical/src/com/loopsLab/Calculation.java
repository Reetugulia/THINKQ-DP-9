package com.loopsLab;

import java.util.Scanner;

public class Calculation {
	public static void calculations() {
		char ch;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println("which operation do you want to perform");
			System.out.println("option 1:addition");
			System.out.println("option 2:subtraction");
			System.out.println("option 3:multiplication");
			System.out.println("option 4:division");
			int n=sc.nextInt();
			switch(n) {
			case 1:System.out.println("sum"+(num1+num2));
			       break;
			case 2:System.out.println("sub"+(num1-num2));  
			       break;
			case 3:System.out.println("multiply"+(num1*num2)); 
			       break;
			case 4:System.out.println("div"+(num1/num2)); 
			       break;
			}
			System.out.println("Do you want to do the calculations");
			ch=sc.next().charAt(0);
			}while(ch=='y'||ch=='Y');
	}
	public static void main(String[] args) {
		calculations();
		
		
	}

}
