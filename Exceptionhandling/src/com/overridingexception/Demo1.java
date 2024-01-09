package com.overridingexception;

import java.io.IOException;

class Parent{
	int data=50;
	//not throwing exception
	void printData() {
		System.out.println(data);
	}
	//not throwing exception
	void printData2() throws ArithmeticException{
		System.out.println(data/0);
	}
}
class child extends Parent{
	int val=0;
	//does not throw changed exception
	void printData() throws ArithmeticException{
		if(val==0)
			throw new ArithmeticException();
	}
	void printData2() throws ArithmeticException{
		if(val==0)
			throw new ArithmeticException();
		System.out.println(data/val);
		
	}
}
public class Demo1 {
	public static void main(String[] args) {
		
	}

}
