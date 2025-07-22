package com.coding;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Movies implements Comparable<Movies>{
	
	private String movieName;
	private int movieTicket;
	private int movieYear;
	
	public Movies(String movieName, int movieTicket, int movieYear) {
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
	public int compareTo(Movies o) {
		return this.movieYear-o.movieYear;
	}

}

class CompareMovie implements Comparator<Movies>{

	@Override
	public int compare(Movies m1, Movies m2) {
		return m1.getMovieName().compareTo(m2.getMovieName());
	}
	
}

class CompareTicket implements Comparator<Movies>{

	@Override
	public int compare(Movies m1, Movies m2) {
		if(m1.getMovieTicket()<m2.getMovieTicket())return -1;
		if(m1.getMovieTicket()>m2.getMovieTicket())return 1;
		else return 0;
	
}
}

class CompareYear implements Comparator<Movies>{

	@Override
	public int compare(Movies m1, Movies m2) {
		if(m1.getMovieYear()<m2.getMovieYear())return -1;
		if(m1.getMovieYear()>m2.getMovieYear())return 1;
		else return 0;
	}
	
}

public class ComparatorEx {

		public static void main(String[] args) {

			
			LinkedList<Movies> m=new LinkedList<Movies>();
			m.add(new Movies("Hello", 5, 1992));
			m.add(new Movies("Hi", 2, 1990));
			m.add(new Movies("Hey", 6, 1592));
			m.add(new Movies("New", 9, 2092));
			m.add(new Movies("Old", 1, 2192));
			

			System.out.println("Sorted by rating");
			CompareYear y=new CompareYear();
	        Collections.sort(m, y);
	        for (Movies movie: m)
	            System.out.println(movie.getMovieYear() + " " +
	                               movie.getMovieName() + " " +
	                               movie.getMovieYear());
		
		}
}



