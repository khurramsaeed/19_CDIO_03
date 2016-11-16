package entity;

public class Territory extends Ownable {

	protected int rent;

	public Territory(String fieldName, int price, int rent) {
		super(fieldName, price);
		this.rent = rent;
	}

	@Override
	public int getRent() {
		return rent;
	}

	@Override
	public void setQuantityOfField(Player player) {
		player.setQuantityOfTerritories();
		
	}
	
	

	


		


	
		
	}

	
	
	
	
	


