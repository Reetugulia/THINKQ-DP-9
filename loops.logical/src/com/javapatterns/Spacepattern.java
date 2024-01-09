package com.javapatterns;

public class Spacepattern {
	public static void pattern1()
	{
		for(int i=1;i<=5;i++)//row
		{
			for(int sp=1;sp<=4;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		pattern1();
		
		
	}

}
