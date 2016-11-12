package entity;

public class Territory extends Ownable {
	
	protected int rent;
	boolean buyIt = false;

	public Territory(String name, int rent, int price) {
		// TODO Auto-generated constructor stub
		super(name, price);
		this.rent = rent;
	}

	
	
} 