package com.logicals;

import java.util.Arrays;

public class Anagram {

	public static boolean checkanagram(String st1,String st2)
	{
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		if(st1.length()!=st2.length())
			return false;
		else
		{
			char ch1[]=st1.toCharArray();
			char ch2[]=st2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			//compare
			if(!Arrays.equals(ch1, ch2))
				return false;
		}
		return true;
			
	}
	public static void main(String[] args) {
		String s1="Race";
		String s2="fare";
		if(checkanagram(s1, s2))
			System.out.println(s1+","+s2+":are anagram");
		else
			System.out.println(s1+","+s2+":are not anagram");
		
	}

}
