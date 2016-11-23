package entity;

import java.util.ArrayList;


public class Player {

	private String playerName;
	private Account account;
//	private boolean hasLost; bruges ikke
	private int quantityOfFleets;
	private int quantityOfLaborCamps;
	private int quantityOfTerritories;
	private int fortune;
	private int currentPosition = 0;

	public Player(String playerName) {

		this.playerName = playerName;
		account = new Account(30000);
//		hasLost = false; bruges ikke
		quantityOfFleets = 0;
		quantityOfLaborCamps = 0;
		quantityOfTerritories = 0;
		fortune = this.getAccountBalance();

	}

	public String getPlayerName() {
		return playerName;
	}

	// public String toString() {
	// return playerName;
	// }

	public int getAccountBalance() {
		return account.getBalance();

	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", account=" + account + /*", hasLost=" + hasLost: bruges ikke
				+*/ ", quantityOfFleets=" + quantityOfFleets + ", quantityOfLaborCamps=" + quantityOfLaborCamps
				+ ", quantityOfTerritories=" + quantityOfTerritories + ", fortune=" + fortune + ", currentPosition="
				+ currentPosition + "]";
	}

//	public boolean setPlayerHasLost(boolean lost) { bruges ikke
//		hasLost = lost;
//		return lost;
//
//	}

	public void setFortune(int value) {
		fortune = fortune + value;

	}

	public int getFortune() {
		return fortune;
	}

	public int getQuantityOfFleets() {
		return quantityOfFleets;

	}

	public int getQuantityOfTerritories() {
		return quantityOfTerritories;

	}

	public int getQuantityOfLaborCamps() {
		return quantityOfLaborCamps;

	}

	public void setQuantityOfFleets() {
		quantityOfFleets++;

	}

	public void setQuantityOfTerritories() {
		quantityOfTerritories++;

	}

	public void setQuantityOfLaborCamps() {
		quantityOfLaborCamps++;

	}

	public int movePlayer(int move) {
		this.currentPosition = currentPosition + move;

		if (currentPosition > 21) {
			currentPosition = currentPosition - 21;

		}

		return currentPosition;

	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public boolean isBankrupt() {
		if (this.fortune <= 0)
			return true;
		else
			return false;
	}
}
