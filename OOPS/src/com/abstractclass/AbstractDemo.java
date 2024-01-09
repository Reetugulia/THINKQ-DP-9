package com.abstractclass;
abstract class Bike
{
	private int id;
	private String name;
	private int cost;
	
	static String brandname;
	static int discount;
	
	static
	{
		brandname="Honda";
	}
	Bike()
	{
		
	}

	public Bike(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public static int getDiscount() {
		return discount;
	}
	public static void setDiscount(int discount) {
		Bike.discount = discount;
	}
	abstract void description();
	final void display() 
	{
		System.out.println("brand name:"+brandname);
		System.out.println("discount on all bikes:"+discount+"%");
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("id:"+id);
		System.out.println("Model:"+name);
		System.out.println("Cost:"+cost);
		System.out.println("discounted cost:"+(cost-((discount/100)*cost)));
	}
}
 class Sportsbike extends Bike
{
	private int noofgears;
	
	private int maxspeed;


	public Sportsbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sportsbike(int id, String name, int cost, int noofgears,  int maxspeed) {
		super(id, name,cost);
		this.noofgears = noofgears;
		
		this.maxspeed = maxspeed;
	}

	public int getNoofgears() {
		return noofgears;
	}

	public void setNoofgears(int noofgears) {
		this.noofgears = noofgears;
	}


	public int getSpeed() {
		return maxspeed;
	}

	public void setSpeed(int speed) {
		this.maxspeed = maxspeed;
	}
	void description() 
	{
		System.out.println("This is a sports bike");
		System.out.println("no of gears:"+noofgears);
		System.out.println("maximum speed:"+maxspeed);
	}
		
	
}
class Basicbike extends Bike
{
	private float avg;
	
	public Basicbike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Basicbike(int id, String name, int cost, float avg) {
		super(id, name, cost);
		this.avg = avg;
	}



@Override
	void description()
	{
		System.out.println("This is normal bike");
		System.out.println("No of gears:"+4);
		System.out.println("Average is:"+avg);
	}
}


public class AbstractDemo
{
	public static void main(String[] args) {
		Sportsbike s=new Sportsbike(101,"CVR",78000,6,250);
		s.display();
		s.description();
		System.out.println("-------------------------------------------------------------");
		Basicbike b=new Basicbike(102,"pulser",60000,200f);
		b.display();
		b.description();
	}
	}


