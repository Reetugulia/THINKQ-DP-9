package com.abstractassign;
abstract class Abs1
{
	abstract void doab1();

	
}
abstract class Abs2
{
	abstract void doab2();
}
class Temperature extends Abs1
{
	void doab1() 
	{
		System.out.println("abstract method 1");
	}
}
class Temperature2 extends Abs2
{
     void doab2()
	{
		System.out.println("abstract method 2");
	}
}

public class AbsractOb {
	public static void main(String[] args) {
		Temperature2 t2=new Temperature2();
		t2.doab2();
		System.out.println("-------------------------------------------------------------");
		Temperature t1=new Temperature();
		t1.doab1();
		
	}

}
