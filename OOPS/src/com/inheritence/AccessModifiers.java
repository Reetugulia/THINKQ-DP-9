package com.inheritence;

public class AccessModifiers {
	//instance variable and methods
	private int a;
	int b;
	public int c;
	protected int d;
	
	private void show()
	{
		System.out.println("Private Method");
	}
	
	void display()
	{
		System.out.println("Default Method");
	}
	
	public void printme()
	{
		System.out.println("Public Method");
	}
	protected void display1()
	{
		System.out.println("Protected method");
	}
	public static void main(String[] args) {
		//inside the class everything is accessible
		//create object
		 AccessModifiers a1=new AccessModifiers();
		 a1.a=90;
		 a1.b=45;
		 a1.c=67;
		 a1.d=45;
		 System.out.println(a1.a);
		 System.out.println(a1.b);
		 System.out.println(a1.c);
		 
		 a1.show();
		 a1.display1();
		 a1.printme();
		 
		 
		
		
	}

}
