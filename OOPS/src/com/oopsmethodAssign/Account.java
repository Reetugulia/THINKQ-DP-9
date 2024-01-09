package com.oopsmethodAssign;

public class Account {
	public static void main(String[] args) {
		
	}

}

class Accountdetail{
	int acc_no;
	String name;
	float balance;
	
	public Accountdetail() {
		
	}

	void insert()
	{
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
	}
	void display() {
		
		System.out.println("Name:"+name+" "+"with account number:"+acc_no+" has balance:"+balance);
		
		
	}
	void deposit(float amount) {
		balance+=amount;
		System.out.println(name+" with account no:"+acc_no+" "+"has credited:"+amount);
		
	}
	void withdraw(float amount)
	{
		if(balance-amount>0)
		{
			System.out.println(name+" with account no:"+acc_no+" "+"has debited:"+amount);
		}
		else
			System.out.println("insufficient balance");
		
	}
	
	
	
	
}

