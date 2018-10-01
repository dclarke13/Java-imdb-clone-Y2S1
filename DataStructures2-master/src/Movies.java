import java.io.Serializable;
import java.util.Date;

public class Movies implements Serializable
{
	
	private String Title;
	private String Release;
	private int RunTime;
	private String Genre;
	private String Plot;
	
	public Movies(String Title, String Release, int RunTime, String Genre, String Plot) 
	{
		this.Title = Title;
		this.Release = Release;
		this.RunTime = RunTime;
		this.Genre = Genre;
		this.Plot = Plot;
		
	}
	
	
	public String getTitle() 
	{
		return Title;
	}
	public String getRelease() 
	{
		return Release;
	}
	public int getRunTime() 
	{
		return RunTime;
	}
	public String getGenre() 
	{
		return Genre;
	}
	public String getPlot() 
	{
		return Plot;
	}
	
	public void setTitle(String title) 
	{
		Title = title;
	}
	public void setRelease(String release) 
	{
		Release = release;
	}
	public void setRunTime(int runTime) 
	{
		RunTime = runTime;
	}
	public void setGenre(String genre) 
	{
		Genre = genre;
	}
	public void setPlot(String plot) 
	{
		Plot = plot;
	}
	
}
