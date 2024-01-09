package com.logicalloops;

public class CountDigit {
	public static int countD(int num){
		int count=0;
		
		do
		{
			count++;
			 num/=10;
			
			
		}while(num!=0);
		return count;
		
	}
	
	
	public static void main(String[] args) {
		int n=765;
		System.out.println("count"+countD(n));
	
		
	}

}
