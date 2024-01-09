package com.basics;

public class StringIntern {
	public static void main(String[] args) {
		String s1="java";
		String s2=new String("java");
		System.out.println(s1==s2);
		s2=s2.intern();
		//intern method done memory management it will remove the extra heap reference  and refer it to SCP
		System.out.println(s1==s2);
	}

}
