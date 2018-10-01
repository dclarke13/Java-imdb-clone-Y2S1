
import java.io.Serializable;
import java.util.Scanner;

public class ActorList implements Serializable
{
	private ActorNode head;
	private ActorNode tail;
	private Scanner input;
	
	public void ActorList() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public ActorNode getHead() 
	{
		return head;
	}
	
	public ActorNode getTail() 
	{
		return tail;
	}
	
	public void addActor(Actors actors) 
	{
		ActorNode newActor = new ActorNode(actors, null);
		if(head == null) 
		{
			head = newActor;
			tail = newActor;
		}
		else
		{
			tail.setNext(newActor);
			tail = newActor;
		}
	}
	
	public void removeActor(ActorNode actornode) 
	{
		ActorNode actors = head;
		if (actornode != actors)
		{
			while(actors.getNext()!=null) 
			{
				if(actors.getNext()==actornode) 
				{
					actors.setNext(actornode.getNext());
				} 
				actors=actors.getNext();
		
			}
		}
		else 
		{
			actornode=actornode.getNext();
		}
	}
	
	
	public String listActors() 
	{
		String output = "";
		ActorNode actornode = head;
		if (actornode != null)
		{
			
			while(actornode.getNext() != null) 
			{
				CharacterList characterlist = actornode.getActors().getCharacterlist();
				MovieList movielist = actornode.getActors().getMovielist();		
				output = output +" Actor ID: " + actornode.getActors().getActorID() +
						", Actor Name: " + actornode.getActors().getName() +
						", Date of birth: " + actornode.getActors().getDOB() +
						", Gender: " + actornode.getActors().getGender() +
						", Nationality: " + actornode.getActors().getNationality() + "\n" +
						"Movies appeared in: " + "\n" + movielist.listMovies() + "\n" +
						"Characters Played: " + "\n" + characterlist.listCharacters() + "\n";
						actornode=actornode.getNext();
			}
			
			CharacterList characterlist = actornode.getActors().getCharacterlist();
			MovieList movielist = actornode.getActors().getMovielist();		
			output = output +" Actor ID: " + actornode.getActors().getActorID() +
					", Actor Name: " + actornode.getActors().getName() +
					",Date of birth: " + actornode.getActors().getDOB() +
					", Gender: " + actornode.getActors().getGender() +
					", Nationality: " + actornode.getActors().getNationality() + "\n" +
					"Movies appeared in: " + "\n" + movielist.listMovies() + "\n" +
					"Characters Played: " + "\n" + characterlist.listCharacters() + "\n";

		}
		else
		{
			output = "No Actors Available";
		}

		return output;
	}

	public String listAName() 
	{
		String output = "";
		ActorNode actornode = head;
		if (actornode != null)
		{
			
			while(actornode.getNext() != null) 
			{	
				output = output +" Actor ID: " + actornode.getActors().getActorID() +
						", Actor Name: " + actornode.getActors().getName() +"\n";
						actornode=actornode.getNext();
			}
	
			output = output +" Actor ID: " + actornode.getActors().getActorID() +
					", Actor Name: " + actornode.getActors().getName();

		}
		else
		{
			output = "No Actors Available";
		}

		return output;
	}

	public int countActors()
	{
		int counter =1;
		ActorNode actornode = head;
		if( actornode==null)
		{
			counter = 0;
		}
		else
		{
			while(actornode.getNext() != null)
			{
				actornode=actornode.getNext();
				counter++;
			}
		}
			return counter;
	}
	
	
	

}
