package entity;

public class Fleet extends Ownable {

	// Initializing private int's that function as the different rents of the
	// field type "fleet"
	private int Rent_1 = 500;
	private int Rent_2 = 1000;
	private int Rent_3 = 2000;
	private int Rent_4 = 4000;

	/**
	 * 
	 * @param fieldName
	 *            is String
	 * @param price
	 *            is integer Inherits from super (fieldName, price)
	 */
	public Fleet(String fieldName, int price) {
		super(fieldName, price);
	}

	/**
	 * getRent()
	 * Method that contains a switch statement, that chooses the rent based on the quantity of fleets owned by same owner.
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
	 * Method that makes sure, that one fleet is added to the Players quantityOfFleets
	 */
	public void setQuantityOfFields(Player player) {
		player.setQuantityOfFleets();

	}
	
	public void setOwner(Player newOwner){
		newOwner = super.owner;
	}

}
