package com.array;


import java.util.Arrays;
import java.util.Scanner;

public class Arrayinputs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
		
	}

}
