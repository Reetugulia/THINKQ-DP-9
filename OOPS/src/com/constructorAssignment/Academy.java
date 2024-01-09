package com.constructorAssignment;

public class Academy {
	private int acd_id;
	private String acdname;
	
	
	public void setAcd_id(int acd_id)
	{
		this.acd_id=acd_id;
	}
	public int getAcd_id() {
		return acd_id;
	}
	public void setAcdname(String acdname)
	{
		this.acdname=acdname;
	}
	public String getAcdname() {
		return acdname;
	}

	
	public static void main(String[] args) {
		Academy e1=new Academy();
		e1.setAcd_id(1);
		e1.setAcdname("think quotient");
		
		
		System.out.println("academy name:"+e1.getAcdname()+" "+"academy id:"+e1.getAcd_id());
	}
	

}
