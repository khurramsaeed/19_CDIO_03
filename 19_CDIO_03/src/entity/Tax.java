package entity;

import desktop_resources.GUI;

public class Tax extends Field {

	private int taxAmount;
	private int taxRate;

	public Tax(String fieldName, int taxAmount) {
		super(fieldName);
		this.taxAmount = taxAmount;

	}

	@Override
	public void landOnField(Player player) {
		if (fieldName.equals("Caravan")) {
			boolean choosePayment = GUI.getUserLeftButtonPressed(
					"You landed on "+fieldName+", do you want to pay 4000, or 10% of your assets?", "Pay 4000",
					"Pay 10% of assets");
				if (choosePayment == true) {
					GUI.getUserButtonPressed("You chose to pay the fixed tax amount "+taxAmount, "PAY");
					player.setFortune(-taxAmount);
					GUI.setBalance(player.getPlayerName(), player.getFortune());
				}

		else if (choosePayment != true){
				taxRate = ((player.getFortune()) / 100) * 10;
				GUI.getUserButtonPressed("You chose to pay 10% of your assests in tax, you will have to pay "+taxRate, "PAY");
				player.setFortune(-taxRate);
				GUI.setBalance(player.getPlayerName(), player.getFortune());
			}

		}

		else /*(fieldName.equals("Goldmine"))*/ {
			GUI.getUserButtonPressed("You landed on "+fieldName+" you will have to pay "+taxAmount, "PAY");
			player.setFortune(-taxAmount);
			GUI.setBalance(player.getPlayerName(), player.getFortune());
		}

	}

	public int getTaxAmount() {

		return taxAmount;
	}
}
