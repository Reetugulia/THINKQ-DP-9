package com.logicals;

public class StringArrayComparision {
	public static void findunique(String str1[],String str2[])
	{
		boolean found;
		for(String s2:str2)
		{
			found=false;
			for(String s1:str1)
			{
				if(s2.equals(s1))
				{
					found=true;
					break;
				}
				
			}
			if(!found)
			{
				System.out.println(s2);
			}
		}
			
	}
	public static void main(String[] args) {
		String s1[]= {"pooja","pranali","nisha"};
		String s2[]= {"pranay","arpita","pooja","pranali","nisha","reetu"};
		findunique(s1, s2);
	}

}
