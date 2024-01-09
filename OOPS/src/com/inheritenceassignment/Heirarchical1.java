package com.inheritenceassignment;
class Bank
{
	private String Bname;
	private int noofbranches;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String bname, int noofbranches) {
		super();
		Bname = bname;
		this.noofbranches = noofbranches;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getNoofbranches() {
		return noofbranches;
	}
	public void setNoofbranches(int noofbranches) {
		this.noofbranches = noofbranches;
	}
	@Override
	public String toString() {
		return "Bank [Bname=" + Bname + ", noofbranches=" + noofbranches + "]";
	}
	}
class Branch1 extends Bank
{
	private String Branchname1;
	private int branch1IFSC;
	public Branch1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch1(String bname, int noofbranches, String branchname1, int branch2IFSC) {
		super(bname, noofbranches);
		Branchname1 = branchname1;
		branch1IFSC = branch2IFSC;
	}
	public String getBranchname1() {
		return Branchname1;
	}
	public void setBranchname1(String branchname1) {
		Branchname1 = branchname1;
	}
	public int getBranch1IFSC() {
		return branch1IFSC;
	}
	public void setBranch1IFSC(int branch2IFSC) {
		branch1IFSC = branch2IFSC;
	}
	@Override
	public String toString() {
		return super.toString()+"Branch1 [Branchname1=" + Branchname1 + ", branch1IFSC=" + branch1IFSC + "]";
	}
	
	
	}
class Branch2 extends Bank
{
	private String Branchname2;
	private int branch2IFSC;
	
	public Branch2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch2(String bname, int noofbranches, String branchname2, int branch2IFSC) {
		super(bname, noofbranches);
		Branchname2 = branchname2;
		branch2IFSC = branch2IFSC;
	}
	public String getBranchname2() {
		return Branchname2;
	}
	public void setBranchname2(String branchname2) {
		Branchname2 = branchname2;
	}
	public int getBranch2IFSC() {
		return branch2IFSC;
	}
	public void setBranch2IFSC(int branch2IFSC) {
		branch2IFSC = branch2IFSC;
	}
	@Override
	public String toString() {
		return super.toString()+"Branch1 [Branchname2=" + Branchname2 + ", branch1IFSC=" + branch2IFSC + "]";
	}
	}

public class Heirarchical1 {
	public static void main(String[] args) {
		Branch1 b1=new Branch1("SBI",2,"Pune",11000034);
		System.out.println(b1);
		System.out.println("----------------------------------------------------------");
		Branch1 b2=new Branch1("SBI",2,"delhi",1100045);
		System.out.println(b2);
	}

}
