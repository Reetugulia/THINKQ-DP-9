package com.inheritenceassignment;
class Mall
{
	protected String Mallname;
	private int mallarea;
	public Mall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mall(String mallname, int mallarea) {
		super();
		Mallname = mallname;
		this.mallarea = mallarea;
	}
	public String getMallname() {
		return Mallname;
	}
	public void setMallname(String mallname) {
		Mallname = mallname;
	}
	public int getMallarea() {
		return mallarea;
	}
	public void setMallarea(int mallarea) {
		this.mallarea = mallarea;
	}
	@Override
	public String toString() {
		return "Mall [Mallname=" + Mallname + ", mallarea=" + mallarea + "]";
	}
	
	
	}
class shop extends Mall
{
	private String sname;
	private int srent;
	public shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public shop(String mallname, int mallarea) {
		super(mallname, mallarea);
		// TODO Auto-generated constructor stub
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSrent() {
		return srent;
	}
	public void setSrent(int srent) {
		this.srent = srent;
	}
	@Override
	public String toString() {
		return super.toString()+"shop [sname=" + sname + ", srent=" + srent +Mallname+ "]";
	}
	
	
	}


public class MallShop {
	public static void main(String[] args) {
		shop s=new shop("biba",50000);
		s.setMallname("Ambiance");
		s.setMallarea(2000);
		System.out.println(s);
	}
	

}
