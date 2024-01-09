package com.basics;

public class EqualComparision {
	public static void main(String[] args) {
		//literals
		//==to compare id
		//.equal compare values
		String s1="hello";
		String s2="hello";
		
		//using new keyword
		String s3=new String("hello");
		String s4=new String("hello");
		
		System.out.println(s1==s2);//compare reference :id is same
		System.out.println(s1.equals(s2));//compare value created by literals
		
		System.out.println("-----------------------------------");
		System.out.println(s1==s3);//id not same
		System.out.println(s1.equals(s3));//value is same
		
		System.out.println("-----------------------------------");
		
		System.out.println(s3==s4);//id not same
		System.out.println(s3.equals(s4));//value is same
		
	}
	

}
