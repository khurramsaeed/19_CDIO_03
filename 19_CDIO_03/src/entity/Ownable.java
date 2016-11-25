package entity;

import boundary.GuiBoundary;
import desktop_resources.GUI;
import entity.Player;

public abstract class Ownable extends Field {
	//Initializing int
	private int price;
	// Initializing player object as owner
	protected Player owner;

	/**
	 * 
	 * @param fieldName is same as superclass
	 * @param price is inherited but value is set locally
	 */
	public Ownable(String fieldName, int price) {
		super(fieldName);
		this.price = price;

	}
	/**
	 * Method getPrice
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * Method getOwner
	 * @return owner
	 */
	private Player getOwner() {
		return owner;
	}
	/**
	 * void method setOwner
	 * @param newOwner
	 */
	private void setOwner(Player newOwner) {
		owner = newOwner;

	}
	/**
	 * boolean checkIfOwned checks if a field is owned or not.
	 * @return true or false
	 */
	private boolean checkIfOwned() {
		if (owner == null)
			return false;
		else
			return true;
	}
	/**
	 * 
	 */
	public void landOnField(Player player) {
		// TODO Auto-generated method stub

		if (checkIfOwned() == true && owner.isBankrupt()){
			GUI.showMessage("This field was owned, but the previous owner is bankrupt, therefor you get the oppurtunity to buy");
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

	/**
	 * void method buyFieldOption
	 * @param buyer object of Player
	 */
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
	
	/**
	 * public Absrtact getrent method
	 * return: specialized classes that inherit from Ownable has it's own returns
	 */
	public abstract int getRent();
	/**
	 * public Absrtact setQuantityOfFields method
	 * return: specialized classes that inherit from Ownable has it's own returns
	 */
	public abstract void setQuantityOfFields(Player player);

}
