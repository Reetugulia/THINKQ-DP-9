package com.methodoverloading;

public class MainOverload {
public static void main(String[] args) {
		
		System.out.println("String main");
		main(5);
	}
	
    public static void main( int m) {
		
		System.out.println("Int main");
	}

}
