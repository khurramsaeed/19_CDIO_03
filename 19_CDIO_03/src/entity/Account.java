package entity;

public class Account {
	
	private int Balance; 
	
	// Creates the constructor for Account	
	public Account(int balance){ 
			this.Balance = balance;
	}
	// A method to get the Balance from a player
	public int getBalance(){
		return Balance;
	}

}
 