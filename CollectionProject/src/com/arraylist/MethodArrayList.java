package com.arraylist;

import java.util.ArrayList;

public class MethodArrayList {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		System.out.println(a1.isEmpty());
		a1.add("apple");
		a1.add("banana");
		a1.add("kiwi");
		a1.add("mango");
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println("--------------------------------");
		a1.remove(1);
		System.out.println(a1);
		System.out.println(a1.remove("kiwi"));
		System.out.println("-------------------------------------");
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add(null);
		a2.add("apple");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("------------------------------");
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(1,a2);
		System.out.println("-----------------------------------");
		a1.contains(a2);//keep only a2 elements
		System.out.println(a1);
		a1.remove(a2);//remove only a2 elements
		System.out.println(a1);
		System.out.println("-------------------------------------------");
		
		
		System.out.println(a1.size());
		
		
	}

}
