package com.enumdemo;

import java.util.Scanner;

public class BookTickets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose ticket type:");
		System.out.println("1.Standard;"+MovieSeats.STANDARD.price);
		System.out.println("2.Premium;"+MovieSeats.PREMIUM.price);
		System.out.println("3.Recliner;"+MovieSeats.RECLINER.price);
		
		int seattype=sc.nextInt();
		System.out.println("enter number of seats");
		
		int n=sc.nextInt();
		MovieSeats ms=null;
		switch(seattype)
		{
		case 1:ms=MovieSeats.STANDARD;
		       break;
		case 2:ms=MovieSeats.PREMIUM;
	        	break;
		case 3:ms=MovieSeats.RECLINER;
		       break;
		default:  System.out.println("error in input:"); 
		          System.exit(0);
		}
		System.out.println("---------------------------");
		System.out.println("Ticket type:"+ms);
		//System.out.println("Price of one ticket:"+ms.price);
		System.out.println("Total tickets:"+n);		
		System.out.println("Total price:"+(n*(ms.price)));
		
		sc.close();
	}

}
