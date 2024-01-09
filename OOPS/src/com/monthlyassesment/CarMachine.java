package com.monthlyassesment;
class Engine
{
	   private String enginetype;
	    private int price;
		public Engine() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Engine(String enginetype, int price) {
			super();
			this.enginetype = enginetype;
			this.price = price;
		}
		public String getEnginetype() {
			return enginetype;
		}
		public void setEnginetype(String enginetype) {
			this.enginetype = enginetype;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "enginetype=" + enginetype + ", price=" + price + "]";
		}
}
class Machine
{
	private String Machinetype;
	Engine engine;
	public Machine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Machine(String machinetype, Engine engine) {
		super();
		Machinetype = machinetype;
		this.engine = engine;
	}
	public String getMachinetype() {
		return Machinetype;
	}
	public void setMachinetype(String machinetype) {
		Machinetype = machinetype;
	}
	@Override
	public String toString() {
		return "[Machinetype=" + Machinetype + ", engine=" + engine + "]";
	}
	
	
}
class Car
{
	private int modelno;
	Machine machine;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int modelno, Machine machine) {
		super();
		this.modelno = modelno;
		this.machine = machine;
	}
	
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	@Override
	public String toString() {
		return "Car [modelno=" + modelno + ", machine=" + machine + "]";
	}
	
}
public class CarMachine {
	public static void main(String[] args) {
		Engine e=new Engine("diesel",50000);
		Machine m=new Machine("automatic",e);
		Car c=new Car(2020,m);
		System.out.println(c);
		
		System.out.println("-------------------------------------------");
		Engine e1=new Engine();
		e.setEnginetype("petrol");
		e.setPrice(60000);
		Machine m1=new Machine();
		m.setMachinetype("manual");
		Car c1=new Car(2020,m);
		c1.setModelno(2023);
		System.out.println(c1);
		
		
		
		
	}
 
  
    
    
}
