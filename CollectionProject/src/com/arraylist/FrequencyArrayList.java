package com.arraylist;

import java.util.ArrayList;

public class FrequencyArrayList {
	public static void findFrequency(ArrayList<String> str) 
	{
		int count;
		for(int i=0;i<str.size();i++)
		{
			count=1;
			if(str.get(i).equals("visited"))
				continue;
			for(int j=i+1;j<str.size();j++)
			{
				if(str.get(i).equals(str.get(j)))
				{
					count++;
					str.set(i, "visited");
				}
			}
			System.out.println(str.get(i)+"------"+count);
		}
	}
	public static void main(String[] args) {
		ArrayList<String>s1=new ArrayList<>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("a");
		s1.add("a");
		
		
	}

}
