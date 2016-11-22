package entity;

public class Fleet extends Ownable {

	private int Rent_1 = 500;
	private int Rent_2 = 1000;
	private int Rent_3 = 2000;
	private int Rent_4 = 4000;

	public Fleet(String fieldName, int price) { // skal der være rent i
												// paramteren? - Getprice
												// metode? -1?
		super(fieldName, price);
	}

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
	public void setQuantityOfField(Player player) {
		player.setQuantityOfFleets();

	}

}
