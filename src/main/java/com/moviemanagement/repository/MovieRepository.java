package com.moviemanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.moviemanagement.entity.MovieEntity;

@Repository
public interface MovieRepository extends MongoRepository<MovieEntity, Integer> {

	public MovieEntity findBymovieID(Integer movieID);

	
}
