package com.character;

public class CharacterPattern2 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int sp=i;sp<=2;sp++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("ab");
			}
			System.out.println("");
			
		}
	}

}
