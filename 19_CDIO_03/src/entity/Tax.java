package entity;

public class Tax extends Field {

	private int taxAmount;
	private int taxRate = -1; //hvorfor -1?

	public Tax(String fieldName, int taxAmount, int taxRate) {
		super(fieldName);
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;

	}
	
	
	@Override
	public void landOnField(Player player) {
		taxRate = ((player.getFortune()) / 100) * 10;

		if (player.getPayAmountOrPercentage() == true) {
			player.setFortune(taxAmount);
		} else if (player.getPayAmountOrPercentage() == false) {
			player.setFortune(taxRate);
		}

	}
	
	public int getRent(){
		return -1;
		
	}

}
