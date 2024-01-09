package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Moviedao.MovieImpl;

import com.pojo.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char ch;
		int id;
		String name;
		double price;
		int choice;
		int num;
		Movie movie;
		List<Movie> mlist=new ArrayList<>();
		MovieImpl mdao=new MovieImpl();
		do
		{
			System.out.println("-----welcome to PVR----------");
			System.out.println("enter your choices");
			System.out.println("1.add movie");
			System.out.println("2.update movie");
			System.out.println("3.delete movie");
			System.out.println("4.Show movie list");
			System.out.println("5.search movie by id");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("----add movie");
			       System.out.println("how many employee you want to add ?");
			       num=sc.nextInt();
			       for(int i=0;i<num;i++)
			       {  
			       System.out.println("enter movie id");
			       id=sc.nextInt();
			       System.out.println("enter movie name");
			       name=sc.next();
			       System.out.println("enter ticket price");
			       price=sc.nextDouble();
			       movie=new Movie(id, name, price);
			       mdao.addMovie(movie);
			       }
			            
			      break;
			case 2: System.out.println("----update movie ---");   
         	        System.out.println("enter movie id");
                 	id=sc.nextInt();
                	System.out.println("enter name");
                 	name=sc.next();
                	System.out.println("enter price");
                	price=sc.nextDouble();
                	movie=new Movie(id, name, price);
                 	mdao.updateMovie(movie);
                 	break;
			      
			case 3:System.out.println("---delete movie-------"); 
			       System.out.println("enter book id");
			       id = sc.nextInt();
				   mdao.deletebyid(id);
				   break;
			case 4: System.out.println("------show list-------");
			        mlist=mdao.showMovielist();
			        if(!mlist.isEmpty())
			        {
			        	System.out.println("movie list");
			        	for(Movie m:mlist)
			        	{
			        		System.out.println(m);
			        	}
			        }
			     
			       break;
			case 5:System.out.println("----search movie ny id");       
			       System.out.println("enter the id");
			       id=sc.nextInt();
			       movie=mdao.searchMoviebyid(id);
			       if(movie!=null)
			    	   System.out.println(movie);
			       else
			    	   System.out.println("no movie exist");
			       break;
			}
			
			System.out.println("Do you want to continue ?");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}
