package com.constructorAssignment;

public class Account7 {
	private long accountNo;
	private String customerName;
	
	public Account7() {
		accountNo=111;
		customerName="reetu";
		System.out.println("I am default constructor");
	}
	
		public void setAccountNo(long accountNo)
	{
		this.accountNo=accountNo;
	}
	public long getAccountNo()
	{
		return accountNo;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public String GetCustomerName()
	{
		return customerName;
	}
	
	public static void main(String[] args) {
		 Account7 a1=new  Account7();
		 System.out.println("accont number :"+a1.accountNo+"  "+"customer name: "+a1.customerName);
		
	}
	

}
