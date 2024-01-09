package com.containment;

public class Department {
	private String dpname;
	private int dpid;
	
	Department()
	{
		
	}
	Department(String dpname,int dpid)
	{
		this.dpid=dpid;
		this.dpname=dpname;
	}
	public void setDpname(String dpname)
	{
		this.dpname=dpname;
	}
	public String getDpname()
	{
		return dpname;
	}
	public void setDpid(int dpid)
	{
		this.dpid=dpid;
	}
	public int getDpid()
	{
		return dpid;
	}
	public String toString()
	{
		return "{"+"department name:"+dpname+" "+"department is:"+dpid+"}";
	}
	
	
	

}
