package com.patternPractise;

public class HutShape {
	public static void hut()
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
			System.out.println();

		}
		for (int i=6;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		hut();
		
	}

}
