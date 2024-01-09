package com.oopassignment;

public class HashCode {
	 private String name;
	 private int id;
	 
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
	 
	 public HashCode () 
	 {
		 
	 }
	 
	public static void main(String[] args) {
		HashCode h1=new HashCode();
		HashCode h2=new HashCode();
		
		System.out.println(h1);
		System.out.println(h2);
	}

}
