package com.methodoverloading;
 class myroom
 {
	 void roomarea(int side)
	 {
		System.out.println("area of cubical room:"+side*side); 
	 }
	 
	 void roomarea(int length,int breadth)
	 {
		System.out.println("area of rectangle room:"+length*breadth); 
	 }
	 void roomvolume(int side)
	 {
		 System.out.println("volume of cube room:"+side*side*side);
	 }
	 void roomvolume(int length,int breadth,int height)
	 {
		 System.out.println("volume of cuboid room:"+length*breadth*height);
	 }
	 	 
 }

public class RoomOverloading2 {
	public static void main(String[] args) {
		 myroom r1=new  myroom();
		r1.roomarea(4);
		r1.roomvolume(5,6,7);
		
		
		 myroom r2=new  myroom();
		r2.roomarea(5);
		r2.roomvolume(5,6,7);
		
	}

}
