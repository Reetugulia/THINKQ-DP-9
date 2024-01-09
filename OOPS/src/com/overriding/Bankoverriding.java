package com.overriding;
class Account{
	private int aactno;
	private String name;
	protected double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int aactno, String name, double balance) {
		super();
		this.aactno = aactno;
		this.name = name;
		this.balance = balance;
	}
	public int getAactno() {
		return aactno;
	}
	public void setAactno(int aactno) {
		this.aactno = aactno;
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
		return "Account [aactno=" + aactno + ", name=" + name + ", balance=" + balance + "]";
	}
	 void deposit(float amount) 
	{
		balance+=amount;
		System.out.println("account no:"+aactno);
		System.out.println("amount credited by :"+amount);
		System.out.println("new balance:"+balance);
	}
	void withdraw(float amount)
	{
		balance-=amount;
		if((balance-amount)>0)
			System.out.println("new balance:"+balance);
		else
			System.out.println("insufficient amount");
	}
	
	
}
class SavingAccount extends Account
{ 
	private String panNo;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int aactno, String name, double balance) {
		super(aactno, name, balance);
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String panNo) {
		super();
		this.panNo = panNo;
	}

	public SavingAccount(int aactno, String name, double balance, String panNo) {
		super(aactno, name, balance);
		this.panNo = panNo;
	}

	public String getPanno() {
		return panNo;
	}

	public void setPanNo(String panno) {
		this.panNo = panNo;
	}
	void deposit(float amount) 
	{
		if(((balance+amount)>50000)&&(panNo==null))
			System.out.println("provide yr pan no");
		else
			super.deposit(amount);





	}

	@Override
	public String toString() {
		return "SavingAccount [panno=" + panNo + ", getAactno()=" + getAactno() + ", getName()=" + getName()
				+ ", getBalance()=" + getBalance() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	
	}
public class Bankoverriding {
	public static void main(String[] args) {
		Account a1= new Account(1234,"Arpita", 1000);
		a1.deposit(2000);
		
		System.out.println("------------------------------");
		
		a1.withdraw(3500);
		
		a1.deposit(56000);
		
		System.out.println("======================================");
		
		SavingAccount s1= new SavingAccount(1011, "Pranay", 20000);
		s1.deposit(20000);
		s1.deposit(20000);
		s1.setPanNo("A906GH45");
		s1.deposit(20000);
	}

}
