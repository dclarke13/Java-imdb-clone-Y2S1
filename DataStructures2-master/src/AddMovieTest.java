import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AddMovieTest {
	
	void test() {

	MovieList movielist = new MovieList();
	
	String Title = "movie1";
	String Release = "19,12,2017";
	int RunTime = 30;
	String Genre = "Horror";
	String Plot = "none";
	
	Movies movie = new Movies(Title, Release, RunTime, Genre, Plot);
	movielist.addMovie(movie);
	
	int count = movielist.countMovies();
	
	assertEquals(1, count);
	
}
}