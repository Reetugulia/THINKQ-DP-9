package com.constructorAssignment;

public class Account4 {
	private long accountNo;
	private String customerName;
	
	public Account4() {
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
		 Account4 a1=new  Account4();
		 System.out.println("accont number :"+a1.accountNo+"  "+"customer name: "+a1.customerName);
		
	}
	

}
