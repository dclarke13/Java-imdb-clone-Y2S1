import java.io.Serializable;

//check list Movies
public class MovieList implements Serializable
{
	private MovieNode head;
	private MovieNode tail;
	
	public void MovieList() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public MovieNode getHead() 
	{
		return head;
	} 
	
	public void addMovie(Movies movies) 
	{
		MovieNode newmovie = new MovieNode(movies, null);
		if(head == null) 
		{
			head = newmovie;
			tail = newmovie;
		}
		else
		{
			tail.setNext(newmovie);
			tail = newmovie;
		}
	} 
	
	public void removeMovie(MovieNode movienode) 
	{
		MovieNode movie = head;
		if (movienode != movie)
		{
			while(movie.getNext()!=null) 
			{
				if(movie.getNext()==movienode) 
				{
					movie.setNext(movienode.getNext());
				}
				movie=movie.getNext();
			}
		}
		else 
		{
			movienode=movienode.getNext();
		}
	}
	
	public String listMovies() 
	{
		String output = "";
		MovieNode movienode = head;
		if (movienode != null)
		{
			
			while(movienode.getNext() != null) 
			{
				output = output +"Title: " + movienode.getMovies().getTitle() + "\n" +
						"Release Date: " + movienode.getMovies().getRelease() + "\n" +
						"Run Time: " + movienode.getMovies().getRunTime() + "\n" +
						"Genre: " + movienode.getMovies().getGenre() + "\n" +
						"Plot Description: " + movienode.getMovies().getPlot() + "\n\n";
				movienode=movienode.getNext();
			}
			
			output = output +"Title: " + movienode.getMovies().getTitle() + "\n" +
					"Release Date: " + movienode.getMovies().getRelease() + "\n" +
					"Run Time: " + movienode.getMovies().getRunTime() + "\n" +
					"Genre: " + movienode.getMovies().getGenre() + "\n" +
					"Plot Description: " + movienode.getMovies().getPlot() + "\n\n";
		}
		else 
		{
			output = "No Movies Available";
		}
			
			return output;
	}
	
	
	public int countMovies()
	{
		int counter =1;
		MovieNode movienode = head;
		if( movienode==null)
		{
			counter = 0;
		}
		else
		{
			while(movienode.getNext() != null)
			{
				movienode=movienode.getNext();
				counter++;
			}
		}
			return counter;
	}
}
