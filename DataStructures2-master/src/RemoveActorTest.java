import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveActorTest {

	@Test
	void test() {
		ActorList actorlist = new ActorList();
		
		String name1 = "actor1";
		String dob1 = "1 june";
		String gender1 = "Male";
		String nationality1 = "American";
		MovieList movielist1 = new MovieList();
		CharacterList characterlist1 = new CharacterList();
		String id1 = "01";
		
		String name2 = "actor2";
		String dob2 = "2 june";
		String gender2 = "Female";
		String nationality2 = "Irish";
		MovieList movielist2 = new MovieList();
		CharacterList characterlist2 = new CharacterList();
		String id2 = "02";
		
		String name3 = "actor3";
		String dob3 = "3 june";
		String gender3 = "Male";
		String nationality3 = "Italian";
		MovieList movielist3 = new MovieList();
		CharacterList characterlist3 = new CharacterList();
		String id3 = "03";
		
		Actors actor1 = new Actors(id1, name1, dob1, gender1, nationality1, movielist1, characterlist1);
		Actors actor2 = new Actors(id2, name2, dob2, gender2, nationality2, movielist2, characterlist2);
		Actors actor3 = new Actors(id3, name3, dob3, gender3, nationality3, movielist3, characterlist3);
   		actorlist.addActor(actor1);
   		actorlist.addActor(actor2);
   		actorlist.addActor(actor3);
   		
   		System.out.println(actorlist.countActors());
   		
   		ActorNode actornode = actorlist.getHead();
   		actornode = actornode.getNext();
   		actorlist.removeActor(actornode);
   		
   		
   		
   		assertEquals(2,actorlist.countActors());
	}

}
