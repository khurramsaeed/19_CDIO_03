package entity;

public class Refuge extends Field {

	private int bonus;

	public Refuge(String fieldName, int bonus) {
		super(fieldName);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void landOnField(Player player) {
		player.setFortune(bonus);
	}

}
