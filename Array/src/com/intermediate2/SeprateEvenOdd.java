package com.intermediate2;

public class SeprateEvenOdd {
	
	public static void SeprateEven(int ar[])
	{
		int i;
		int j;
		int temp;
		int len=ar.length;
		for( i=0;i<len;i++)
		{
			if(ar[i]!=0)
				continue;
			else
				for(j=len-1;j>=0&&i<j;j++)
				{
					if(ar[j]!=0)
					{
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
						break;
					}
				}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,6,4,8,76,9,5};
		SeprateEven(arr);
		
		
		
	}

}
