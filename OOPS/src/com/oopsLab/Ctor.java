package com.oopsLab;

public class Ctor {
	private static int counter=121;
	
	void Ctor() 
	{
		counter=212;
		System.out.println(Ctor.counter);
	}
	Ctor (int x)
	{
		counter=x;
		Ctor();
	}

}
class MainCtorDemo
{
	public static void main(String[] args) {
		Ctor bg=new Ctor(112);
	}
}
