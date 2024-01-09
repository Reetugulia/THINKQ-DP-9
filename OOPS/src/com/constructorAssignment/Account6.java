package com.constructorAssignment;

public class Account6 {
	private long accountNo;
	private String customerName;
	
	/*public Account6() {
		accountNo=111;
		customerName="reetu";*/
		
	
	 Account6(long accountNo,String customerName){
		 System.out.println("I am a perimetrised constructor");
		 this.accountNo=accountNo;
		 this.customerName=customerName;
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
	public String toString() {
		return "{"+"customer name:"+customerName+" "+"account number:"+accountNo+"}";
	}
	
	public static void main(String[] args) {
		
		 Account6 a3=new  Account6(123,"sunil");
		 System.out.println(a3);
		// a3.Account6();	
		// Account6 a4=new Account6();
		 
		
	}
	

}
