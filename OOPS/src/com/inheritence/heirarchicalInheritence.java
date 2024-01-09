package com.inheritence;
class Student
{
	private String sname;
	private int sid;
	private int sroll;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String sname, int sid, int sroll) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sroll = sroll;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public int getSroll() {
		return sroll;
	}


	public void setSroll(int sroll) {
		this.sroll = sroll;
	}


	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sroll=" + sroll + "]";
	}
	
	
	 }
class Schoolstudent extends Student
{
	private String Schoolname;
	private int std;
	public Schoolstudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Schoolstudent(String sname, int sid, int sroll) {
		super(sname, sid, sroll);
		// TODO Auto-generated constructor stub
	}
	public Schoolstudent(String schoolname, int std) {
		super();
		Schoolname = schoolname;
		this.std = std;
	}
	public String getSchoolname() {
		return Schoolname;
	}
	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return super.toString()+"Schoolstudent [Schoolname=" + Schoolname + ", std=" + std + "]";
	}
	
	}
class collegestudent extends Student
{
	private String uni;
	private int sem;
	public collegestudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public collegestudent(String sname, int sid, int sroll) {
		super(sname, sid, sroll);
		// TODO Auto-generated constructor stub
	}
	public collegestudent(String uni, int sem) {
		super();
		this.uni = uni;
		this.sem = sem;
	}
	public String getUni() {
		return uni;
	}
	public void setUni(String uni) {
		this.uni = uni;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return super.toString()+"collegestudent [uni=" + uni + ", sem=" + sem + "]";
	}
	
	
	
	}
public class heirarchicalInheritence {
	public static void main(String[] args) {
		Schoolstudent st=new Schoolstudent("reetu",101,1);
		st.setSchoolname("DHLawrence");
		st.setSid(1111);
		System.out.println(st);
		
		collegestudent c=new collegestudent("du",4);
		System.out.println(c);
		
	}

}
