import java.io.Serializable;

public class ActorNode implements Serializable
{
	
	private Actors actors;
	private ActorNode next;
	
	public ActorNode(Actors actors, ActorNode next) 
	{
		this.setActors(actors);
		this.setNext(next);
	}

	public Actors getActors() 
	{
		return actors;
	}
	public ActorNode getNext() 
	{
		return next;
	}

	public void setActors(Actors actors) 
	{
		this.actors = actors;
	}
	public void setNext(ActorNode next) 
	{
		this.next = next;
	}

}
