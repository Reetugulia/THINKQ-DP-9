package com.oopsLab;

public class NumberPattern {
	public static void Number() 
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		Number() ;
	}

}
