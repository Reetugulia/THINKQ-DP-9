package com.patternPractise;

public class ReverseTriangle {
	public static void reversetriangle()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
		
	}
	
	
	public static void main(String[] args) {
		reversetriangle();
		
	}

}
