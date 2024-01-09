package com.setdemo;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("apple");
		ts.add("chips");
		ts.add("juice");
		ts.add("sweets");
		Iterator<String> itr1=ts.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("----------------------------------");
		Iterator<String> itr=ts.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------");
		NavigableSet<String> nm=ts.descendingSet();
		for(String s:nm)
		{
			System.out.println(s);
		}
	}

}
