package com.oopsLab;
class ClassOne
{
	void method(String s1) 
	{
		
	}
	void method(String s1,String s2) 
	{
		method(s1,s2,s1+s2);
	}
	void method(String s1,String s2,String s3) 
	{
		System.out.println(s1+s2+s3);
	}
	}
public class MainClass {
	public static void main(String[] args) {
		ClassOne one=new ClassOne();//
		one.method("java","reetu");//we need to create class and method here
	}

}

//yes we overload static method because they overload at the compile time
//yes we can overload main method but jvm take the main(String []args )as main then excecute the code
//yes two method with different return are posible but we cannot use them in method overloading
//polymorphism is the use of one method in many ways.

