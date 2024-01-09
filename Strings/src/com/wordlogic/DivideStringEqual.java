package com.wordlogic;

import java.util.Arrays;

public class DivideStringEqual {
	public static void divideString(String s,int noofc)
	{
		int len=s.length();
		if(len%noofc!=0)
		{
			System.out.println("can not divide in equal parts");
			
		}
		else
		{
			int n=len/noofc;
			String spltr[]=new String[n];
			int index=0;
			
			for(int i=0;i<s.length();i+=noofc)
			{
				spltr[index]=s.substring(i, i+noofc);
				index++;
			}
			System.out.println(Arrays.toString(spltr));
			
		}
	}
	public static void main(String[] args) {
		String s[]= {"I","am","very","smart"};

		String s1=String.join("", s);
				int noofchar=4;
				divideString(s1,noofchar);
		
				
	}

}
