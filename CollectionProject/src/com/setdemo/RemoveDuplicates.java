package com.setdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("apple");
		a1.add("mango");
		a1.add("apple");
		a1.add("watermelon");
		a1.add("apple");
		a1.add("mango");
		System.out.println(a1);
		
		System.out.println("---------------------------------");
		HashSet<String> hs=new HashSet<String>(a1);
		System.out.println(hs);
		
	}

}
