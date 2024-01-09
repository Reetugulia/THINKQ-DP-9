package com.arraylist;

import java.util.ArrayList;


public class SortArraylist {
	public static void sortlist(ArrayList<Integer> List)
	{
		for(int i=0;i<List.size();i++) {
			for(int j=i+1;j<List.size();j++)
			{
				if(List.get(i)>List.get(j))
				{
					int temp=List.get(i);
					List.set(i, j);
					List.set(j, temp);
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(76);
		a1.add(45);
		a1.add(88);
		a1.add(98);
		a1.add(45);
		System.out.println("old array:"+a1);
		sortlist(a1);
		System.out.println("new array:"+a1);
		
		
		
	}

}
