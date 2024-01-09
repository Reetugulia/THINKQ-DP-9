package com.verages;

public class VeragesDemo {

	static void display1(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	//ellipsis
	static void display2(int ...a1)
	{
   
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		display2(1);
		
	}

}
