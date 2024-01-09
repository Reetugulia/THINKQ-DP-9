package com.staticassignment;
class Final1 {
    final int a= 100; // 'final' variable
    void displaya() {
      
        System.out.println("a:"+a);
    }
}


class Final2 {
   
    final void displayMessage() {//final method
        System.out.println("This is a final method2.");
    }
}


final class FinalClass2 {//final class
    void displayInfo() {
        System.out.println("This is a final class.");
    }
}
public class FinalKeyword {
	public static void main(String[] args) {
		
	      
	        Final1 f1 = new Final1();
	        f1.displaya();

	       
	        Final2 f2 = new Final2();
	        f2.displayMessage();

	       
	        FinalClass2 fc = new FinalClass2();
	        fc.displayInfo();
	    
	
}

}
