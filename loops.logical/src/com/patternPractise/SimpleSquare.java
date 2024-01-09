package com.patternPractise;

public class SimpleSquare {
	public static void square()
	{
		//outer loop
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		square();
	}

}
