package com.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class StudentHashmap {
	
	public static void main(String[] args) {
		HashMap<Integer,Student> smap=new HashMap<>();
		smap.put(101, new Student(1,"reetu"));
		smap.put(102, new Student(2,"arpita"));
		smap.put(103, new Student(3,"pranay"));
		for(Map.Entry<Integer,Student> e:smap.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		smap.put(101, new Student(2,"pooja"));
		System.out.println("-------------------------------------");
		for(Map.Entry<Integer,Student> e:smap.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		
		
		
		
		
		
		
		
	}

}
