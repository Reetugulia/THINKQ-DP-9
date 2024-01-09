package com.staticassignment;

class staticaccess{
	 private static String schoolname;
	 int schoolid;
	 
	 public static void setSchoolname(String schoolname)
	 {
		 staticaccess.schoolname=schoolname;
	 }
	 public static String getSchoolname()
	 {
		 return schoolname;
	 }
	
}

public class AcessStatic {
	public static void main(String[] args) {
		staticaccess.setSchoolname("abc");
		System.out.println(staticaccess.getSchoolname());
		
	}

}
