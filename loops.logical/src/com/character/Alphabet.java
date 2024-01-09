package com.character;

public class Alphabet {
	public static void main(String[] args) {
		for(int i='A';i<='D';i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
		System.out.println("////////////////////////");
		for(char ch='A';ch<='D';ch++)
		{
			for(char j='A';j<=ch;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

