package com.moviemanagement.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="MOVIEDB")	
public class MovieEntity {
	
	
	@Field("MovieID")
	private int movieID;
    @Field("Movie Name")
	private String movieName;
    @Field("Movie Rating")
	private int movieRating;
    @Field("Movie Budget")
	private double movieBudget;
	
	@CreatedDate
	 @Field("Movie Release Date")
	private Date movieReleaseDate;
	
	@LastModifiedDate
	@Field("Movie MovieStatistics LastModified")
	private Date movieStatisticsLastModified;

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}

	public double getMovieBudget() {
		return movieBudget;
	}

	public void setMovieBudget(double movieBudget) {
		this.movieBudget = movieBudget;
	}

	public Date getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(Date movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public Date getMovieStatisticsLastModified() {
		return movieStatisticsLastModified;
	}

	public void setMovieStatisticsLastModified(Date movieStatisticsLastModified) {
		this.movieStatisticsLastModified = movieStatisticsLastModified;
	}

	@Override
	public String toString() {
		return "MovieEntity [movieID=" + movieID + ", movieName=" + movieName + ", movieRating=" + movieRating
				+ ", movieBudget=" + movieBudget + ", movieReleaseDate=" + movieReleaseDate
				+ ", movieStatisticsLastModified=" + movieStatisticsLastModified + "]";
	}

	
	   
	
}
