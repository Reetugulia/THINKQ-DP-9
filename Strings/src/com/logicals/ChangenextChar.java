package com.logicals;

public class ChangenextChar {
	public static void nextalphabet(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			c[i]=c[i++];
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String s="abcd";
		
	}

}
