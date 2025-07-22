package com.coding;

import java.util.Collections;
import java.util.LinkedList;

class Movie implements Comparable<Movie>{
	
	private String movieName;
	private int movieTicket;
	private int movieYear;
	
	public Movie(String movieName, int movieTicket, int movieYear) {
		this.movieName = movieName;
		this.movieTicket = movieTicket;
		this.movieYear = movieYear;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getMovieTicket() {
		return movieTicket;
	}

	public int getMovieYear() {
		return movieYear;
	}

	@Override
	public int compareTo(Movie o) {
		return this.movieYear-o.movieYear;
	}

}

public class ComparableEx {

	public static void main(String[] args) {
		
		LinkedList<Movie> m=new LinkedList<Movie>();
		m.add(new Movie("Hello", 5, 1992));
		m.add(new Movie("Hi", 2, 1990));
		m.add(new Movie("Hey", 6, 1592));
		m.add(new Movie("New", 9, 2092));
		m.add(new Movie("Old", 1, 2192));
		

		Collections.sort(m);
		for (Movie movie : m) {
			System.out.println(movie.getMovieName() + " " +
					movie.getMovieTicket() + " " +
					movie.getMovieYear());
		}
	}

}
