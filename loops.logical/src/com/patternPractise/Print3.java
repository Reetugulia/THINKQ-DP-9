package com.patternPractise;

public class Print3 {
	public static void  three()
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==3||i==5||j==5)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		three();
		
	}

}
