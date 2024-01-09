package com.oopsLab;
class Person2
{
	public int number;
}
public class Test {
	public void doThis(int i,Person2 P) 
	{
		i=5;
		P.number=8;
	}
	public static void main(String[] args) {
		int x=0;
		Person2 P=new Person2();
		new Test().doThis(x, P);
		System.out.println(x+" "+P.number);
		
	}

}

