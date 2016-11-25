package entity;

public class Fleet extends Ownable {

	// Initializing private int's 
	private int Rent_1 = 500;
	private int Rent_2 = 1000;
	private int Rent_3 = 2000;
	private int Rent_4 = 4000;

	/**
	 * 
	 * @param fieldName is String
	 * @param price is integer
	 * Inherits from super (fieldName, price)
	 */
	public Fleet(String fieldName, int price) { 
		super(fieldName, price);
	}

	/**
	 * getRent()
	 */
	public int getRent() {
		switch (super.owner.getQuantityOfFleets()) {
		case 1:
			return Rent_1;
		case 2:
			return Rent_2;
		case 3:
			return Rent_3;
		case 4:
			return Rent_4;
		default:
			return 0;
		}

	}

	@Override
	/**
	 * setQuantityofFields()
	 */
	public void setQuantityOfFields(Player player) {
		player.setQuantityOfFleets();

	}

}
