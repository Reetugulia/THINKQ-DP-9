package com.oopsLab;

public class TestClass {
	{
		System.out.println("initialize instance block1");
	}
	{
		System.out.println("initialize instance block2");
	}
	static {
		System.out.println("static block 1");
	}
	static
	{
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		TestClass t1=new TestClass();
	}

}
