package entity;

import desktop_resources.GUI;
import entity.Player;

public abstract class Ownable extends Field {

	protected int price;
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
		newOwner = owner;

	}

	public boolean checkIfOwned() {
		if (owner == null) {
			return false;
		} else { 
			return true;
		}

	}

	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		if(checkIfOwned() == true && player.getPlayerName() != owner.getPlayerName()){
			GUI.showMessage("The field is owned, you have to pay rent to " + getOwner());
			player.setFortune(-getRent());
			owner.setFortune(getRent());
		}

		else if (checkIfOwned() == false) {
			buyFieldOption(player);

		} 
		
	}

	

	public void buyFieldOption(Player buyer) {
		boolean buyOption = GUI.getUserLeftButtonPressed("This field is not owned, do you want to buy it?", "Yes", "No");
		if(buyOption == true && buyer.getFortune() > price){ 
			buyer.setFortune(-getPrice());
			setOwner(buyer);
			setQuantityOfField(buyer);
		if(buyOption == false){
			GUI.showMessage("You chose not to buy");
		}

		}
	}


	public abstract int getRent();
	
	public abstract void setQuantityOfField(Player player);
	

}
