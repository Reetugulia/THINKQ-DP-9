package com.logicals;

public class Replacevowel {
	public static void replacevowel(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='o'||c[i]=='i'||c[i]=='u'||c[i]=='A'||c[i]=='I'||c[i]=='E'||c[i]=='O'||c[i]=='U')
			{
				c[i]='#';
			}
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		String s="Education";
		System.out.println(s);
		replacevowel(s);
	}

}
