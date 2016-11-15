package entity;

import boundary.TUI;

public abstract class Ownable extends Field {

	
	protected int price;
	protected Player owner;
	protected boolean isOwned;
	protected boolean buyField;
	
	public Ownable(String name, int price){
		super(name);
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void buyField(Player player){
		player = owner;
		owner.setFortune(-price);
		isOwned = true;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public abstract int getRent();
	
	@Override
	//A Method for what happens when u land of a field
	public void landOnField(Player player) {
		
		if(isOwned == true){
			player.setFortune(-getRent());
			if(owner.setPlayerHasLost(true)){
				owner.setFortune(getRent());
			}
			 // if free ask if u want to buy and buy
			else if(TUI.sc.nextInt() == 1){
				
				buyField(player);
				buyField = false;
				
			}
			// player dont want to do antything that turn
			else if(TUI.sc.nextInt() == 2){
				return;
			}
		}
		
	}
	
	
}

