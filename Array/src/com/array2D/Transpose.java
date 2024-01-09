package com.array2D;

public class Transpose {
	static int [][] transposematrix(int a[][])
	{
		int colms=a.length;//rows of ar
		int rows=a[0].length;//colms of ar
		int transp[][]=new int[rows][colms];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colms;i++) 
			{
				transp[i][j]=a[j][i]	;		}
		}
		return transp;
	}
	static void display(int a[][])
	{
		for (int i=0;i<a.length;i++)
		{
			for(int j:a[i])
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		int ar[][]= {{1,2,3},{3,4,5}};
		display(ar);
		int trm[][]= transposematrix(ar);
		display(trm);
	}

}
