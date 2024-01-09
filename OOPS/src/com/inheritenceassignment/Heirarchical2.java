package com.inheritenceassignment;
class Uviversity
{
	protected String uname;
	private int Noofclogs;
	public Uviversity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Uviversity(String uname) {
		super();
		this.uname = uname;
	}
	public Uviversity(String uname, int noofclogs) {
		super();
		this.uname = uname;
		Noofclogs = noofclogs;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getNoofclogs() {
		return Noofclogs;
	}
	public void setNoofclogs(int noofclogs) {
		Noofclogs = noofclogs;
	}
	@Override
	public String toString() {
		return "Uviversity [uname=" + uname + ", Noofclogs=" + Noofclogs + "]";
	}
	
	}
class Hinduclog extends Uviversity
{
	private String colgname;
	private int noofstudents;
	public Hinduclog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hinduclog(String uname, String colgname, int noofstudents) {
		super(uname);
		this.colgname = colgname;
		this.noofstudents = noofstudents;
	}
	public String getColgname() {
		return colgname;
	}
	public void setColgname(String colgname) {
		this.colgname = colgname;
	}
	public int getNoofstudents() {
		return noofstudents;
	}
	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}
	@Override
	public String toString() {
		return super.toString()+"["+"colgname=" + colgname + "+ noofstudents=" + noofstudents + "]"+"university name:"+uname;
	}

}
class college2 extends Uviversity
{
	private String colgname;
	private int noofstudents;
	public college2 () {
		super();
		// TODO Auto-generated constructor stub
	}
	public college2(String uname, String colgname, int noofstudents) {
		super(uname);
		this.colgname = colgname;
		this.noofstudents = noofstudents;
	}
	public String getColgname() {
		return colgname;
	}
	public void setColgname(String colgname) {
		this.colgname = colgname;
	}
	public int getNoofstudents() {
		return noofstudents;
	}
	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}
	@Override
	public String toString() {
		return super.toString()+"["+"colgname=" + colgname + "+ noofstudents=" + noofstudents + "]"+"university name:"+uname;
	}

}
public class Heirarchical2 {
	public static void main(String[] args) {
		college2 c2=new college2("DU","Shivaji",2000);
		System.out.println(c2);
		System.out.println("--------------------------------------------------------------");
		Hinduclog c1=new Hinduclog("DU","Hindu",5000);
		System.out.println(c1);
	}
	
	

	}


