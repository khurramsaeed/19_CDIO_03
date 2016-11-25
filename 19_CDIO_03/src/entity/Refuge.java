package entity;

public class Refuge extends Field {

	// Initializing private int
	private int bonus;

	/**
	 * public Refuge method
	 * @param fieldName String is inherited from superclass
	 * @param bonus int
	 * 
	 */
	public Refuge(String fieldName, int bonus) {
		super(fieldName);
		this.bonus = bonus;
	}
	/**
	 * public int getBonus method
	 * @return bonus
	 */
	public int getBonus() {
		return bonus;
	}
	/**
	 * public void setBonus method
	 * @param bonus is equals to global bonus
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void landOnField(Player player) {
		player.setFortune(bonus);
	}

}
