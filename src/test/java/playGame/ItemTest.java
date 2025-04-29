package playGame;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
	public void testAddItem() {
		Character hero = new Character("Artemis", "Elf", 100, 50, 30);
		
		hero.addItem("검", 10, 0, 0);

		assertEquals(1, hero.getItemCount());
		assertEquals("검", hero.getItemName(0));
		assertEquals(10, hero.getItemAttack(0));
		assertEquals(0, hero.getItemDefense(0));
		assertEquals(0, hero.getItemHeal(0));
	}

	@Test
	public void testAttack() {
		Character hero = new Character("Artemis", "Elf", 100, 50, 30);

		int enemyHp = 70;

		int remainHp = enemyHp -  hero.getAttack();
		assertEquals(20, remainHp); 
		
	}

	@Test
	public void testUseItem() {
		Character hero = new Character("Artemis", "Elf", 100, 50, 30);

		hero.addItem("포션", 0, 0, 50);
		assertEquals(1, hero.getItemCount());

		hero.useItem("포션");
		
		assertEquals(50, hero.getAttack()); 
		assertEquals(30, hero.getDefense());
		assertEquals(150, hero.getHp());  
		assertEquals(0, hero.getItemCount()); 
	}

	@Test
	public void testfight() {
	}
	
}
