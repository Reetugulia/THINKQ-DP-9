package com.javapatterns;

public class SpaceDecPattern {
	public static void spacedec()
	{
		for(int i=1;i<=5;i++)
		{
			for(int sp=1;sp<=(5-i);sp++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		spacedec();
	}

}
