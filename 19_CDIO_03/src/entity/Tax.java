package entity;

import boundary.GuiBoundary;
import desktop_resources.GUI;

public class Tax extends Field {

	// Initialzing private int's
	private int taxAmount;
	private int taxRate;

	/**
	 * Constructor: public Tax
	 * @param fieldName is inherited from superclass
	 * @param taxAmount is equal to global taxAmount
	 */
	public Tax(String fieldName, int taxAmount) {
		super(fieldName);
		this.taxAmount = taxAmount;

	}

	@Override
	public void landOnField(Player player) {
		if (fieldName.equals("Caravan")) {
			boolean choosePayment = GuiBoundary.taxAmountButton(fieldName);
				if (choosePayment == true) {
					GuiBoundary.taxFixedAmount(taxAmount);
					player.setFortune(-taxAmount);
					GUI.setBalance(player.getPlayerName(), player.getFortune());
				}

		else if (choosePayment != true){
				taxRate = ((player.getFortune()) / 100) * 10;
				GuiBoundary.taxTenPercent(taxRate);
				player.setFortune(-taxRate);
				GUI.setBalance(player.getPlayerName(), player.getFortune());
			}

		}

		else /*(fieldName.equals("Goldmine"))*/ {
			GuiBoundary.taxGoldMine(fieldName, taxAmount);
			player.setFortune(-taxAmount);
			GUI.setBalance(player.getPlayerName(), player.getFortune());
		}

	}
	/**
	 * public int getTaxAmount method
	 * @return taxAmount
	 */
	public int getTaxAmount() {
		return taxAmount;
	}
}
