package com.oopsLab;
class D
{
	public D(int i) {//constructor
		System.out.println(myMethod(i));
	}
	int myMethod(int i) 
	{
		return ++i+--i;
	}
	
}
class B1 extends D
{
	public B1(int i,int j) 
	{
		super (i*j);
		System.out.println(myMethod(i*j));
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		B1 b=new B1(12,21);
	}

}
