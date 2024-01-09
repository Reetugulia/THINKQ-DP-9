package com.innerdemo;
class Bank
{
	static String bankname="SBI";
	static String bankloc;
	static String IfSccode;
	int accountno;
	String aname;
	double balance;
	
	static
	{
		bankloc="Delhi";
	    IfSccode="AgH1234"	;	
	}
	Bank()
	{
		
	}
	public Bank(int accountno, String aname, double balance) {
		
		this.accountno = accountno;
		this.aname = aname;
		this.balance = balance;
	}
	void displayBankdetails()
	{
		System.out.println(bankname+" "+bankloc);
		System.out.println("IfSC Code:"+IfSccode);
	}
	
	class Locker
	{
		int lockid;
		String pass;
		static double rent=2000;
		
		Locker()
		{
			
		}

		public Locker(int lockid, String pass) {
			super();
			this.lockid = lockid;
			this.pass = pass;
		}
		void displayLockerdetails()
		{
			displayBankdetails();
			System.out.println("this locker belongs to:"+aname+"  with account no:"+accountno);
			System.out.println("locker id:"+lockid+" "+"locker rent:"+rent);
			
		}
		
		
	}
	
}
public class MemberInnerclass {
	public static void main(String[] args) {
		//Bank$Locker
		//firstway
		Bank cus1=new Bank(4568,"reetu",50000);
		cus1.displayBankdetails();
		System.out.println("------------------------------------------");
		
		Bank.Locker Locker1=cus1.new Locker(20,"df123");
		Locker1.displayLockerdetails();
		
		
		// 2nd way
/*		Bank.Locker locker2= new Bank( 3455,"reetu", 5000).new Locker(30, "Rani12");
		locker2.displayLockerDetails();*/
		
	}

}
