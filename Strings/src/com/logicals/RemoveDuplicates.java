package com.logicals;

public class RemoveDuplicates {
	public static String removeDup(String s)
	{
		String str="";
		boolean found;
		
		for(int i=0;i<s.length();i++)
		{
			found=false;
			for(int j=0;j<str.length();j++)
			{
				if(s.charAt(i)== str.charAt(j))
				{
					found=true;
					break;
				}
					
			}
			if(found==false)
			{
				str= str+s.charAt(i);
			}
		}
			
		
		return str;		
		
	}
	
	public static void main(String[] args) {
		
		String st="Missisipi";
		System.out.println("Original:"+st);
		System.out.println("New:"+removeDup(st));
		
	}

}
