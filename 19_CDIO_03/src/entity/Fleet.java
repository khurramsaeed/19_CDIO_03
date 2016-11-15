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
	
	public int payRent(int QuantityOfFleets){
		
			 if	(QuantityOfFleets == 1){ 
			rent = Rent_1;
		}
		
		else if (QuantityOfFleets == 2){
			rent = Rent_2;
			
		}
		
		else if (QuantityOfFleets == 3){
			rent = Rent_3;
		}
		
		else if (QuantityOfFleets == 4){
			rent = Rent_4;
		}
		return rent;
	}
}

 