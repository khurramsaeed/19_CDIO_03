package entity;

import boundary.GuiBoundary;
import desktop_resources.GUI;
import entity.Player;

public abstract class Ownable extends Field {

	private int price;
	protected Player owner;

	public Ownable(String fieldName, int price) {
		super(fieldName);
		this.price = price;

	}

	public int getPrice() {
		return price;
	}

	private Player getOwner() {
		return owner;
	}

	private void setOwner(Player newOwner) {
		owner = newOwner;

	}

	private boolean checkIfOwned() {
		if (owner == null)
			return false;
		else
			return true;
	}

	public void landOnField(Player player) {
		// TODO Auto-generated method stub

		if (checkIfOwned() == true && player.getPlayerName() != owner.getPlayerName()) {
			System.out.println("pay rent");
			GuiBoundary.payRent(this.fieldName, owner);
			int rent = getRent();
			GuiBoundary.showRent(rent);

			if (rent > player.getFortune()) {
				int remainingFortune = player.getFortune();
				
				GuiBoundary.bankrupt(getOwner());
				player.setFortune(-remainingFortune);
				GUI.setBalance(player.getPlayerName(), player.getFortune());
				owner.setFortune(remainingFortune);
				GUI.setBalance(owner.getPlayerName(), owner.getFortune());
			} else {
				player.setFortune(-rent);
				GUI.setBalance(player.getPlayerName(), player.getFortune());
				owner.setFortune(rent);
				GUI.setBalance(owner.getPlayerName(), owner.getFortune());
			}
		}

		else if (checkIfOwned() != true) {
			System.out.println("buy option");
			buyFieldOption(player);
			
			
			}

		}

	
	private void buyFieldOption(Player buyer) {
		
		if(buyer.getFortune() < getPrice()){
			GuiBoundary.notEnoughMoney();
		}
		if (buyer.getFortune() > getPrice()) {
			boolean buyOption = GuiBoundary.buyFieldButton(fieldName, getPrice());
	
			if (buyOption == true) {
				buyer.setFortune(-getPrice());
				setOwner(buyer);
				setQuantityOfFields(buyer);
			} else if (buyOption != true) {
				GuiBoundary.notBought();
			}

		}
	}
	

	public abstract int getRent();

	public abstract void setQuantityOfFields(Player player);

}
