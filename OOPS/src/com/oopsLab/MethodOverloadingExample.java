package com.oopsLab;

public class MethodOverloadingExample {
	
	public void methodTest(Object object) 
	{
		System.out.println("calling object method");
	}
	public void methodTest(String object) 
	{
		System.out.println("calling string method");
	}
	public static void main(String[] args) {
		MethodOverloadingExample moe=new MethodOverloadingExample();
		moe.methodTest(null);
	}

}
