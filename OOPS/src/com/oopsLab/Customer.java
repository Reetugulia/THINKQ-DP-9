package com.oopsLab;

public class Customer {
	private  int customid;
	private  String customname;
	private  String   customemail;
	private  int  customcontact;
	private  String  custompass;
	
	Customer(int customid,String customname,String   customemail,int  customcontact, String  custompass){
		this.customid=customid;
		this.customname=customname;
		this.customemail=customemail;
		this.customcontact=customcontact;
		this.custompass=custompass;
	}
	public Customer()
	{
		
	}
	

	
	public void setCustomid(int customid) 
	{
		this.customid=customid;
	}
	public int getCustomid()
	{
		return customid;
	}
	public void setCustomname(String customname)
	{
		this.customname=customname;
	}
	public String getCustomname()
	{
		return customname;
	}
	public void setCustomemail(String customemail)
	{
		this.customemail=customemail;
	}
	public String getCustomemail()
	{
		return customemail;
	}
	public void setCustomcontact(int customcontact) 
	{
		this.customcontact=customcontact;
	}
	public int getCustomcontact()
	{
		return customcontact;
	}
	public void setCustompass(String customemail)
	{
		this.custompass=custompass;
	}
	public String getCustompass()
	{
		return custompass;
	}
	public String toString()
	{
		return "{"+"customer name:"+customname+" Customer id:"+customid+" Customer contact:"+customcontact+" Coustomer email:"+customemail+"}";
	}
	

}
