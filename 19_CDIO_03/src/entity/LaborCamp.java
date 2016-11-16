package entity;

public class LaborCamp extends Ownable {

	private int baseRent;
	private int rent;
	private int cupSum;

	public LaborCamp(String fieldName, int price, int baseRent) {
		super(fieldName, price);
		this.baseRent = 100;
	}
	
	public void setCupSum(int cupSum) {
		this.cupSum = 2;

	}
//	public void setRent(){
//		int rent = (baseRent * cupSum) * super.getOwner().getQuantityOfLaborCamps();
//		this.rent = rent;
//	}

	@Override
	public int getRent() {
		int rent = (baseRent * cupSum) * super.getOwner().getQuantityOfLaborCamps();
		this.rent = rent;
		return this.rent;
	}

	@Override
		public void setQuantityOfField(Player player) {
			player.setQuantityOfLaborCamps();
			
		}

		
	}


