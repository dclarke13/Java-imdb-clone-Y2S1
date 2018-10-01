import java.io.Serializable;

public class MovieNode implements Serializable
{
	
	private Movies movie;
	private MovieNode next;
	
	public MovieNode(Movies movies, MovieNode next) 
	{
		this.setMovies(movies);
		this.setNext(next);
	}

	public Movies getMovies() 
	{
		return movie;
	}
	public MovieNode getNext() 
	{
		return next;
	}

	public void setMovies(Movies movies) 
	{
		this.movie = movies;
	}
	public void setNext(MovieNode next) 
	{
		this.next = next;
	}

}
