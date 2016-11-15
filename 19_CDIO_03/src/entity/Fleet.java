package entity;

public class Fleet extends Ownable {

	private int Rent_1 = 500;
	private int Rent_2 = 1000;
	private int Rent_3 = 2000;
	private int Rent_4 = 4000;
	private int rent;

	public Fleet(String name, int price, int rent) {
		super(name, price);
		this.rent = rent;
	}

	public int getRent() {
		if (super.getOwner().getQuantityOfFleets() == 1) {
			rent = Rent_1;
		}

		else if (super.getOwner().getQuantityOfFleets() == 2) {
			rent = Rent_2;

		}

		else if (super.getOwner().getQuantityOfFleets() == 3) {
			rent = Rent_3;
		}

		else if (super.getOwner().getQuantityOfFleets() == 4) {
			rent = Rent_4;
		}
		return rent;
	}

}
