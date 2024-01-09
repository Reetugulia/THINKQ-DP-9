package com.loopsassignment;

public class AdditionQ21 {
	public static void temperature()
	{
		double tem=100;
		int hour=0;
		do
		{
			tem=tem-7;
			hour++;
		}while(tem>=60);
		System.out.println("hour:"+hour);
		
	}
	public static void main(String[] args) {
		
		temperature();		
	}

}
