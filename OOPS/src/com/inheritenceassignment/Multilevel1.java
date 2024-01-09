package com.inheritenceassignment;
class Company1
{
	final static String companyname="infosys";
	private int companybranches;
	public Company1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company1(int companybranch) {
		super();
		this.companybranches = companybranches;
	}
	public int getCompanybranches() {
		return companybranches;
	}
	public void setCompanybranches(int companybranches) {
		this.companybranches = companybranches;
	}
	@Override
	public String toString() {
		return "Company1 [companybranches=" + companybranches + "]";
	}
	
	}
class Department extends Company1
{
	protected int did;
	private String dname;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname,int companybranches) {
		super(companybranches);
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return super.toString()+"Department [did=" + did + ", dname=" + dname + "]";
	}
	
	
	
	}
class Employee extends Department
{
	private String ename;
	private int id;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String ename, int id ,int did, String dname,int companybranches) {
		super( did,dname,companybranches);
		this.ename = ename;
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [ename=" + ename + ", id=" + id + "]"+"department id"+did;
	}
	
	
	
	}
public class Multilevel1 {
	public static void main(String[] args) {
		Employee e=new Employee("reetu",1,101,"admin",5);
		System.out.println(e);
		e.setCompanybranches(6);
		System.out.println(e);
	}
	

}
