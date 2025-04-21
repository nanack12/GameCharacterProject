public class InventoryManager {
	public void printItemDetails(Character c) {
		System.out.println("[아이템 상세 정보 출력 시작]");
		for (Item item : c.getItems()){
			System.out.println("아이템: " + item.getName() + ", 공격력: " + item.getAttack() + ", 방어력: " + item.getDefense() + ", 회복량: " + item.getHeal());
		}

		System.out.println("[아이템 상세 정보 출력 끝]");
	}
}
