package com.interfacedemo;
interface Bakery
{
	String bname="My bakery";//public ,final,static
	void bake();//abstract,public
}
class Cake implements Bakery
{

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("cakes:pineapple,chocolate");
	}
	
}
class Biscuit implements Bakery
{

@Override
public void bake() {
	// TODO Auto-generated method stub
	System.out.println("Biscuits:Almond,OATS");
  }	
   public void minorder()
   {
	   System.out.println("min order:250");
   }

}


public class InterfaceDemo1 {
	public static void main(String[] args) {
		System.out.println("bakery name:"+Bakery.bname);
		System.out.println("-----------------------------------------------------------");
	//	Cake c=new Cake();
	//	c.bake();
	//	Biscuit b=new Biscuit();
	//	b.bake();
	//	b.minorder();
		//dynamic dispatch
		Bakery b1;
		b1=new Cake();
		b1.bake();
		
		b1=new Biscuit();
		b1.bake();
		
	}

}