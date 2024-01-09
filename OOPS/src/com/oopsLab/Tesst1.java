package com.oopsLab;

public class Tesst1 {
	static int x=10;
	
	public static void main(String[] args) {
		Tesst1 t1=new Tesst1();
		Tesst1 t2=new Tesst1();
		t1.x=20;
		
		System.out.println(t1.x+" ");
		System.out.println(t2.x);
	}

}
