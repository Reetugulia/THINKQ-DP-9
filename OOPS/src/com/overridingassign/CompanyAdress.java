package com.overridingassign;
class Company
{
	String Companyname;
	int companypin;
	public Company() {
	
	}
	void address() 
	{
		System.out.println("company");
	}
	@Override
	public String toString() {
		return "Companyname=" + Companyname + ", companypin=" + companypin + "]";
	}
	}
class ebay extends Company
{
	String ebaylocation;
	int ebaypin;
	
	ebay()
	{
		
	}
	public ebay(String ebaylocation, int ebaypin) {
		super();
		this.ebaylocation = ebaylocation;
		this.ebaypin = ebaypin;
	}
	public  void address() {
		System.out.println("ebay");
	}
	@Override
	public String toString() {
		return super.toString()+"ebaylocation=" + ebaylocation + ", ebaypin=" + ebaypin + "]";
	}
}
public class CompanyAdress {
	public static void main(String[] args) {
		Company c;
		c=new Company();
		c.address();
		System.out.println("----------------------------------------------------------------");
		c=new ebay();
		c.address();
	}

}
