package com.logicals;

import java.util.Arrays;

public class SortingStringArray {
	public static void stringsorting(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()==s[j].length())
				{
					if(s[i].compareTo(s[j])>0)
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=s[i];
					}
				}
				else if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=s[i];
				}
			}
		}
	}
	public static void main(String[] args) {
		String s[]= {"Python","Java","C","Angular"};
		stringsorting(s);
		System.out.println(Arrays.toString(s));
	}

}
