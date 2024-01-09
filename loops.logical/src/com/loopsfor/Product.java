package com.loopsfor;

public class Product {
	public static long producteven() {
		long prdt=1;
		for(int i=1;i<=20;i++)
		{
			if (i%2==0)
				prdt=prdt*i;
		}
		return prdt;
	}
	public static void main(String[] args) {
		System.out.println("product is:"+producteven());
		
	}

}
