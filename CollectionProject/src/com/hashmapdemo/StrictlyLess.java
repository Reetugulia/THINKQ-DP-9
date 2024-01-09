package com.hashmapdemo;

import java.util.HashMap;
import java.util.TreeMap;

public class StrictlyLess {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<>();
		hmap.put(101,"reetu");
		hmap.put(102,"arpita");
		hmap.put(104, "prachi");
		hmap.put(103, "pranay");
		
		TreeMap<Integer,String> tmap=new TreeMap<Integer, String>();
		tmap.putAll(hmap);
		//strictly lower
//		System.out.println(tmap.lowerKey(103));
		////////////////////////////////////////////////
//		System.out.println("------------------------------------");
//		System.out.println(tmap.floorKey(103));
		
		if(tmap.containsKey(tmap.higherKey(103)))
			System.out.println("not null");
		else
			System.out.println(" null");
	}

}
