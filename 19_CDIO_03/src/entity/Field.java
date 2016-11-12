package entity;

public abstract class Field {
	
	public Field(){
		
	}
	
	protected String name;
	
	public Field(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(){
		this.name = name;
	}
	
	public abstract void landOnField(Player player);
	
	public abstract int getRent();
	
	public boolean isOwned(){
		return false;
	}
	
}
