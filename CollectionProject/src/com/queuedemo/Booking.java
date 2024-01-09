package com.queuedemo;

import java.util.PriorityQueue;

public class Booking {
	public static void main(String[] args) {
		PriorityQueue<Customer> indigo=new PriorityQueue<>(new CateogryComparator());
		indigo.add(new Customer(101,1,"reetu"));
		indigo.add(new Customer(105,2,"pooja"));
		indigo.add(new Customer(104,1,"pranay"));
		indigo.add(new Customer(102,2,"arpita"));
		indigo.add(new Customer(103,3,"prachi"));
		indigo.add(new Customer(106,3,"pranali"));
		for(Customer c:indigo)
		{
			System.out.println(c);
		}
	}

}
