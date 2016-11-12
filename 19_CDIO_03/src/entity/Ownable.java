package entity;

import boundaries.TUI;

public abstract class Ownable extends Field {

	protected boolean isOwned = false;
	protected boolean buyField;
	protected int price;
	protected Player owner;
	
	public Ownable(String name, int price){
		super(name);
		this.price = price;
	}
		
	public void setPrice(){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}

	protected void buyField(Player player){
		owner = player;
		owner.setFortune(-price);
		isOwned = true;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public abstract int getRent();
	
	@Override
	public void landOnField(Player player) {
		
		if(isOwned == true){
			player.setFortune(-getRent());
			if(owner.setPlayerHasLost(true)){
				owner.setFortune(getRent());
			}
			 
			else if(TUI.sc.nextInt() == 1){
				
				buyField(player);
				buyField = false;
				
			}
			
			else if(TUI.sc.nextInt() == 2){
				return;
			}
		}
		
	}
	
	
}

