package com.linkedlistdemo;

import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList<String> com=new LinkedList<>();
	//	System.out.println(com.getFirst()); throws no such element error
		System.out.println(com.peekLast());//null
	//	System.out.println(com.remove()); exception
		System.out.println(com.pollLast());
		com.add("HCL");
		com.add("Infosys");
		com.add("accenture");
		com.add(null);
		com.add("Dell");
		
		System.out.println(com);
		System.out.println();
		//add first
		com.addFirst("capgamini");
		com.offerFirst("HCL");//void
		System.out.println(com);
		//add middle
		com.add(1, "amazon");
		//last addd
		com.addLast(null);
		
	}

}
