package com.overriding;

public class WrapperDemo {
	public static void main(String[] args) {
		//boxing 
		//primitive to wrapper
		int num=23;
		
		Integer i1=new Integer(45);
		
	//	Integer j=Integer.valueOfnum();
		//auto
		
		Integer k=num;
		System.out.println(i1+"   "+k);
		//unboxing
		//wrapper to primitive
		
		Float f1=new Float(78.3f);
		 float f2=f1.floatValue();
		 
		 //auto
		 float f3=f1;
		 
		 System.out.println(f3);
		
		
	}

} 
