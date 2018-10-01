import java.io.Serializable;

public class CharacterNode implements Serializable
{
	
	private Characters characters;
	private CharacterNode next;
	
	public CharacterNode(Characters characters, CharacterNode next) 
	{
		this.setCharacters(characters);
		this.setNext(next);
	}

	public Characters getCharacters() 
	{
		return characters;
	}
	public CharacterNode getNext() 
	{
		return next;
	}

	public void setCharacters(Characters characters) 
	{
		this.characters = characters;
	}
	public void setNext(CharacterNode next) 
	{
		this.next = next;
	}

}
