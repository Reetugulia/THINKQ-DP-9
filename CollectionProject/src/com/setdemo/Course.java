package com.setdemo;

import java.util.Objects;

public class Course {
	private int id;
	private String name;
	private double fees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fees, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees) && id == other.id
				&& Objects.equals(name, other.name);
	}
	

}
