package com.array;
 
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenInput {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum of even"+ SumEven.EvenSum(arr) );
		sc.close();
		
	}
		
	
	}


