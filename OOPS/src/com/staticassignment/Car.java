package com.staticassignment;
 class carmodel{
	 static String model;
	 static int totalcarSold;
	 
	 carmodel()
	 {
		 model="verna";
		 totalcarSold=1000;
	 }
	 carmodel(String model,int totalcarSold)
	 {
		 this.model=model;
		 this.totalcarSold=totalcarSold;
	 }
	
 }
public class Car {
	
	public static void main(String[] args) {
		carmodel c1=new carmodel();
		System.out.println(carmodel.model);
		System.out.println(carmodel.totalcarSold);
		
		System.out.println("------------------------------------------------------------");
		
		carmodel c2=new carmodel("audi",2000);
		System.out.println(carmodel.model);
		System.out.println(carmodel.totalcarSold);
	
		
		
		
	}

}
