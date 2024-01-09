package com.customexception;
class Account{
	private String name;
	private double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}
	void deposit(double amount)
	{
		balance+=amount;
		System.out.println("amount deposit:"+amount);
		System.out.println("new balance:"+balance);
		
	}
	void withdraw(double amount) {
		try
		{
			if((this.balance-amount)<0)
				throw new InvsufficientbalanceException("Your balance is low :"+balance);
			balance-=amount;
			System.out.println("amount withdraw:"+amount);
			System.out.println("new balance:"+balance);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class Bank {
	public static void main(String[] args) {
		Account a=new Account("reetu",5000);
		a.deposit(2000);
		System.out.println(a);
		System.out.println("---------------------------------------");
		a.withdraw(1000);
		System.out.println(a);
		System.out.println("-------------------------------------------");
		a.withdraw(8000);
	}


}
