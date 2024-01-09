package com.setdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentArraylist {
	public static void createmap(ArrayList<Student> slist)
	{
		HashMap<Course,Integer> hm=new HashMap<>();
		for(Student s:slist)
		{
			Course c=s.getCourse();
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c,1);
			}
		}
		for(Map.Entry<Course ,Integer> en:hm.entrySet())
		{
			System.out.println(en.getKey()+":"+en.getValue());
		}
	}
/*	public static void createHasMap(ArrayList<Student> slist)
	{
		HashMap<Course ,Integer> hm=new HashMap<>();
		for(Student s:slist)
		{
			Course c=s.getCourse();
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		for(Map.Entry<Course ,Integer> en:hm.entrySet())
		{
			System.out.println(en.getKey()+":"+en.getValue());
		}
	}*/
	public static void main(String[] args) {
		ArrayList<Student> slist=new ArrayList<>();
		slist.add(new Student(1, "reetu", new Course (101,"java",50000)));
		slist.add(new Student(2, "prachi", new Course (101,"java",50000)));
		slist.add(new Student(3, "pranay", new Course (102,"python",45000)));
		slist.add(new Student(5, "pranali", new Course (102,"python",45000)));
		slist.add(new Student(4, "nisha", new Course (103,".net",40000)));
		
/*		for(Student s:slist)
		{
			System.out.println(s);
		}*/
	//	createHasMap(slist);
		createmap(slist);
	
	
	
	}

}
