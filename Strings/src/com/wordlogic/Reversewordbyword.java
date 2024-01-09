package com.wordlogic;

public class Reversewordbyword {
	static void reverseByword(String s)
	{
		String ar[]=s.split("\\s");
		String reverse="";
		for(int i=0;i<ar.length;i++)
		{
			//stringword ar[i]
			for(int j=ar[i].length()-1;j>=0;j--)
			{
				reverse=reverse+ar[i].charAt(j);
			}
			reverse=reverse+" ";
			
		}
		System.out.println(reverse);
		
	}
	public static void main(String[] args) {
		String s="i love to learn java";
		reverseByword(s);
		
	}

}
