package entity;

import boundary.GuiBoundary;
import desktop_resources.GUI;

public class LaborCamp extends Ownable {

	private int baseRent;
	private int cupSum;
	private Cup c1 = new Cup();

	public LaborCamp(String fieldName, int price) {
		super(fieldName, price);
		this.baseRent = 100;

	}

	@Override
	public int getRent() {
		GuiBoundary.laborCampButton();
		
		c1.throwDice();
		
		GUI.setDice(c1.getD1Result(), c1.getD2Result());
		
		this.cupSum = c1.getSum();

		int rent = (baseRent * cupSum) * (owner == null ? 0 : super.owner.getQuantityOfLaborCamps());
		return rent;
	}

	@Override
	public void setQuantityOfFields(Player player) {
		player.setQuantityOfLaborCamps();

	}

}
