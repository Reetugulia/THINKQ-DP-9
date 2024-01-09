package com.basics;

public class Methods {
	public static void main(String[] args) {
		String s="Java is fun";
		System.out.println(s.length());
		//char At
		System.out.println("char at 0 index:"+s.charAt(0));
		System.out.println("char at last index:"+s.charAt(s.length()-1));
		//concat,+
		String s1="hello";
		String s2="pune";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		//substring
		System.out.println(s.substring(1));
		System.out.println(s.substring(2, 8));//it will give value from index 2 to 8-1index
		//contains
		System.out.println("--------------------------------");
		System.out.println(s.contains("ava"));
		String s4="Hello";
		System.out.println(s1==s4);
		System.out.println(s1.equalsIgnoreCase(s4));
		
		//upper case convert alphabets in capital
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
		//lowercase
		System.out.println(s4.toLowerCase());
		System.out.println(s4);
		//indexof
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println("--------------------------------------");
		//is empty
		String s5="            ";
		System.out.println(s5.length());
		System.out.println(s5.isBlank());
		System.out.println(s5.isEmpty());//consider length and white space
		
		//trim
		String s6="    java    ";
		System.out.println(s6.length());
		s6=s6.trim();//remove leading and trailing white spaces
		
		System.out.println(s6.length());
	}

}
