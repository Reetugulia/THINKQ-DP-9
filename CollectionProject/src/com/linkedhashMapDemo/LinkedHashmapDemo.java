package com.linkedhashMapDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String ,Integer> lmap=new LinkedHashMap<>(10,0.9f,true);
		lmap.put("reetu", 1);
		lmap.put("riya", 3);
		lmap.put("arpita", 2);
		lmap.put("pooja", 4);
		for(Map.Entry<String, Integer> e:lmap.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println(lmap.get("riya"));
		System.out.println("-------------------------------------");
		for(Map.Entry<String, Integer> e:lmap.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
