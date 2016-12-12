package entity;

public class Refuge extends Field {

	// Initializing private int
	private int bonus;

	/**
	 * public Refuge method
	 * 
	 * @param fieldName
	 *            String is inherited from superclass
	 * @param bonus
	 *            int
	 * 
	 */
	public Refuge(String fieldName, int bonus) {
		super(fieldName);
		this.bonus = bonus;
	}

	/**
	 * public int getBonus method
	 * 
	 * @return bonus
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * public void setBonus method
	 * 
	 * @param bonus
	 *            is equals to global bonus
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String toString(){
		return "Refuge field, Name: "+ this.fieldName +", Bonus: "+ getBonus();
	}

	/**
	 * landOnField method, inherited from the super class. Specialized method
	 * that defines the operation of landOnField().
	 */
	@Override
	public void landOnField(Player player) {
		player.setFortune(bonus);
	}

}
