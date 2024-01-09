package com.inheritenceassignment;

public class Laptop {
	private int noOfUSBPort;
	private int processorSpeed ;
	
	Laptop()
	{
		
	}
	public Laptop(int noOfUSBPort, int processorSpeed) {
		super();
		this.noOfUSBPort = noOfUSBPort;
		this.processorSpeed = processorSpeed;
	}

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	
	
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.setNoOfUSBPort(3);
		l1.setProcessorSpeed(300);
		System.out.println("setNoOfUSBPort:"+l1.getNoOfUSBPort()+" "+"processorSpeed:"+l1.getProcessorSpeed());
		
	}
	

}
