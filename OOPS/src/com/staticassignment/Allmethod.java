package com.staticassignment;
 class combMethod{
	 int id;
	 int name;
	 
	 static
	 {
		 System.out.println("static block");
	 }
	 
	 {
		 System.out.println("instance block");
	 }
	 combMethod()
	 {
		 System.out.println("default constructor");
	 }
	 combMethod(int id,int name)
	 {
		 this.id=id;
		 this.name=name;
		 System.out.println("perimetrised constructor");
	 }
	 static void staticmethod() 
	 {
		 System.out.println("static method");
	 }
	 	 
 }
public class Allmethod {
	public static void main(String[] args) {
		combMethod c1=new combMethod();
		System.out.println(c1);
	}

}
