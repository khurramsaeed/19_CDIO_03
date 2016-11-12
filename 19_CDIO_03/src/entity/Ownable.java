package entity;

import boundaries.TUI;

public class Ownable extends Field {

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

	public int getRent(){
		return rent;
	}
	
	public void setPrice(){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}

	protected void buyField(Player player){
		owner = player;
		owner.addBalance(-price);
		isOwned = true;
	}
	
	public Player getOwner() {
		return owner;
	}
	

	@Override
	public void landOnField(Player player) {
		
		if(isOwned == true){
			player.addFortune(-getRent());
			if(owner.lost != true){
				owner.addFortune(getRent());
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

