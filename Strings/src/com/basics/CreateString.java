package com.basics;

public class CreateString {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		
		
	}

}
