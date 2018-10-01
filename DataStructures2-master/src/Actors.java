import java.io.Serializable;

public class Actors implements Serializable


{
	private String actorID;
	private String name;
	private String DOB;
	private String Gender;
	private String Nationality;
	private MovieList movielist;
	private CharacterList characterlist;
	
	public Actors (String actorID, String name, String DOB, String Gender,String Nationality, MovieList movielist, CharacterList characterlist) 
	{
		this.actorID = actorID;
		this.name = name;
		this.DOB = DOB;
		this.Gender = Gender;
		this.Nationality = Nationality;
		this.movielist = movielist;
		this.characterlist = characterlist;
		
	}

	public String getName() 
	{
		return name;
	}
	public String getDOB() 
	{
		return DOB;
	}
	public String getGender() 
	{
		return Gender;
	}
	public String getNationality() 
	{
		return Nationality;
	}
	public MovieList getMovielist() 
	{
		return movielist;
	}
	public CharacterList getCharacterlist() 
	{
		return characterlist;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public void setDOB(String dOB) 
	{
		DOB = dOB;
	}
	public void setGender(String gender) 
	{
		Gender = gender;
	}
	public void setNationality(String nationality) 
	{
		Nationality = nationality;
	}
	public void setMovielist(MovieList movielist) 
	{
		this.movielist = movielist;
	}
	public void setCharacterlist(CharacterList characterlist) 
	{
		this.characterlist = characterlist;
	}

	public String getActorID() {
		return actorID;
	}

	public void setActorID(String actorID) {
		this.actorID = actorID;
	}
	
	
}
