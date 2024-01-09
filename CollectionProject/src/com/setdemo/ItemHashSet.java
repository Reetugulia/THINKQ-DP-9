package com.setdemo;

import java.util.HashSet;

public class ItemHashSet {
	public static void main(String[] args) {
		HashSet<Item> hs=new HashSet<Item>();
		hs.add(new Item(1, "sugar", 30));
		hs.add(new Item(2, "salt", 20));
		hs.add(new Item(3,"milk",35));
		hs.add(new Item(2, "salt", 20));
		for(Item s:hs)
		{
			System.out.println(s);
		}
	}

}
