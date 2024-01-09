package com.treemapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.hashmapdemo.Student;

public class SortHashMap {
	public static void main(String[] args) {
		HashMap<Student,Integer> smap=new HashMap<>();
		smap.put( new Student(1,"reetu"),101);
		smap.put( new Student(2,"arpita"),104);
		smap.put( new Student(3,"pranay"),103);
	/*	for(Entry<Student, Integer> e:smap.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}*/
		System.out.println("---------------------------------");
		TreeMap<Student,Integer> tmap=new TreeMap<>( new NameComparator());
		tmap.putAll(smap);
		
		for(Map.Entry<Student, Integer> e:tmap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
