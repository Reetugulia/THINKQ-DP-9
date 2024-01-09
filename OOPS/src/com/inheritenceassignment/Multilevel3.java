package com.inheritenceassignment;

class Wood {
	private String typewood;
	private int warrentywood;

	public Wood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wood(String typewood, int warrentywood) {
		super();
		this.typewood = typewood;
		this.warrentywood = warrentywood;
	}

	public String getTypewood() {
		return typewood;
	}

	public void setTypewood(String typewood) {
		this.typewood = typewood;
	}

	public int getWarrentywood() {
		return warrentywood;
	}

	public void setWarrentywood(int warrentywood) {
		this.warrentywood = warrentywood;
	}

	@Override
	public String toString() {
		return "Wood [typewood=" + typewood + ", warrentywood=" + warrentywood + "]";
	}

}

class Furniture extends Wood {
	private String furnituretype;

	public Furniture(String furnituretype) {
		super();
		this.furnituretype = furnituretype;
		
	}

	public Furniture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFurnituretype() {
		return furnituretype;
	}

	public void setFurnituretype(String furnituretype) {
		this.furnituretype = furnituretype;
	}

	@Override
	public String toString() {
		return super.toString() +"Furniture [furnituretype=" + furnituretype + "]";
	}
	

}
class Chair extends Furniture
{
	private int noOfchairs;
	private int totalcost;
	public Chair() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chair(int noOfchairs, int totalcost,String furnituretype) {
		super(furnituretype);
		this.noOfchairs = noOfchairs;
		this.totalcost = totalcost;
	}
	public int getNoOfchairs() {
		return noOfchairs;
	}
	public void setNoOfchairs(int noOfchairs) {
		this.noOfchairs = noOfchairs;
	}
	public int getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	@Override
	public String toString() {
		return "Chair [noOfchairs=" + noOfchairs + ", totalcost=" + totalcost + ", getNoOfchairs()=" + getNoOfchairs()
				+ ", getTotalcost()=" + getTotalcost() + ", getFurnituretype()=" + getFurnituretype() + ", toString()="
				+ super.toString() + ", getTypewood()=" + getTypewood() + ", getWarrentywood()=" + getWarrentywood()
				+ ", getClass()=" + getClass()  + "]";
	}
	}

public class Multilevel3 {
	public static void main(String[] args) {
		Chair c=new Chair(5,500,"oak");
		System.out.println(c);
	}

}
