package com.setdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("java");
		hs.add("python");
		hs.add("C++");
		System.out.println(hs.add("java"));
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------");
		for(String s:hs)
		{
			System.out.println(s);
		}
		//we can not iterate by for loop because we dont get get method in collection that we get from list
		HashSet<String> hs1=new HashSet<String>();	
		hs1.add("java script");
		//union
		hs1.addAll(hs);
		System.out.println(hs1);
	}

}
