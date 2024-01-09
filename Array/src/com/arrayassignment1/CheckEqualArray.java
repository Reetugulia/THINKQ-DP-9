package com.arrayassignment1;

import java.util.Arrays;

public class CheckEqualArray {
	public static int[] shorting(int ar[])
	{
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	
     public static boolean checkarray(int ar1[],int ar2[])
	{
    	 
    	 if (ar1.length!=ar2.length)
    	 {
    		 return false;
    	 } 
    	 else
    		 if(shorting(ar1)==shorting(ar2))
    		 {
    			
    		 } 
    	 return true; 
    	 
	}
	
	public static void main(String[] args) {
		int ar1[]= {12, 22, 32, 42, 52, 62};
		int ar2[]= {52, 22, 62, 12, 42, 22};
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		//shorting(ar2);
	//	System.out.println(Arrays.toString(ar2));
		System.out.println(checkarray(ar1,ar2));
	

}
}