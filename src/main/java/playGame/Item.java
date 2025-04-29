package playGame;

public class Item {
    private String name;
	private int attack;
	private int defense;
    private int heal;

    public Item(String name, int attack, int defense, int heal) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.heal = heal;
	}

	public String getName() {
        return name;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getHeal() {
        return heal;
    }
    
    @Override
	public String toString() {
		return name + " (공격력:" + attack + ", 방어력:" + defense + ", 회복력:" + heal + ")";
	}
}