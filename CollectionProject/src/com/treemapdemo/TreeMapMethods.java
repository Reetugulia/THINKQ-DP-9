package com.treemapdemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethods {
	public static void main(String[] args) {
		TreeMap<Integer,String> tmap= new TreeMap<>();
		tmap.put(1,"java");
		tmap.put(2,"python");
		tmap.put(4,".net");
		tmap.put(5,"javascipt");
		tmap.put(3,"c");
		/////
		System.out.println(tmap);
		System.out.println("first key:"+tmap.firstKey());
		System.out.println("first key:"+tmap.lastKey());
		System.out.println("----------------------------------");
		SortedMap<Integer,String> s1=tmap.subMap(3, 6);//3 is included but not 6
		System.out.println(s1);
		System.out.println("----------------------------------");
		//head
		SortedMap<Integer,String> s2=tmap.headMap(3);
		System.out.println(s2);
		///from tail
		System.out.println("----------------------------------");
		SortedMap<Integer,String> s3=tmap.tailMap(2);
		
		System.out.println("--------------------------------------");
		System.out.println(tmap.lowerKey(4));//strictly less
		System.out.println(tmap.floorKey(4));
		System.out.println("-------------------------------");
		System.out.println(tmap.higherKey(3));//strictly high
		System.out.println(tmap.ceilingKey(3));
		
		System.out.println("----------------------------------------");
		SortedMap<Integer,String> s4=tmap.subMap(3, false, 6, true);//by default 3 include and 6 excluded but we change it
		System.out.println(s4);
		System.out.println("----------------------------------------");
		SortedMap<Integer,String> s5=tmap.headMap(3, false);//by default 3 included but we changed it
		System.out.println("s5:"+s5);
		System.out.println("----------------------------------------");
		SortedMap<Integer,String> s6=tmap.tailMap(3, false);
		System.out.println("tail:"+s6);
		//by default
		//from=included
		//to-excluded
		//but we can change it
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
