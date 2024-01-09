package com.methodoverloading;

class room1{
	int length;
	int breadth;
	int height;
	
	room1(){
		length=breadth=height=0;
	}
	
	room1(int length){
		this.length=length;
		this.breadth=length;
		this.height=length;
	}
	room1(int length,int breadth,int height){
		
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	void roomarea()
	{
		System.out.println("area:"+length*breadth);
	}
	void roomvolume()
	{
		System.out.println("volume:"+(length*breadth*height));
	}
}

public class Hotel {
public static void main(String[] args) {
	room1 r1=new room1(10);
	r1.roomarea();
	r1.roomvolume();
	
	room1 r2=new room1(10,20,30);
	r2.roomarea();
	r2.roomvolume();
}
}
