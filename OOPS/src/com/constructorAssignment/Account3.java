package com.constructorAssignment;

public class Account3 {
	private long accountNo;
	private String customerName;
	
	public Account3() {
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
		 Account3 a1=new  Account3();
		 System.out.println("accont number :"+a1.accountNo+"  "+"customer name: "+a1.customerName);
		 System.out.println("----------------------------------------------------------------------");
		 Account3 a2=new  Account3();
		 System.out.println(a2);
		
	}
	

}
