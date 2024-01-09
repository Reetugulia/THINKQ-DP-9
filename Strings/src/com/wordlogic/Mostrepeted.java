package com.wordlogic;

public class Mostrepeted {
	public static void mostrepeatwords(String s)
	{
		String s1[]=s.split("\\s");
		int count;
		String mword="";
		int maxlength=0;
		for(int i=0;i<s1.length;i++)
		{
			count=1;
			if(s1[i].equals("Visited"))
				continue;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					count++;
					s1[j]="Visited";
				}
			}
			if(count>maxlength)
			{
				maxlength=count;
				mword=s1[i];
			}
		}
		System.out.println("most repeated word:"+mword);
		
	}

	public static void main(String[] args) {
		String s= "jingle bell jingle bell jingle on the way";
		mostrepeatwords(s);
		
		
	}

}
	


