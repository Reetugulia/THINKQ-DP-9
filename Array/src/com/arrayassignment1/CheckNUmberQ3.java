package com.arrayassignment1;

public class CheckNUmberQ3 {
	public static boolean CheckNum(int ar[],int n,int m)
	{
		for(int i=0;i<ar.length;i++)
		{
			if((ar[i]==n)||(ar[i]==m))
				return true;
				
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {23,45,67,68,67,77,55};
		int arr2[]= {1,2,3,4};
		int n=65;
		int m=77;
		System.out.println(CheckNum(arr2,n,m)); 
		 
		
	

		
		
		
		
	}

}
