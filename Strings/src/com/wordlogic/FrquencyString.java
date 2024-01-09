package com.wordlogic;

import java.util.Arrays;

public class FrquencyString {
	public static void Frequencywords(String s)
	{
		String s1[]=s.split("\\s");
		int count;
		for(int i=0;i<s1.length;i++)
		{
			count=1;
			if(s1[i].equals("Visited"))
				continue;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					count++;
					s1[j]="Visited";
				}
			}
			System.out.println(s1[i]+":"+count);
		}
		
	}

	public static void main(String[] args) {
		String s= "A big cat rolling on a big mat wher there is small bat";
		
		Frequencywords(s);
	}

}
