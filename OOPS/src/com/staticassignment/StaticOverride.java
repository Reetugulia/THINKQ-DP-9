package com.staticassignment;
class Parent {
  
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
   
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}
public class StaticOverride {
	public static void main(String[] args) {
		  Parent.staticMethod();
	        Child.staticMethod();  

	
	        Parent p = new Child();
	        p.staticMethod(); 
		
	}

}
