package entity;

public class LaborCamp extends Ownable {

	private int baseRent;
	private int rent;
	private int cupSum;
	private int quantityOfLaborCamps;

	public LaborCamp(String fieldName, int price, int baseRent) {
		super(fieldName, price);
		this.baseRent = baseRent;
	}

	public int getRent() {
		baseRent = 100;
		quantityOfLaborCamps = super.getOwner().getQuantityOfLaborCamps();
		this.rent = (baseRent * cupSum) * quantityOfLaborCamps;
		
		return rent;
	}

	public void setCupSum(int cupSum) {
		this.cupSum = cupSum;
	}

}
