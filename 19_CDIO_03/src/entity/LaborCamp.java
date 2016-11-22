package entity;

public class LaborCamp extends Ownable {

	private int baseRent;
	private int cupSum;
	
	
	Cup c1 = new Cup();

	public LaborCamp(String fieldName, int price, int baseRent){
		super(fieldName, price);
		this.baseRent = 100;
		this.cupSum =  c1.getSum();
	}
	
	@Override
	public int getRent(){
		int rent = (baseRent * cupSum) *  (owner == null ? 0 : super.owner.getQuantityOfLaborCamps());
		return rent;
	}

	@Override
	public void setQuantityOfField(Player player) {
		player.setQuantityOfLaborCamps();
			
		}

		
	}


