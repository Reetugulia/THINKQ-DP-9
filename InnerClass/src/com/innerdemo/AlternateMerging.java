package com.innerdemo;

import java.util.Arrays;

public class AlternateMerging {
	public static int[] mergearray(int a1[],int a2[]) 
	{
		int len=a1.length+a2.length;
		int maxlen=Math.max(a1.length, a2.length);
		int mer[]=new int[len];
		int index=0;
		
			for(int i=0;i<len;i++)
			{
			
				if(i<maxlen)
				{
					mer[index++]=a1[i];
				}
				if(i<maxlen)
				{
					mer[index++]=a2[i];
				}
			}
			return mer;
			
	}
	
	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {6,7,8,9,10};
//		System.out.println(Arrays.toString(a1));
//		System.out.println(Arrays.toString(a2));
		
		System.out.println(Arrays.toString(mergearray(a1,a2)));
	
		
		 
		
	}

}
