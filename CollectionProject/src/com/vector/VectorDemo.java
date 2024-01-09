package com.vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> lang=new Vector<>(5,2);//double if not given
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		lang.add("C");
		lang.add("Java");
		lang.add("python");
		lang.add("angular");
		lang.add(".net");
		System.out.println("------------------------");
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		lang.add("c");
		System.out.println("------------------------");
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		//methods
		lang.add(0, "javascript");
		System.out.println("------------------------");
		System.out.println(lang);
		lang.elementAt(1);
		System.out.println("------------------------");
		System.out.println(lang);
		lang.insertElementAt("danjo", 2);
		System.out.println(lang);
		
		
	}

}
