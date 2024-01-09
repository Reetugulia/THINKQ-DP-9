package com.patternPractise;

public class PrintAdd {
	public static void add()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3||j==3)
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
		add();
		
	}

}
