package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Conversion {
	public static void main(String[] args) {
	//convert array to arraylist
		String []colors= {"blue","red","pink"};
		System.out.println(Arrays.toString(colors));
		
		//ist way
		List<String> l1=Arrays.asList(colors);
		System.out.println(l1);
		System.out.println("-------------------------");
		//2nd way
		ArrayList<String>a1=new ArrayList<>(Arrays.asList(colors));
		System.out.println(a1);
		System.out.println("---------------------------");
		//3rd way
		ArrayList<String> a2=new ArrayList<>();
		Collections.addAll(a2, colors);
		System.out.println(a2);
		
		///array list to array
		//1st way
		Object[]col=a1.toArray();
		System.out.println(Arrays.toString(col));
		for(int i=0;i<col.length;i++)
		{
			col[i]=((String) col[i]).concat("colour");
		}
		System.out.println(Arrays.toString(col));
		//2nd way
		String col2[]=new String[a1.size()];
		
		System.out.println(Arrays.toString(col2));
		for(int i=0;i<col2.length;i++)
		{
			col2[i]=(col2[i]).concat("colour");
		}
		System.out.println(Arrays.toString(col2));
		
	}

}
