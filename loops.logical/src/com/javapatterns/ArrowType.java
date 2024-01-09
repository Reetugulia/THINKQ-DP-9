package com.javapatterns;

public class ArrowType {
	public static void arrow()
	{
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=i;j++)//column
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=4;i>=1;i--)//row
		{
			for(int j=1;j<=i;j++)//column
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		arrow();
		
	}

}
