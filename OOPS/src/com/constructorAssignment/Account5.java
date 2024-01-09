package com.constructorAssignment;

public class Account5 {
	private long accountNo;
	private String customerName;
	
	public Account5() {
		accountNo=111;
		customerName="reetu";
		System.out.println("I am default constructor");
	}
	 Account5(long accountNo,String customerName){
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
		 Account5 a1=new  Account5();
		 System.out.println("accont number :"+a1.accountNo+"  "+"customer name: "+a1.customerName);
		 System.out.println("----------------------------------------------------------------------");
		 Account5 a2=new  Account5();
		 System.out.println(a2);
		System.out.println("-------------------------------------------------------------------------");
		
		 Account5 a3=new  Account5(123,"sunil");
		 System.out.println(a3);
		
	}
	

}
