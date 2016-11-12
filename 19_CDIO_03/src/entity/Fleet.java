package entity;

public class Fleet extends Ownable { 
	// Creating 4 variables for flees values
	int Rent_1 = 500;
	int Rent_2 = 1000;
	int Rent_3 = 2000;
	int Rent_4 = 4000;
	private int rent;
	//A method to handle the name,rent and the price of a fleet or more fleets
	public Fleet(String name, int rent, int price){
		super(name, price);
		this.rent = rent;
	}
	//A method to get the rent from previous class
	public int getRent() {
		return rent;
	}
	//A method to change the rent value
	public void setRent(int rent) {
		this.rent = rent;
	}


}

 