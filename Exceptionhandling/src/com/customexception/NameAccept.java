package com.customexception;

import java.util.Scanner;

public class NameAccept {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner (System.in);
			
			System.out.println("enter name");
			
			String name=sc.next();
			try
			{
				if(name.length()<3)
					throw new InvalidnameException("name must have more than 2 characters");	
			    System.out.println("welcome:"+name);	
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
	
		
	}

}
