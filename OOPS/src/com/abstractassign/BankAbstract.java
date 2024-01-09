package com.abstractassign;
abstract class Bank
{
	Bank()
	{
		
	}
	abstract void getBalance();
}
class BankA extends Bank
{
	BankA()
	{
		
	}
	void getBalance() 
	{
		System.out.println("deposit 100 Rs");
	}
}
class BankB extends Bank
{
	BankB()
	{
		
	}
	void getBalance() 
	{
		System.out.println("deposit 150 Rs");
	}
}
class BankC extends Bank
{
	BankC()
	{
		
	}
	void getBalance() 
	{
		System.out.println("deposit 200 Rs");
	}
}

public class BankAbstract {
	public static void main(String[] args) {
		BankC c=new BankC();
		c.getBalance();
		BankB B=new BankB();
		B.getBalance();
		BankA A=new BankA();
		A.getBalance();
	}

}
