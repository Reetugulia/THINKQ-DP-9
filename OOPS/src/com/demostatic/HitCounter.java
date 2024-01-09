package com.demostatic;

class counter{
	int data;
	static int count=0;
	
	{
		count++;//instance block
	}
	counter()
	{
		data=10;
	}
	counter(int data){
		this.data=data;
	}
	
}


public class HitCounter {
	public static void main(String[] args) {
		counter c1=new counter();
		System.out.println(counter.count);
		System.out.println("data:"+c1.data);
		
		counter c2=new counter(45);
		System.out.println(counter.count);
		System.out.println("data:"+c2.data);
	}

}
