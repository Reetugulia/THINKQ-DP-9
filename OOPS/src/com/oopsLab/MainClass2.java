package com.oopsLab;
class A
{
	static void methodOne() {
		System.out.println("AAA");
	}
	}
class B extends A
{
	static void methodOne() 
	{
		System.out.println("BBB");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		A a=new B();
		a.methodOne();
	}

}
