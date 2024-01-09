package com.setdemo;

import java.util.TreeSet;

public class TreeSetMethod {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(1);
		ts.add(23);
		ts.add(34);
		ts.add(43);
		ts.add(87);
		ts.add(99);
		ts.add(55);
		//sorted set
		System.out.println(ts );
		System.out.println("first:"+ts.first());
		System.out.println("last:"+ts.last());
		///
		System.out.println(ts.headSet(23));
		System.out.println(ts.tailSet(43));
		
		///
		System.out.println("lower:"+ts.lower(43));//strictly lower
		System.out.println("floor:"+ts.floor(43));//equal or lower
		
		//
		System.out.println("higher:"+ts.higher(87));//strictly high
		System.out.println("high:");
	}

}
