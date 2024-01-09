package com.exception2;

public class checkedpropogation {
	void method1()
	{
		throw new ArithmeticException("input error");
	}
	void method2()
	{
		method1();
	}
	void method3()
	{
		method2();
	}
	public static void main(String[] args) {
		checkedpropogation obj=new checkedpropogation();
		obj.method3();
		
	}

}
