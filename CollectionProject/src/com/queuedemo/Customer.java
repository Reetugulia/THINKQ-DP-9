package com.queuedemo;

public class Customer {
	private int id;
	private int category;//1.business  2.economy  3.general
	private String name;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, int category, String name) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tickets Booking [id=" + id + ", category=" + category + ", name=" + name + "]";
	}
	

}
