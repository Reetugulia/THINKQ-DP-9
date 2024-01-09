package com.pojo;

public class Movie {
	private int mid;
	private String name;
	private double price;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int mid, String name, double price) {
		super();
		this.mid = mid;
		this.name = name;
		this.price = price;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", name=" + name + ", price=" + price + "]";
	}
	

}
