package com.Moviedao;

import java.util.List;

import com.pojo.Movie;


public interface Moviedao {
	void addMovie(Movie movie);
	void updateMovie(Movie movie);
	void deletebyid(int id);
	List<Movie> showMovielist();
	Movie searchMoviebyid(int id);

}
