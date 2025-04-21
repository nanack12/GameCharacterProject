public class Game {
	public static void main(String[] args) {
		Character hero = new Character("Artemis", "Elf", 100, 50, 30);
		hero.getInventory().addItem("검", 10, 0, 0);
		hero.getInventory().addItem("방패", 0, 10, 0);
		hero.getInventory().addItem("포션", 0, 0, 50);
		hero.getInventory().printInventory(hero.getName());

		hero.attack("고블린", 25);
		hero.getInventory().useItem("포션", hero);
		hero.getInventory().printInventory(hero.getName());
		hero.attack("오크", 40);
		System.out.println("최종 HP: " + hero.getHp());

		BattleSystem battle = new BattleSystem();
		battle.fight(hero, "드래곤", 120);

		hero.getInventory().printItemDetails();
	}
}
