package entity;

public class Territory extends Ownable {

	private int rent;

	public Territory(String fieldName, int rent, int price) {
		super(fieldName, rent);
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

	
	
	
	
	


