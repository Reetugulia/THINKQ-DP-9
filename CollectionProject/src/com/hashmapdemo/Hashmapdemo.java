package com.hashmapdemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapdemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<>();
		hmap.put(101,"reetu");
		hmap.put(102,"arpita");
		hmap.put(104, "prachi");
		hmap.put(103, "pranay");
		Set<Entry<Integer,String>> entries=hmap.entrySet();
		for(Entry<Integer,String> e:entries)
		{
			System.out.println(e.getKey()+"---"+e.getValue());
		}
		
	}

}
