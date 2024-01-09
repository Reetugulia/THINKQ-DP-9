package com.demostatic;

public class Demostatic {
	int x=10;
	static int y=10;
	
	void show()
	{
		x++;
		y++;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
	}
	public static void main(String[] args) {
		Demostatic s1=new Demostatic ();
		s1.show();
		
		Demostatic s2=new Demostatic ();
		s2.show();
		
		Demostatic s3=new Demostatic ();
		s3.show();
		
	}

}
