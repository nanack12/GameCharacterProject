import java.util.ArrayList;
import java.util.List;

public class Character {
	String name;
	String race;
	int hp;
	int attack;
	int defense;
	List<Item> items = new ArrayList<>();

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

	public void addItem(String name, int atk, int def, int heal) {
		items.add(new Item(name, atk, def, heal));
	}

	public void printInventory() {
		System.out.println(name + "의 인벤토리:");
		for (Item item : items) {
			System.out.println(item);		
		}
	}

	public void useItem(String itemName) {
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (item.getName().equals(itemName)) {
				attack += item.getAttack();
				defense += item.getDefense();
				hp += item.getHeal();
				System.out.println(item.getName() + " 아이템을 사용했습니다. 현재 능력치: HP=" + hp + ", 공격력=" + attack + ", 방어력=" + defense);
				items.remove(i);
				break;
			}
		}
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
}
