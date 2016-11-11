package entity;

public class Field {
	
	public Field(){
		
	}
	public void landOnField(Player player){
		
	}
	
	//Define variables:
		private int rent;
		private String Details;
		private String Name;
		private Ownable type;
		
		//Field constructor is created with and integer and two strings
		public Field(int rent, String Name, String Details, Ownable type) {
			this.rent = rent;
			this.Name = Name;
			this.Details = Details;
			this.type = type;
		}
	
}
