import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
	List<Item> items = new ArrayList<>();

	public void addItem(String name, int atk, int def, int heal) {
		items.add(new Item(name, atk, def, heal));
	}

	public void useItem(String itemName, Character character){
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (item.getName().equals(itemName)) {
				System.out.println(item.getName() + " 아이템을 사용했습니다.");
				character.increaseStat(item.getAttack(), item.getDefense(), item.getHeal());
				items.remove(i);
				break;
			}
		}
	}

	public void printInventory(String heroName) {
		System.out.println(heroName + "의 인벤토리:");
		for (Item item : items) {
			System.out.println(item);		
		}
	}

	public void printItemDetails() {
		System.out.println("[아이템 상세 정보 출력 시작]");
		for (Item item : items){
			System.out.println("아이템: " + item.getName() + ", 공격력: " + item.getAttack() + ", 방어력: " + item.getDefense() + ", 회복량: " + item.getHeal());
		}

		System.out.println("[아이템 상세 정보 출력 끝]");
	}
}
