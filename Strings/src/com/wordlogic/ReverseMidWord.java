package com.wordlogic;

public class ReverseMidWord {
	public static void reverseMidwords(String s)
	{
		String rev="";
		
		String ar[]=s.split("\\s");
		rev=rev+ar[0]+" ";
		for(int i=1;i<ar.length-1;i++)
		{
			
			for(int j=ar[i].length()-1;j>=0;j--)
			{
				
				rev=rev+ar[i].charAt(j);
			
			}
			rev=rev+" ";
		
		}

		rev= rev+ ar[ar.length-1];
		
		System.out.println(rev);
		
	}
	public static void main(String[] args) {
		String s="I love to learn java";
		reverseMidwords(s);
	}

}
