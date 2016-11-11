package entity;

public class LaborCamp extends Ownable {
	private int startRent = 100;
	private int fieldSum;
	
	public LaborCamp() {
		super();

	}
	public LaborCamp(String name, int price) {
		super(name, price);
		
	}
	
	public int getSum(int fieldSum){
		this.fieldSum = fieldSum;
		int rent = startRent * this.fieldSum;
		return rent;
	}

}

