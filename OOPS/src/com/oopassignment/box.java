package com.oopassignment;



public class box {
	int length=10;
	int breadth=20;
	int height=10;
	
	 void volume() {
		int volume=(length*breadth*height);
		System.out.println("volume:"+volume);
	}
	 public static void main(String[] args) {
		 box v1=new box();
		 
		 v1.volume();
	}
	
	
	

}
