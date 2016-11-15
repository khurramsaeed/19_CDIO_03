package entity;

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

	public void landOnField(Player player) {
		if (player.getPlayerName() != owner.getPlayerName()) {
			player.setFortune(-getRent());
			owner.setFortune(getRent());
		}
	}

	public void buyField(Player buyer) {
		if (buyer.getFortune() >= price) {
			buyer.setFortune(getPrice());
			setOwner(buyer);
		}
	}

	public abstract int getRent();

}
