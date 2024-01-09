package com.queuedemo;

import java.util.ArrayDeque;

public class arraydequedemo {
	public static void main(String[] args) {
		ArrayDeque<Float> abc= new ArrayDeque<>();
		abc.add(12.3f);
		abc.add(98.5f);
		abc.add(76.4f);
		System.out.println(abc);
		//maintain insertion order
	//	abc.add(null); null not allowed
		abc.addFirst(13.9f);
		abc.offerFirst(17.5f);
		
		System.out.println(abc);
		System.out.println(abc.remove(13.9f));
		System.out.println(abc.pollLast());
		System.out.println(abc.peekFirst());
		
	}

}
