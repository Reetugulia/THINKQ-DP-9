package com.encapsulation;

public class Demo {
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		//obj.a=90; private is not accessible
		obj.b=45;
		obj.c=57;
	//	obj.d=45;
		
		//obj.show();
		obj.display();
		obj.printme();
		
	}

}
