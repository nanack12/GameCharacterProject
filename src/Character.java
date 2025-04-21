import java.util.ArrayList;
import java.util.List;

public class Character {
	String name;
	String race;
	int hp;
	int attack;
	int defense;
	List<Item> items = new ArrayList<>();
	InventoryManager inventory = new InventoryManager();

	String[] itemNames = new String[10];
	int[] itemAttack = new int[10];
	int[] itemDefense = new int[10];
	int[] itemHeal = new int[10];
	int itemCount = 0;

	public Character(String name, String race, int hp, int attack, int defense) {
		this.name = name;
		this.race = race;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

	public void increaseStat(int attackStat, int defenseStat, int hpStat){
		this.attack += attackStat;
		this.defense += defenseStat;
		this.hp += hpStat;
		System.out.println("현재 능력치 :  HP=" + hp + ", 공격력=" + attack + ", 방어력=" + defense);
	}

	public void decreaseStat(int attackStat, int defenseStat, int hpStat){
		this.attack -= attackStat;
		this.defense -= defenseStat;
		this.hp -= hpStat;
		System.out.println("현재 능력치 :  HP=" + hp + ", 공격력=" + attack + ", 방어력=" + defense);
	}

	public void attack(String enemyName, int enemyHp) {
		System.out.println(name + "이(가) " + enemyName + "을(를) " + attack + "의 데미지로 공격했습니다.");
		if (enemyHp - attack <= 0) {
			System.out.println(enemyName + " 처치 완료!");
		} else {
			System.out.println(enemyName + "의 남은 HP: " + (enemyHp - attack));
		}
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public String getName() {
		return name;
	}

	public List<Item> getItems(){
		return items;
	}

	public InventoryManager getInventory(){
		return inventory;
	}
}
