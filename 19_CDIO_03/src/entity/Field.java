package entity;

public abstract class Field {
	
	protected String name;
	
	public Field(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return name;
	}
	
	public abstract void landOnField(Player player);
	}
  