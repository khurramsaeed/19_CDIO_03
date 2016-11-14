package entity;

public class LaborCamp extends Ownable {
	
	private int rentMultiplier = 100;
	private int baseRent;
	
	public LaborCamp(String name, int price, int baseRent) {
		super(name, price);
		this.baseRent = baseRent;
	}
	
	public void setRent(int cupSum){
		baseRent = rentMultiplier * cupSum;
	}
	
	@Override
	public int getRent() {
		return baseRent;
	}
}

 