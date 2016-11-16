package entity;

public class LaborCamp extends Ownable {

	private int baseRent;
	private int rent;
	private int cupSum;

	public LaborCamp(String fieldName, int price, int baseRent) {
		super(fieldName, price);
		this.baseRent = baseRent;
	}
	
	public void setCupSum(int cupSum) {
		this.cupSum = cupSum;

	}
	
	public void setRent(int rent){
		baseRent = 100;
		rent = (baseRent * cupSum) * super.getOwner().getQuantityOfLaborCamps();
		this.rent = rent;
	}

	public int getRent() {
		return rent;
	}

	@Override
		public void setQuantityOfField(Player player) {
			player.setQuantityOfLaborCamps();
			
		}
	
		
	}


