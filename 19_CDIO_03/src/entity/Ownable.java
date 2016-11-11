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
	
	public int getRent(){
		return 0;
	}

	public void buyField(Player player){
		owner = player;
		owner.addBalance;
		isOwned = true;
	}
	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}
	
	
}

