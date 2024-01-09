package com.arrayassignment1;

import java.util.Arrays;

public class Reverse3 {
	public static void reversenum(int ar[])
	{
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int ar[]= {3,6,2,9,7,8};
		System.out.println(Arrays.toString(ar));
		 reversenum(ar);
		 System.out.println(Arrays.toString(ar)); 
		
	}

}
