import java.io.Serializable;

//check list Characters
public class CharacterList implements Serializable
{
	private CharacterNode head;
	private CharacterNode tail;
	
	public void CharacterList() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public CharacterNode getHead() 
	{
		return head;
	}
	
	public void addCharacter(Characters characters) 
	{
		CharacterNode newcharacter = new CharacterNode(characters, null);
		if(head == null) 
		{
			head = newcharacter;
			tail = newcharacter;
		}
		else
		{
			tail.setNext(newcharacter);
			tail = newcharacter;
		}
	}
	
	public void removeCharacter(CharacterNode characternode) 
	{
		CharacterNode character = head;
		if (characternode != character)
		{
			while(character.getNext()!=null) 
			{
				if(character.getNext()==characternode) 
				{
					character.setNext(characternode.getNext());
				}
				character=character.getNext();
			}
		}
		else 
		{
			characternode=characternode.getNext();
		}
	}
	
	
	public String listCharacters() 
	{
		String output = "";
		CharacterNode characternode = head;
		if (characternode != null)
		{
			
			while(characternode.getNext() != null) 
			{
				output = output +" Character Name: " + characternode.getCharacters().getCharacterName() + "\n";
				characternode=characternode.getNext();
			}
			
			output = output +" character Name: " + characternode.getCharacters().getCharacterName() + "\n";
		}
		else 
		{
			output = "No Characters Available";
		}
			
			return output;
	}
	
	
	public int countCharacters()
	{
		int counter =1;
		CharacterNode characternode = head;
		if( characternode==null)
		{
			counter = 0;
		}
		else
		{
			while(characternode.getNext() != null)
			{
				characternode=characternode.getNext();
				counter++;
			}
		}
			return counter;
	}
}
