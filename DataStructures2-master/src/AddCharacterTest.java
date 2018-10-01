import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddCharacterTest {

	@Test
	void test() {
		CharacterList characterlist = new CharacterList();
		
		String name = "character1";
		
		Characters character = new Characters(name);
		
		characterlist.addCharacter(character);
		int count = characterlist.countCharacters();
		
		assertEquals(1, characterlist.countCharacters());
	}

}
