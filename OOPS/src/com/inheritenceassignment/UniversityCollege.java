package com.inheritenceassignment;
class University
{
	private String uname;
	private int uid;
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public University(String uname, int uid) {
		super();
		this.uname = uname;
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "University [uname=" + uname + ", uid=" + uid + "]";
	}
	
	
	}
class College extends University
{
	protected int cid;
	private String cname;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return super.toString()+"College [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
public class UniversityCollege {
	public static void main(String[] args) {
		College c1=new College(1,"miranda house");
		System.out.println(c1);
		c1.setUname("DU");
		c1.setUid(101);
		System.out.println(c1);
		
	}

}
