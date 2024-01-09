package com.oopsLab;

public class Static {
	 int x=0;
		static int y=0;
			
			
			 void display(){
				x++;
				y++;
				System.out.println("x:"+x);
				System.out.println("y:"+y);
			 }
	 public static void main(String[] args) {
	
		 
		 Static s1=new  Static();
		
		 s1.display();
		 Static s2=new  Static();
		 s2.display();
		
		 
		 
		 
		 
		
	}
	

}
