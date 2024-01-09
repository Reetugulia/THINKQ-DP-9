package com.testpractice;

public class Palindrome {
	public static void checkpalindrome(int num)
	{
		int original=num;
		int revn=0;
		do
		{
			int rem=num%10;
			revn=revn*10+rem;
			num/=10;
		}while(num!=0);
		if(revn==original)
			System.out.println(original+"palin");
		else
			System.out.println(original+"not");
	}
	public static void main(String[] args) {
		int n=121;
		checkpalindrome(n);
		
	}

}
