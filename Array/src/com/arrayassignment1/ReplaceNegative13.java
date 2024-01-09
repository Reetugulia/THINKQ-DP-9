package com.arrayassignment1;
/* WAP to replace all negative value with its immediate left elements square. Means 
arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. */
public class ReplaceNegative13 {
	public static void ConvertNEgativeSquare(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0&&i!=0)
			{
				ar[i]=ar[i-1]*ar[i-1];
			}
		}
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {-12, 3, -19, 29, 5, -61, 44, 7, -9};
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("after converting negative value with square:");
		ConvertNEgativeSquare(arr);
		
		
	}

}
