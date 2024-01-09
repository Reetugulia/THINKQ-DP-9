package com.stringbufferbuilder;

public class Buffermethods {
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1.capacity());

		sb1.append("Java Programs");
		
		// reverse
		
		System.out.println(sb1.reverse());
		
		// replace
		
     	sb1.reverse();
     	System.out.println(sb1);
		
		sb1.replace(0, 1, "P");// replace 0
		
		System.out.println(sb1);
		
		sb1.replace(1,4,"P"); // replace 1,2,3
		
		System.out.println(sb1);
		
		sb1.replace(0, 1,"Java");
		
		System.out.println(sb1);
		
		sb1.insert(6, "Developer ");
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		
		System.out.println(sb1.charAt(0));
		
		sb1.deleteCharAt(4);
		
		System.out.println(sb1);
		
		System.out.println(sb1.indexOf("Programs"));
		
		sb1.setCharAt(1, 'b');
		System.out.println(sb1);
		
		System.out.println(sb1.substring(3));
		
		System.out.println(sb1.substring(3,6));
		
//		// String Builder 1.5
//		// non thread safe - performance increase
//		
//		StringBuilder st1= new StringBuilder("Hello");
	}
	

}
