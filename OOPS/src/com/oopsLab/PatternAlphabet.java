package com.oopsLab;

public class PatternAlphabet{
	public static void pattern() 
	{
		char num='A';
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(num);
				num++;
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		pattern() ;
	}
}
