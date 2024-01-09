package com.inheritenceassignment;

class Vehicle
{
	private int id;
	private int modelno;
	private double price;
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}


	Vehicle(int id, int modelno, double price) {
	super();	
	this.id = id;
	this.modelno = modelno;
	this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getModelno() {
		return modelno;
	}


	public void setModelno(int modelno) {
		this.modelno = modelno;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", modelno=" + modelno + ", price=" + price + "]";
	}
	
}
	
	class Car extends Vehicle 
	{
		private int noOfgears;
		private String brand;
		private String fueltype;
		public Car() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Car(int id, int modelno, double price) {
			super(id, modelno, price);
			// TODO Auto-generated constructor stub
		}
		public Car(int noOfgears, String brand, String fueltype) {
			super();
			this.noOfgears = noOfgears;
			this.brand = brand;
			this.fueltype = fueltype;
		}
		public int getNoOfgears() {
			return noOfgears;
		}
		public void setNoOfgears(int noOfgears) {
			this.noOfgears = noOfgears;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			brand = brand;
		}
		public String getFueltype() {
			return fueltype;
		}
		public void setFueltype(String fueltype) {
			this.fueltype = fueltype;
		}
		@Override
		public String toString() {
			return super.toString()+"Car [noOfgears=" + noOfgears + ", Brand=" + brand + ", fueltype=" + fueltype + "]";
		}
	}
		class Racingcar extends Car
		{
			private int mileage;
			private int speed;
			public Racingcar() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Racingcar(int id, int modelno, double price) {
				super(id, modelno, price);
				// TODO Auto-generated constructor stub
			}
			public Racingcar(int noOfgears, String brand, String fueltype) {
				super(noOfgears, brand, fueltype);
				// TODO Auto-generated constructor stub
			}
			public Racingcar(int mileage, int speed) {
				super();
				this.mileage = mileage;
				this.speed = speed;
			}
			public int getMileage() {
				return mileage;
			}
			public void setMileage(int mileage) {
				this.mileage = mileage;
			}
			public int getSpeed() {
				return speed;
			}
			public void setSpeed(int speed) {
				this.speed = speed;
			}
			@Override
			public String toString() {
				return super.toString()+"Racingcar [mileage=" + mileage + ", speed=" + speed + "]";
			}
			
			
		}
		



public class Multilevel2 {
	public static void main(String[] args) {
	Car c=new Car(1,2001,500000);
	
	c.setFueltype("petrol");
	c.setBrand("audi");
	System.out.println(c); 
	
	
	}

}
