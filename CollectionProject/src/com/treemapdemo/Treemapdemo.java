package com.treemapdemo;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Treemapdemo {
	public static void main(String[] args) {
		TreeMap<String,Integer> tmap= new TreeMap<String, Integer>();
		tmap.put("java",101);
		tmap.put("python",103);
		tmap.put(".net",104);
		tmap.put("javascipt",102);
		////////
		NavigableMap<String ,Integer> ns=tmap.descendingMap();
		for(Map.Entry<String, Integer> e:ns.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println("---------------------------------");
		NavigableSet<String> key=tmap.navigableKeySet();
		for(String s:key)
		{
			System.out.println(s+"--->"+tmap.get(s));
		}
		
		
	}

}
