package com.moviemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviemanagement.entity.MovieEntity;
import com.moviemanagement.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movierepository;
	
	@Override
	public MovieEntity saveMovieDetails(MovieEntity movie) {
		return movierepository.save(movie);
	}

	@Override
	public List<MovieEntity> getAllMovieDetails() {
		return movierepository.findAll();
	}

	@Override
	public MovieEntity getMovieByID(Integer movieID) {
		return movierepository.findBymovieID(movieID);
	}

	
}
