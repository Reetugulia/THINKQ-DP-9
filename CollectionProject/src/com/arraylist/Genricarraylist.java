package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Genricarraylist {
	public static void main(String[] args) {
		List <Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(13);
		list1.add(14);
		System.out.println(list1);
		//traverse by loop
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data=(int)list1.get(i)+10;
			list1.set(i, data);
			System.out.println(list1);
			
		}
	}

}
