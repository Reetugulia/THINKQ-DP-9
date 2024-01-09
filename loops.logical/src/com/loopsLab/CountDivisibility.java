package com.loopsLab;

public class CountDivisibility {
	public static int countdivisible()
	{
		int count=0;
		for(int i=1;i<=100;i++)
			
		{
			if(i%6==0) {
				count++;
				System.out.println(i);
				
			}
				
				
		}
		return count;
	}
	
	
	public static void main(String[] args) {
	
		//countdivisible();
		System.out.println("count"+countdivisible());
	}

}
