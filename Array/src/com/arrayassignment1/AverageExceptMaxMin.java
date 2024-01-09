package com.arrayassignment1;

import java.util.Arrays;

public class AverageExceptMaxMin {
	 public static int maxnum(int ar[])
	 {
		 int max=ar[0];
		 for(int i=0;i<ar.length;i++) 
		 {
			 if(max<ar[i])
			 {
				 max=ar[i];
			 }
		 }
		 return max;
	 }
	 public static int minnum(int ar[])
	 {
		 int min=ar[0];
		 for(int i=0;i<ar.length;i++) 
		 {
			 if(min>ar[i])
			 {
				 min=ar[i];
			 }
		 }
		 return min;
	 }
	 public static double average(int ar[])
	 { 
		 double avg=0;
		 int minnumber=minnum(ar);
		 int maxnumber= maxnum(ar);
		 int sum=0;
		 for(int i=0;i<ar.length;i++)
		 {
			 sum+=ar[i];
			 avg=(sum-(maxnumber+minnumber))/((ar.length)-2);
			
		 }
		 return avg;
		 	 
	 }
	 
	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(ar));
		 average(ar);
		 System.out.println("average"+average(ar));
		
	}

}
