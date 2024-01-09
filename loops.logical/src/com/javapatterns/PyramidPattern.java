package com.javapatterns;

public class PyramidPattern {
	public static void pyramid()
	{
		for(int i=1;i<=5;i++)//rows
		{
			for(int sp=1;sp<=(5-i);sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
				
		}
		for(int i=4;i>=1;i--)
		{
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		pyramid();
		
	}

}
