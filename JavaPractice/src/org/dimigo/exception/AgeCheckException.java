package org.dimigo.exception;

public class AgeCheckException extends Exception {
	
	public AgeCheckException() {
		
	}
	
	public AgeCheckException(Movie movie) {
		super(movie);
		int i = movie.getLimitAge();
		System.out.println(movie.getTitle() + "은/는 " + i + "세 이상 관람가입니다.");
		
	}

}
