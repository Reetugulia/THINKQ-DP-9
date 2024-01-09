package com.wordlogic;

import java.util.Arrays;

public class DivideStringunequal {
	public static void divideunequal(String s,int noofc)
	{
		int len=s.length();
		if(len%noofc!=0)
		{
			
			//remainder
			int x=noofc-(len%noofc);
				for(int i=0;i<x;i++)
				{
					s=s.concat("#");
				}
				
		}
		
		
		len=s.length();
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
	
	public static void main(String[] args) {
		String s[]= {"I","am","very","smart"};

		String s1=String.join("", s);
				int noofchar=5;
				divideunequal(s1, noofchar);
				
	}

}


