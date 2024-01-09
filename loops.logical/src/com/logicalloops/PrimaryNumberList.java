package com.logicalloops;



public class PrimaryNumberList {
	public static boolean primenumber(int num)
	{
		if((num==0)||(num==1))
			return false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("prime number from range 1 to 50");
		for(int i=1;i<=50;i++)
		{
		if(primenumber(i))
			System.out.println(i);
		
		}
	}

}
