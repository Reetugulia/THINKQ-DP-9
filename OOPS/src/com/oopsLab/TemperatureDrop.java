package com.oopsLab;

public class TemperatureDrop {
	
	public static int temp()
	{   int hours=0;
		double tem=100;
		do
		{
			tem=tem-7;
			hours++;
		}while(tem>=60);
		return hours;
			
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("hours:"+temp());
	}

}
