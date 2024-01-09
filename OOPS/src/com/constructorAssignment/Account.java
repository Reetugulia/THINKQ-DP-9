package com.constructorAssignment;

public class Account {
	private long accountNo;
	private String customerName;
	
	
	
	
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
		 Account a1=new  Account();
		 System.out.println("accont number :"+a1.accountNo+"  "+"customer name: "+a1.customerName);
		
	}
	

}
