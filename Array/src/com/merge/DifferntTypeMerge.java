package com.merge;

import java.util.Arrays;

public class DifferntTypeMerge {
	public static int[] CompleteMerge(int ar1[],int ar2[]) 
	{
		int mer[]=new int[ar1.length+ar2.length];
		int index=0;
		for(int i=0;i<ar1.length;i++)
		{
			mer[index++]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++)
		{
			mer[index++]=ar2[i];
		}
		return mer;
		
	}
	public static int[] AlternateMerge(int a1[],int a2[])
	{
		int mer[]=new int[a1.length+a2.length];
		int maxlen=Math.max(a1.length, a2.length);
		int index=0;
		for(int i=0;i<maxlen;i++)
		{
			if(i<a1.length)
			{
				mer[index++]=a1[i];
			}
			if(i<a2.length)
			{
				mer[index++]=a2[i];
			}
		}
		return mer;
		
	}
	public static int[] AlternateMergeSkip(int a1[],int a2[])
	{
		int mer[]=new int[a1.length+a2.length];
		int maxlen=Math.max(a1.length, a2.length);
		int index=0;
		int i=0;
		while(index<maxlen)
		{
	
			if(i<a1.length)
			{
				mer[index++]=a1[i];
				i++;
			}
			if(i<a2.length)
			{
				mer[index++]=a2[i];
				i++;
			}
	
		}
		return mer;
	}
	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5,6};
		int ar2[]= {11,12,13,14};
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		System.out.println("Complete:");
		System.out.println(Arrays.toString( CompleteMerge( ar1,ar2) ));
		System.out.println("Alternate Merge:");
		System.out.println(Arrays.toString( AlternateMerge( ar1,ar2) ));
		System.out.println("alternate Skip:");
		
		System.out.println(Arrays.toString( AlternateMergeSkip(ar1,ar2) ));
		

		
		
	}

}
