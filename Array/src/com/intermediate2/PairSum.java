package com.intermediate2;

import java.util.Arrays;

public class PairSum {
	public static void SumPairs(int ar[],int s)
	{
		for(int i=0;i<ar.length;i++)
		{
		  if(ar[i]>s)
			  continue;
		  for(int j=i+1;j<ar.length;j++) 
		  {
			  if(ar[i]+ar[j]==s)
				  System.out.println("{"+ar[i]+","+ar[j]+"}");
		  }
			  
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,5,8,9};
		System.out.println(Arrays.toString(ar));
		int s=8;
		System.out.println("pairs");
		SumPairs(ar,s);
		
		
	}
	

}
