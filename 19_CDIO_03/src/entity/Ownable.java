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
	
	public Ownable() {
		super();
	}

	//A method to change price
	public void setPrice(int price){
		this.price = price;
	}
	//A method to get price
	public int getPrice(){
		return price;
	}
	// A method to buy a field
	protected void buyField(Player player){
		owner = player;
		owner.setFortune(-price);
		isOwned = true;
	}
	
	//A method to check who owns a field if owned
	public Player getOwner() {
		return owner;
	}
	
	public abstract int getRent();
	
	@Override
	//A Method for what happens when u land of a field
	public void landOnField(Player player) {
		//Check if owned if yes than get the rent price and pay
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

