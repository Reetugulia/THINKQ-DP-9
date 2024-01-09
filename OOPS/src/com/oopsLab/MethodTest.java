package com.oopsLab;
 class testmethod{
	 
	 void add(int num1,float num2) 
	 {
		System.out.println("addition of int and float:"+(num1+num2)); 
	 }
	 void add(float num1,int num2) 
	 {
		System.out.println("addition of float and int:"+(num1+num2)); 
	 }
 }
public class MethodTest {
	public static void main(String[] args) {
		testmethod t1=new testmethod();
		t1.add(1f, 2);
		t1.add(2, 5f);
		//t1.add(10, 10);
	}

}
