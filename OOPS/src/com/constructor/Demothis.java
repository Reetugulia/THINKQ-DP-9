package com.constructor;

class Demo{
	int a;
	int b;
	String name;
	
	Demo()
	{
		//a=10;
		//b=10;
		//name="reetu";
		this(10,10);//constructor chaining
		//note this statement should be here the first statement
		System.out.println("i am default constructor");
	}
	Demo(int a,int b){//differentiate between argument and instance variable
		System.out.println("i am perimetrised constructor");
		this.a=a;
		this.b=b;
		name="reetu";
		
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		addition(this);//pass the another object to another method
	}
	void addition(Demo d)
	{
		System.out.println("Sum:"+(d.a+d.b));
		
	}
	
	Demo show() {
		a=a+10;
		b=b+10;
		name=name="think qu";
		return this;//return the current object
	}
	void printme()//differentiate between local and instance variable
	{
		int a=100;
		System.out.println("local"+a);
		System.out.println("instance:"+this.a);
		this.show();//call one instance method from other
		
	}
	void show1() {
		
		System.out.println("hello");
	}
		
}

public class Demothis {
	public static void main(String[] args) {
		Demo obj1= new Demo();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.name);	
		
		Demo obj2= new Demo(2,3);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.name);	
		System.out.println("--------------------------------------------------------");
		
		Demo obj3= new Demo();
		obj3.display();
		    
		System.out.println("--------------------------");
		    
	    Demo d1;
		Demo obj4= new Demo();
		System.out.println(obj4.a+" "+obj4.b+" "+obj4.name);
	    d1=obj4.show();
	    System.out.println(d1.a+" "+d1.b+" "+d1.name);
		     
		
		
	}

}
