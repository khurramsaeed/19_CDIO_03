package entity;

public class Player {
	
	private Account account;
	private String playerNumber;
	private boolean lost;
	private int quantityOfFleets;
	private int quantityOfLaborCamps;
	private int money;


	 public Player() {
		
		account = new Account(30000);
		lost = false;
		quantityOfFleets = 0;
		quantityOfLaborCamps = 0;
		
	}


	public int getMoney() {
		return money;
	}
	
	public int getAccountBalance() {
		money = account.getAccountBalance();
				return money;
	}



}