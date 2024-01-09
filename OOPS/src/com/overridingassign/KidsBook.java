package com.overridingassign;
class Kid
{ 
	private String name;
	private int id;
	public Kid() {
		
	}
	public Kid(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	void Readbook(String bookname)
	{
		System.out.println("read harry poatter");
	}
	void Readbook(int bookid,int bookprice)
	{
		System.out.println("book name:atomic habit");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Kid [name=" + name + ", id=" + id + "]";
	}
	
	}
class Bigkid extends Kid
{
	void Readbook(String bookname) {
		System.out.println("bigkid read book ");
	}
}
class KidsBook {
	public static void main(String[] args) {
		Kid b;
		b=new Bigkid();
		b.Readbook(1, 1000);
		System.out.println(b);
		System.out.println("---------------");
		b=new Kid("samu",1);
		b.Readbook("atomic habits");
		System.out.println(b);
		
	}
	}


