package com.intermediate2;

public class ShiftingEvenOdd {
	public static void evenShifting(int ar[]) 
	{
		int len=ar.length;
		for(int i=0;i<len/2;i++)
		{
			for (int j=i+1;j<len/2;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
				
		}
		for(int i=len/2;i<len;i++)
		{
			for (int j=i+1;j<len;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
				
		}
	}
	
	
	
	public static void main(String[] args) {
		int ar[]= {1,5,4,2,7,3,6};
		evenShifting(ar);
		
	}

}
