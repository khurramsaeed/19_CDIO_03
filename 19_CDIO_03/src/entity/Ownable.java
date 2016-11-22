package entity;

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

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player newOwner) {
		owner = newOwner;

	}
	
	public boolean checkIfOwned() {
		if(owner == null)
			return false;
		else 
			return true;
}

	

	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
		if(checkIfOwned() == true && player.getPlayerName() != owner.getPlayerName()){
			System.out.println("pay rent");
			GUI.showMessage("The field ("+this.fieldName+") is owned, you have to pay "+getRent()+" int rent to " + getOwner());
		
			if(getRent()  > player.getFortune()){
				GUI.showMessage("You dont have enough, your are bankrupt! "+ getOwner() + " gets the rest of your fortune");
				player.setFortune(-player.getFortune());
				owner.setFortune(player.getFortune());
				GUI.setBalance(owner.getPlayerName(), owner.getFortune());
			}
			else{
			player.setFortune(-getRent());
			owner.setFortune(getRent());
			GUI.setBalance(owner.getPlayerName(), owner.getFortune());
			}
		}

			else if (checkIfOwned() != true) {
			System.out.println("buy option");
			buyFieldOption(player);

		} 
	
	}

	

	public void buyFieldOption(Player buyer) {
		boolean buyOption = GUI.getUserLeftButtonPressed("This field ("+fieldName+") is not owned, do you want to buy it for "+getPrice()+" coins?", "Yes", "No");
		if(buyOption == true && buyer.getFortune() > getPrice()){ 
			buyer.setFortune(-getPrice());
			setOwner(buyer);
			setQuantityOfField(buyer);}
			else if (buyOption != true){GUI.showMessage("You chose not to buy");
			}
		}

		
	


	public abstract int getRent();
	
	public abstract void setQuantityOfField(Player player);
	

}
