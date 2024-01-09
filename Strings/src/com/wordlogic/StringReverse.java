package com.wordlogic;

public class StringReverse {
	static void reverseString(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s);
		}
	}
	static void reversecomplete(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {
		String s="I love India";
		reversecomplete(s);
		
	}

}
