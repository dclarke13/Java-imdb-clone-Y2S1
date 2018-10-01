import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddActorTest {

	@Test
	void test() {
		ActorList actorlist = new ActorList();
		
		String name = "actor1";
		String dob = "1 june";
		String gender = "Male";
		String nationality = "American";
		MovieList movielist = new MovieList();
		CharacterList characterlist = new CharacterList();
		String id = "01";
		
		Actors actor = new Actors(id, name, dob, gender, nationality, movielist, characterlist);
   		actorlist.addActor(actor);
   		
   		int count = actorlist.countActors();
   		
   		assertEquals(1,count);
	}

}
