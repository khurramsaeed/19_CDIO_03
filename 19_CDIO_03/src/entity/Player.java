package entity;

import java.util.ArrayList;

import boundary.TUI;

public class Player {
	
	private String playerName;
	private Account account;
	private boolean hasLost;
	private boolean etEllerAndet; //om player vil betale fast beløb eller procent: se felter
	private int quantityOfFleets;
	private int quantityOfLaborCamps;
	private static int fortune;
	private int currentPosition;
	

	 public Player(String playerName) {
		
		this.playerName = playerName;
		account = new Account(30000);
		hasLost = false;
		quantityOfFleets = 0;
		quantityOfLaborCamps = 0;
		currentPosition = 0;
		fortune = this.getAccountBalance();
		
	}
	 
	public int getAccountBalance() {
		return account.getBalance();
	
	}
	
	public boolean setPlayerHasLost(boolean lost) {
		hasLost = lost;
		return lost;
		
	}
		
	public void setFortune(int value){
		fortune = value + fortune;
		
	}
	
	public static int getFortune(int value){
		return fortune;
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
	
	public void addFleet(){
		quantityOfFleets++;
	}
	
	public void movePlayer(int move){
	currentPosition = currentPosition + move;
	
	if(currentPosition >= 22){
		currentPosition = currentPosition - 22;
		
	}
	
}
	
	public static void addPlayer() {
		int bruger = TUI.sc.nextInt();
		ArrayList <Player> playerList = new ArrayList <Player> ();
		
		for (int i = 0; i < bruger; i++){
			System.out.println("\n"+"Type the name of Player "+(i+1));
			playerList.add(new Player(TUI.sc.next()));
			System.out.println("Player " + (i+1)+ " is ready");
			System.out.println("Your fortune contains "+ getFortune(i));
			
		}
		
	}
	
	
	}
