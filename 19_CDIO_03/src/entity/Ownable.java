package entity;

import boundaries.TUI;

public abstract class Ownable extends Field {

	protected boolean isOwned = false;
	protected boolean buyField;
	private int price;
	private Player owner;
	
	public Ownable(String name, int price){
		super(name);
		this.price = price;
	}
	
	public Ownable() {
		super();
	}

	
	public void setPrice(){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}

	protected void buyField(Player player){
		owner = player;
		owner.getFortune(-price);
		isOwned = true;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public abstract int getRent();
	
	@Override
	public void landOnField(Player player) {
		
		if(isOwned == true){
			player.getFortune(-getRent());
			if(owner.hasLost != true){
				owner.getFortune(getRent());
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

