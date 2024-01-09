package com.logicals;

import java.util.Scanner;

public class ReplaceDuplicates {
	public static String replaceduplicate(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{//st=st.replace(st.charAt(j),'#')replace all
					ch[j]='$';
				}
			}
		}
		s=new String(ch);
		return s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String s=sc.next();
		System.out.println("original word:"+s);
		System.out.println("new word:"+replaceduplicate(s));
		
	}
	

}
