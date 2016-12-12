package entity;

import boundary.GuiBoundary;
import desktop_resources.GUI;
import entity.Player;

public abstract class Ownable extends Field {
	// Initializing int
	private int price;
	// Initializing player object as owner
	protected Player owner;

	/**
	 * 
	 * @param fieldName
	 *            is same as superclass
	 * @param the
	 *            inheritance of the class "Field" is specialized in class
	 *            Ownable, and variable price is added.
	 */
	public Ownable(String fieldName, int price) {
		super(fieldName);
		this.price = price;

	}

	/**
	 * Method getPrice
	 * 
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Method getOwner
	 * 
	 * @return owner
	 */
	private Player getOwner() {
		return owner;
	}

	/**
	 * void method setOwner
	 * 
	 * @param newOwner
	 */
	private void setOwner(Player newOwner) {
		owner = newOwner;

	}
	
	public  String toString(){
		return "Ownable field, Name: "+this.fieldName + ", Price:"+getPrice();
	}

	/**
	 * boolean checkIfOwned checks if a field is owned or not/ checks if owner
	 * == null or otherwise
	 * 
	 * @return true or false
	 */
	private boolean checkIfOwned() {
		if (owner == null)
			return false;
		else
			return true;
	}

	/**
	 * landOnField method, inherited from the super class. Specialized method
	 * that defines the operation of landOnField() Lands a player on a field,
	 * and operate different scenarios, depending on the conditions specified in
	 * the if-statements
	 */
	public void landOnField(Player player) {
		// TODO Auto-generated method stub

		if (checkIfOwned() == true && owner.isBankrupt()) {
			GUI.showMessage(
					"This field was owned, but the previous owner is bankrupt, therefor you get the oppurtunity to buy");
			setOwner(null);
		}

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
			} 
			else {
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

	/**
	 * void method buyFieldOption
	 * 
	 * @param buyer
	 *            object of Player Method that gives the player the opportunity
	 *            to buy, in different scenarios.
	 */
	private void buyFieldOption(Player buyer) {

		if (buyer.getFortune() < getPrice()) {
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

	/**
	 * public Absrtact getrent method return: each specialized class that
	 * inherit from Ownable has it's own returns
	 */
	public abstract int getRent();

	/**
	 * Abstract setQuantityOfFields method return: each specialized class that
	 * inherit from Ownable has it's own returns
	 */
	public abstract void setQuantityOfFields(Player player);

}
