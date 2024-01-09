package com.basics;

public class StringImmutable {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";//SCP
		System.out.println(s1);
		System.out.println(s2);
		
		s1.concat("program");//here program is only created in heap not in SCP
		//because concat return string which is created in heap only
		System.out.println(s1);
		s1=s1+"program";
		String s3="java program";
		System.out.println(s1);
	}

}
