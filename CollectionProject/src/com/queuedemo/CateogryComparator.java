package com.queuedemo;

import java.util.Comparator;

public class CateogryComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if(c1.getCategory()==c2.getCategory())
			return(c1.getId()-c2.getId());
		else
			return(c1.getCategory()-c2.getCategory());
	}

}
