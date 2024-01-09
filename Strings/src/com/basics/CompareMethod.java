package com.basics;

public class CompareMethod {
	public static void main(String[] args) {
	// lexographically: dictionary
		
		System.out.println("Pranay".compareTo("Pranali"));
		System.out.println("Abha".compareTo("Bhumi")); // 65-66=-1
		System.out.println("Bhumi".compareTo("Abhay"));
		
		System.out.println("Bhumi".compareTo("bhumi"));  // same 0
		
		System.out.println("--------------------------");
		// return type -int
		
		String s1="Reetu";
		String s2="Rina";
		
		System.out.println(s1.length()>s2.length());
		
		System.out.println(s1.compareTo(s2));
		
	}
	}


