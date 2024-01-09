package com.arraylist2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void reverseArray(ArrayList<String> list)
	{
	
		
		
	}
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("kiwi");
		a1.add("banana");
		a1.add("orange");
		a1.add("apple");
		System.out.println(a1);
	//	reverseArray(a1);
	//	Collections.reverse(a1);
		Collections.sort(a1);
		System.out.println(a1);
	}

}
