package com.oopsLab;
 
class sum{
	
	
	void add(int num1,int num2) 
	{
		System.out.println("addition of two numbers"+(num1+num2));
	}
	void add(int num1,int num2,int num3)
	{
		System.out.println("adition of three numbers:"+(num1+num2+num3));
	}
}


public class Addition {
	public static void main(String[] args) {
		sum s1=new sum();
		s1.add(1, 2);
		s1.add(2, 3,4);
	}

}
