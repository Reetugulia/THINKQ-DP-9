package com.oopsmethodAssign;

public class StudentDisplay2 {
	private String name="reetu";
	private int id=1;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void displaydata()
	{
		name="sunil";
		id=2;
		getId();
		setId(3);
		
		System.out.println( "Student name:"+name+" "+"\nstudent id:"+id);
	}
	
	public void customData(int customId, String customName)
	{
		this.name=customName;
		this.id=customId;
	}
	public String toString()
	{
		return "{"+"custom name:"+name+" "+"custom id"+id+"}";
	}
	public static void main(String[] args) {
		//displaydata(); show error
		StudentDisplay2 a1=new StudentDisplay2();
		
		//a1.displaydata();
		System.out.println("///////////////////////////////////");
		
		a1.customData(4,"naveen");
		System.out.println(a1);
		
	}

}
