package entity;

public class Player {
	
	private String playerName;
	private Account account;
	private boolean hasLost;
	private boolean etEllerAndet; //om player vil betale fast beløb eller procent: se felter
	private int quantityOfFleets;
	private int quantityOfLaborCamps;
	private int fortune;


	 public Player(String playerName) {
		
		account = new Account(30000);
		hasLost = false;
		quantityOfFleets = 0;
		quantityOfLaborCamps = 0;
		fortune = this.getAccountBalance();
		
	}
	 
	public int getAccountBalance() {
		return account.getBalance();
	
	}
	 
	public void setPlayerHasLost(boolean lost) {
		
		hasLost = lost;
		
	}
	
	public void addFortune(int value){
		
		fortune = value + fortune;
		
	}
	

	public int getQuantityOfFleets() {
		return quantityOfFleets;
		
	}
	
	public int getQuantityOfLaborCamps(){
		return quantityOfLaborCamps;
		
		
	}
	
	public String toString(){
		return playerName;
	}
}