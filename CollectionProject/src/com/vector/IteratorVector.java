package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorVector {
	public static void main(String[] args) {
		Vector<String> lang=new Vector<>(5,2);//double if not given
	
		lang.add("C");
		lang.add("Java");
		lang.add("python");
		lang.add("angular");
		lang.add(".net");
		System.out.println(lang);
		System.out.println("------------------------------------------");
		for(int i=0;i<lang.size();i++)
		{
			System.out.println(lang.get(i));
		}
		System.out.println("------------------------------------------");
		for(String s:lang)
		{
			System.out.println(s);
		}
		System.out.println("------------------------------------------");
		Iterator<String>itr=lang.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------------");
		ListIterator<String> litr=lang.listIterator(lang.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("------------------------------------------");
		//fail safe iterator
		Enumeration<String>	en=lang.elements()	;
		while(en.hasMoreElements())
		{
			if(en.nextElement().equals("java"))
			{
				lang.add("c++");
			}
				
		}
		System.out.println(lang);
		System.out.println("--------------------------------------------");
		System.out.println("before addition:"+lang);
		System.out.println("---------------------------------");
		Iterator<String> itr1=lang.iterator();
		while(itr1.hasNext())
		{
			if(itr1.next().equals("java"))
			{
				lang.add("C++");
			}
		
		}
		System.out.println("after adding:"+lang);
		
	}

}
