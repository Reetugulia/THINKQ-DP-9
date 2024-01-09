package com.loopsassignment;

public class AdditionQ25 {
	public static void barrelprice()
	{
		int price=0;
		for(int nobarl=1; nobarl<=20; nobarl++)
		{
			if(nobarl<=10)
				price=nobarl*89;
			else
				price=(nobarl*89)-nobarl;
		
		}
		

	}
	public static void main(String[] args) {
		barrelprice();
		
	}

}
