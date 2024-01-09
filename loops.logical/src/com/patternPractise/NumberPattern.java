package com.patternPractise;

public class NumberPattern {
	public static void numpattern()
	{
		int num=1;
		//outer loop
		for(int i=num;i<=10;i++)
		{
			for(int j=1;j<=i;j++)//inner loop
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		numpattern();
		
	}

}
