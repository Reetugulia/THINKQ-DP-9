package com.methodoverloading;
 class room
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

public class RoomOverloading {
	public static void main(String[] args) {
		room r1=new room();
		r1.roomarea(4);
		r1.roomvolume(5,6,7);
		
		
		room r2=new room();
		r2.roomarea(5);
		r2.roomvolume(5,6,7);
		
	}

}
