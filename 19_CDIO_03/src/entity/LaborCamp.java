package entity;

public class LaborCamp extends Ownable {
	
	private int startRent = 100;
	private int cupSum;
	
	public LaborCamp() {
		super();

	}
	public LaborCamp(String name, int price) {
		super(name, price);
		
	}
	
	public int getSum(int cupSum){
		this.cupSum = cupSum;
		int rent = startRent * this.cupSum;
		return rent;
	}

}

