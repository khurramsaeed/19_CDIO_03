package entity;

public class Fleet extends Ownable { 
	
	int Rent_1 = 500;
	int Rent_2 = 1000;
	int Rent_3 = 2000;
	int Rent_4 = 4000;
	private int rent;

	public Fleet(String name, int rent, int price){
		super(name, price);
		this.rent = rent;
	}
	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}


}

 