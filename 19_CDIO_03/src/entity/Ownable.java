package entity;

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
		return 0;
	}
	
	public void setPrice(){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}

	public void buyField(Player player){
		owner = player;
		owner.addBalance(-price);
		isOwned = true;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}
	
	
}

