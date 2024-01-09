package com.overridingexception;

import java.io.IOException;

class Parent1{
	int data=50;
	
	//not throwing exception
	void printData() throws Exception{
		System.out.println(data);
		throw new IOException("input error");
	}
	
	
	//not throwing exception
	void printData2() throws ArithmeticException,IOException{
		System.out.println(data/0);
	}
}

class child1 extends Parent1{
	int val=0;
	
	void printData2() throws ArithmeticException,IOException{
		System.out.println(data/val);
		
	}//throw new IOException
	//throw any unchecked / either same checked or child class of checked
	void printData() throws ArithmeticException,IOException{
		if(val==0)
			throw new ArithmeticException();
		System.out.println(data/val);
		//throw IOException
	}
}
public class Demo2 {
	public static void main(String[] args) {
		
	}

}
