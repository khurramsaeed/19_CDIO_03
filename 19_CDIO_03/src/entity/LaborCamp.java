package entity;

public class LaborCamp extends Ownable {
	
	private int rentMultiplier = 100;
	private int rent;

	public LaborCamp(String name, int price) {
		super(name, price);
		
	}
	
	public void setRent(int cupSum){
		rent = rentMultiplier  * cupSum;
	}
	
	@Override
	public int getRent() {
	
		return rent;
	}

}

 