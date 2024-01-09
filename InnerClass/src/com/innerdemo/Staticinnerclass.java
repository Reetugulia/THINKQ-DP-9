package com.innerdemo;
class Parent
{
	static int num1=89;
	int num2=90;
	
	void display()
	{
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
	static class Inner
	{
		String msg1="Hi";
	   static String msg2="welcome";
	   
	   void show() 
	   {
		   System.out.println("num1:"+num1);
		//   System.out.println("num2:"+num2);
		//   display();
		   
		   System.out.println("message:"+msg1);
		   System.out.println("message:"+msg2);
		   
		   Parent p1=new Parent();
		   p1.display();
	   }
	}
}
public class Staticinnerclass {
	public static void main(String[] args) {
		Parent.Inner p2=new Parent.Inner();
		p2.show();
	System.out.println("------------------------------------------------");	
		
		Parent p=new Parent();
		p.display();
		
	}

}
