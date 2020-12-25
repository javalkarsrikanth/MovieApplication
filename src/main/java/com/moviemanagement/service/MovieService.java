package com.moviemanagement.service;

import java.util.List;

import com.moviemanagement.entity.MovieEntity;

public interface MovieService {
	
	public MovieEntity saveMovieDetails(MovieEntity movie);
	
	public List<MovieEntity> getAllMovieDetails();
	
	public MovieEntity getMovieByID(Integer movieID);
	
}
