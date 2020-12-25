package com.moviemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviemanagement.entity.MovieEntity;
import com.moviemanagement.service.MovieServiceImpl;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private MovieServiceImpl movieserviceimpl;

	@PostMapping
	public String saveMovie(@RequestBody MovieEntity movie) {
		MovieEntity m = movieserviceimpl.saveMovieDetails(movie);
		return m.toString();
	}

	@GetMapping
	public List<MovieEntity> getAllMovies() {
		return movieserviceimpl.getAllMovieDetails();
	}

	@GetMapping("/{movieID}")
	public MovieEntity getMovieByID(@PathVariable(name = "movieID") Integer movieID) {
		return movieserviceimpl.getMovieByID(movieID);
	}

}
