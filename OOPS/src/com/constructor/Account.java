package com.constructor;

public class Account {
	public static void main(String[] args) {
		AcntDetail a1=new AcntDetail(111,"reetu",500000);
		AcntDetail a2=new AcntDetail(112,"sunil",600000);
		
		System.out.println(a1);
		System.out.println("///////////////////////////////////////////////////");
		
		System.out.println(a2);
        System.out.println("------------------------------------");
		
		a1.withdraw(6000);
		a2.withdraw(3000);
		
		System.out.println("------------------------------------");
		
		a1.deposit(2000);
		
		
		
	}
	

}
class AcntDetail
{
	private int actno;
	private String actholder;
	private double actbalance;
	

   public AcntDetail() {
	   
   }
   
   public AcntDetail(int actno, String actholder,double actbalance)
   {
	   this.actno=actno;
	   this.actholder=actholder;
	   this.actbalance=actbalance;	   
   }
   public void setActno(int actno)
   {
	   this.actno=actno;
   }
   public int getActno()
   {
	   return actno;
   }
   
   public void setActholder(String actholder)
   {
	   this.actholder=actholder;
   }
   public String getActholder()
   {
	  return actholder;
   }
   
   public void setActbalance(double actbalance)
   {
	   this.actbalance=actbalance;
   }
   
   public double getActbalance()
   {
	   return actbalance;   
   }
   void deposit(double amount)
   {
	   this.actbalance+=amount;
	   System.out.println("Account no:"+actno+"  has been credited to :"+amount);
    	System.out.println("Account no:"+actno+"  Balance :"+actbalance);
   }
   void withdraw(double amount)
   {
	  if(actbalance-amount>0) 
	  {
		  actbalance-=amount;
		  System.out.println("Account no:"+actno+"  has been debited :"+amount);
	  }
	  else
		  System.out.println("Account no "+actno+" "+"has insufficient balance");
   }
   
   public String toString()
   {
	   return "{"+"Account number"+actno+" "+"Name"+" "+ actholder+" "+"account balance"+actbalance; 
   }
  
   
}   


