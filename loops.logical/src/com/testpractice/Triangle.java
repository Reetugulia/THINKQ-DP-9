package com.testpractice;

public class Triangle {
	public static void tri() 
	{
		for(int i=1;i<=5;i++)
		{
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
				}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args) 
	{
		tri();
	}

}
