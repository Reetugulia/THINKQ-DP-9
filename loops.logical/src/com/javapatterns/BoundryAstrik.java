package com.javapatterns;

public class BoundryAstrik {
	public static void boundry()
	{
		for(int i=1;i<=5;i++)
		{ for(int j=1;j<=5;j++)
		{
			if(i==1||i==5)
				  System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	
		}
}
	
	
	
	
	
	public static void main(String[] args) {
		boundry();
		
	}

}
