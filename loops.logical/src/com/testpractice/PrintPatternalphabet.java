package com.testpractice;

public class PrintPatternalphabet {
	public static void alphabet() 
	{
		
		
		for(int i='a';i<='d';i++)
		{
			for(int j='a';j<=i;j++)
			{
				
				System.out.print((char)j);
				
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		alphabet();
	}
	

}
