package entity;

import desktop_resources.GUI;

public class Tax extends Field {

	private int taxAmount;
	private int taxRate = -1; // hvorfor -1?

	public Tax(String fieldName, int taxAmount) {
		super(fieldName);
		this.taxAmount = taxAmount;

	}

	@Override
	public void landOnField(Player player) {
		if (fieldName == "Caravan") {
			boolean choosePayment = GUI.getUserLeftButtonPressed(
					"You landed on the Caravan, do you want to pay 4000, or 10% of your assets?", "Pay 4000",
					"Pay 10% of assets");
			if (choosePayment == true) {

				player.setFortune(-taxAmount);
			}

			else if (choosePayment == false) {
				taxRate = ((player.getFortune()) / 100) * 10;
				player.setFortune(-taxRate);
			}
		}

	}

	public int getTaxAmount() {

		return taxAmount;
	}
}
