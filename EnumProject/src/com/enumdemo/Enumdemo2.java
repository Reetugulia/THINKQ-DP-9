package com.enumdemo;
enum Seasons{WINTER,SUMMER,SPRING,MONSSON};
public class Enumdemo2 {
	public static void main(String[] args) {
		Seasons s=Seasons.WINTER;
		switch(s)
		{
		case WINTER:System.out.println("woolean clothes");
		            break;
		case SUMMER:System.out.println("cotton clothes");  
		             break;
		case SPRING:System.out.println("wear full sleeves");
	             	break;
		case MONSSON:System.out.println("carry umbrella");
		             break;
		  default:System.out.println("error");           
		}
	}
	

}
