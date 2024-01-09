package com.Moviedao;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Movie;

public class MovieImpl implements Moviedao{

	Movie mobj;
	List<Movie> mlist=null;
	
	public MovieImpl() {
		super();
		mlist=new ArrayList<>();
	}

	@Override
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		mlist.add(movie);
	}

	@Override
	public void updateMovie(Movie movie) {
	       mobj=searchMoviebyid(movie.getMid());
			
			if(mobj!=null) {
				System.out.println("movie is present");
				for(int i=0;i<mlist.size();i++) {
					if(movie.getMid()==mlist.get(i).getMid()) {
						mlist.set(i, movie);
						System.out.println("movie updated");
					}
				}
			}
			else {
				System.out.println("movie record not found");
			}
		
	}

	@Override
	public void deletebyid(int id) {
		// TODO Auto-generated method stub
        mobj=searchMoviebyid(id);
		
		if(mobj!=null) {
			for(int i=0;i<mlist.size();i++) {
				if(id==mlist.get(i).getMid()) {
					mlist.remove(i);
					System.out.println("movie deleted");
				}
			}
		}
		else {
			System.out.println("movie record not found");
		}
		
	}

	@Override
	public List<Movie> showMovielist() {
		// TODO Auto-generated method stub
		return mlist;
	}

	@Override
	public Movie searchMoviebyid(int id) {
		// TODO Auto-generated method stub
		mobj=null;
		for(int i=0;i<mlist.size();i++)
		{
			if(id==mlist.get(i).getMid())
			{
				System.out.println("id"+id);
				mobj=mlist.get(i);
				break;
			}
		}return mobj;
	}

}
