package com.logicals;

public class Anagram2 {
	public static void sortArray(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if (ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	}
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
			sortArray(ch1);
			sortArray(ch2);
			
			//compare
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
					return false;
			}
		}
		return true;
			
	}
	public static void main(String[] args) {
		String s1="Race";
		String s2="care";
		if(checkanagram(s1, s2))
			System.out.println(s1+","+s2+":are anagram");
		else
			System.out.println(s1+","+s2+":are not anagram");
		
	}

}
