package com.stringbufferbuilder;

public class StringBuilderBuffer {
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb2= new StringBuffer(4);
		System.out.println(sb2.capacity());
		
		sb2.append("java");//(currentcapacity*2)+2
		
		System.out.println(sb2+":"+sb2.capacity());
		System.out.println(sb2+" length:"+sb2.length());
		
		StringBuilder sb3=new StringBuilder();
		System.out.println(sb3.capacity());
		
		sb3=sb3.append("learn");
		System.out.println(sb3+":"+sb3.capacity());
		
		
	}

}
