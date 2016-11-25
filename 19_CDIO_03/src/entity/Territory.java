package entity;

public class Territory extends Ownable {

	// Intializing int
	private int rent;

	/**
	 * Constructor: public Territory
	 * @param fieldName is inherited from superclass
	 * @param price is inherited from superclass
	 * @param rent is equals to global rent
	 */
	public Territory(String fieldName, int price, int rent) {
		super(fieldName, price);
		this.rent = rent;
	}

	@Override
	public int getRent() {
		return rent;
	}

	@Override
	public void setQuantityOfFields(Player player) {
		player.setQuantityOfTerritories();

	}

}
