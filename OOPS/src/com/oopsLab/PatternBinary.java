package com.oopsLab;

public class PatternBinary {
	public static void pattern() 
	{
		int temp=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(temp==1)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		pattern() ;
	}

}
