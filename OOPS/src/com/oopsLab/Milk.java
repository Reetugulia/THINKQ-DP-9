package com.oopsLab;

public class Milk {
	public static void milkprice() 
	{
		float price=47;
		for(int w=1;w<=4;w++) 
		{
			for (int day=1;day<=7;day++)
			{
				price=day+price;
				price++;
				if(day==7)
					System.out.println("price:"+price);
			}
			
		}
	
	}
	public static void main(String[] args) {
		
		milkprice() ;
	}

}
