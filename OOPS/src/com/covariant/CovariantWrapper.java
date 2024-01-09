package com.covariant;
class First
{
	Number value;
	
	Object displayValue() 
	{
		return value;
	}
/*	Number displayValue() 
	{
		return value;
	}*/
	
}
class Second extends First
{
	Integer myvalue;
	
/*	Number displayValue() 
	{
		myvalue=20;
		return value;
	}*/
	Integer displayValue() 
	{
		myvalue=20;
		return myvalue;
	}
	
}
class 	Third extends First
{
	Character ch;
	
	Character displayValue() 
	{
		ch='A';
		return ch;
	}
}
public class CovariantWrapper {
	public static void main(String[] args) {
		First f1=new First();
		f1.value=56;
		System.out.println(f1.displayValue());
		
		Second s=new Second();
		System.out.println(s.displayValue()+30);
		
		Third t1=new Third();
		System.out.println(t1.displayValue());
		
	}

}
