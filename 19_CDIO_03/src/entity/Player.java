package entity;

import java.util.ArrayList;

import boundary.TUI;

public class Player {

	private String playerName;
	private Account account;
	private boolean hasLost;
	private boolean etEllerAndet; // om player vil betale fast beløb eller
									// procent: se felter
	private int quantityOfFleets;
	private int quantityOfLaborCamps;
	private int fortune;
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

	public String getPlayerName() {
		return playerName;
	}

	public String toString() {
		return playerName;
	}

	public int getAccountBalance() {
		return account.getBalance();

	}

	public boolean setPlayerHasLost(boolean lost) {
		hasLost = lost;
		return lost;

	}

	public void setFortune(int value) {
		fortune = value + fortune;

	}

	public int getFortune() {
		return fortune;
	}

	public int getQuantityOfFleets() {
		return quantityOfFleets;

	}

	public int getQuantityOfLaborCamps() {
		return quantityOfLaborCamps;

	}

	public void addFleet() {
		quantityOfFleets++;
	}

	public void movePlayer(int move) {
		currentPosition = currentPosition + move;

		if (currentPosition >= 22) {
			currentPosition = currentPosition - 22;

		}

	}

}
