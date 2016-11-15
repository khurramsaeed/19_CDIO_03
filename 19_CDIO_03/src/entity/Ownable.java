package entity;

import entity.Player;

public abstract class Ownable extends Field {

	protected int price;
	protected Player owner;

	public Ownable(String name, int price) {
		super(name);
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

	public void buyField(Player buyer) {
		if (buyer.getFortune() >= price) {
			buyer.setFortune(getPrice());
			setOwner(buyer);
		}
	}

	public abstract int getRent();

	@Override
	public void landOnField(Player player) {
	}

}

// A Method for what happens when u land of a field
// public void landOnField(Player player) {
//
// if(isOwned == true){
// player.setFortune(-getRent());
// if(owner.setPlayerHasLost(true)){
// owner.setFortune(getRent());
// }
// // if free ask if u want to buy and buy
// else if(TUI.sc.nextInt() == 1){
//
// buyField(player);
// buyField = false;
//
// }
// // player dont want to do antything that turn
// else if(TUI.sc.nextInt() == 2){
// return;
// }
// }
//
// }
