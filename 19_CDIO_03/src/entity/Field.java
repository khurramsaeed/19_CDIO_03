package entity;

public abstract class Field {
	
	public Field(){
		
	}
	
	protected String name;
	// A method to save name from field
	public Field(String name){
		this.name = name;
	}
	// A method to get name
	public String getName(){
		return name;
	}
	// A method to change name value to something else
	public void setName(){
		this.name = name;
	}
	
	public abstract void landOnField(Player player);
	
//	public abstract int getRent();
//	
//	public boolean isOwned(){
//		return false;
//	}

}
  