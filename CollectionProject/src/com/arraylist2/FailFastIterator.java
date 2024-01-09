package com.arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("kiwi");
		a1.add("banana");
		a1.add("orange");
		a1.add("apple");
		System.out.println(a1);
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals("apple"))
			{
				a1.add("pineapple");//fail fast iterator it throws concurrent modification Exception
			}
		}
		System.out.println(a1);
		
	}

}
