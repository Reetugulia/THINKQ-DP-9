package com.enumdemo;
class Directions{
	public static final String NORTH="NORTH";
	public static final String SOUTH="SOUTH";
	public static final String EAST="EAST";
	public static final String WEST="WEST";
}

public class Enumdemo {
	public enum Direction{NORTH,SOUTH,EAST,WEST};
	public static void main(String[] args) {
		Direction d1=Direction.NORTH;
		System.out.println(d1);
		Direction d2=Direction.NORTH;
		if(d1==d2)
		{
			System.out.println("equal");
		}
		System.out.println("------------------");
		if(d1.equals(d2))
		{
			System.out.println("equal");
		}
		
		for(Direction d:Direction.values()) 
		{
			System.out.println(d);
		}
		System.out.println("------------------");
		System.out.println(Direction.valueOf("NORTH"));
		System.out.println(Direction.SOUTH.ordinal());
	}

}
