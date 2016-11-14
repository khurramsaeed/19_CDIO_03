package entity;

public class Fleet extends Ownable { 
	// Creating 4 variables for flees values
	private int Rent_1 = 500;
	private int Rent_2 = 1000;
	private int Rent_3 = 2000;
	private int Rent_4 = 4000;
	private int rent;
	
	public Fleet(String name, int price, int rent){
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

 