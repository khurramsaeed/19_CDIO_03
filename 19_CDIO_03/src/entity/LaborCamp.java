package entity;

public class LaborCamp extends Ownable {

	private int baseRent;
	private int rent;
	private int cupSum;
	private int quantityOfLaborCamp;
	
	Cup c1 = new Cup();

	public LaborCamp(String fieldName, int price, int baseRent) {
		super(fieldName, price);
		this.baseRent = 100;
		this.quantityOfLaborCamp = 1;
		this.cupSum =  c1.sum();
	}
	


	@Override
	public int getRent() {
		
		
		int rent = (baseRent * cupSum) * quantityOfLaborCamp;
		this.rent = rent;
		return rent;
	}

	@Override
		public void setQuantityOfField(Player player) {
			player.setQuantityOfLaborCamps();
			
		}

		
	}


