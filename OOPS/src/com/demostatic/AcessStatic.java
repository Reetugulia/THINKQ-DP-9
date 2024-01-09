package com.demostatic;

public class AcessStatic {
	int x=10;
	static int y=20;
	
	void instancemethod() 
	{
		System.out.println(x);
		System.out.println(y);
		staticmethod();	
	}
	
	static void staticmethod() {
		//System.out.println(x);
		 System.out.println(y);
		 AcessStatic obj1=new AcessStatic();
		 System.out.println(obj1.x);
		 
	}
	public static void main(String[] args) {
		staticmethod();
		 AcessStatic obj2=new AcessStatic();
		 obj2.instancemethod();
		
	}

}
