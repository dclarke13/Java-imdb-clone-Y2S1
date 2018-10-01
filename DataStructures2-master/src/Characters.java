import java.io.Serializable;

public class Characters implements Serializable
{
	private String characterName;

	public Characters (String characterName)
	{
		this.characterName = characterName;
	}
	
	public String getCharacterName() 
	{
		return characterName;
	}
	
	public void setCharacterName(String characterName) 
	{
		this.characterName = characterName;
	}
		
}
