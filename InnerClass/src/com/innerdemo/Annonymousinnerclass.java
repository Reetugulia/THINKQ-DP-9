package com.innerdemo;
interface Doable
{
	public void doit();
} 
class Car
{
	public void drive() 
	{
		System.out.println("i am driving a car");
	}
}
abstract class cake
{
	abstract void doBaking();
}
public class Annonymousinnerclass {
	public static void main(String[] args) {
		//using interface
		Doable d1=new Doable(){
			public void doit() {
				System.out.println("i am attending class");
			}
		};
		d1.doit();
		
		Car c1=new Car() {
			public void drive() {
				System.out.println("i am driving an audi");
			}
		};
		c1.drive();
		
		cake ck= new cake() {
			
			void doBaking() {
				System.out.println("i am baking chocolate cake");
			}
		};
		ck.doBaking();
		
	}

}
