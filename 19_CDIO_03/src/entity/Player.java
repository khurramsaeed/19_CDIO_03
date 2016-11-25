package entity;

public class Player {
	// Initializing objects
	private String playerName;
	private Account account;
	// Intializing private int's
	private int quantityOfFleets;
	private int quantityOfLaborCamps;
	private int quantityOfTerritories;
	private int fortune;
	private int currentPosition = 0;

	/**
	 * 
	 * @param playerName is an object
	 * 
	 */
	public Player(String playerName) {

		this.playerName = playerName;
		account = new Account(30000);
		quantityOfFleets = 0;
		quantityOfLaborCamps = 0;
		quantityOfTerritories = 0;
		fortune = this.getAccountBalance();

	}
	/**
	 * Public String getPlayernName method
	 * @return playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	// public String toString() {
	// return playerName;
	// }
	/**
	 * public int getAccountBalance method
	 * @return account.getBalance()
	 */
	public int getAccountBalance() {
		return account.getBalance();

	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", account=" + account + ", quantityOfFleets=" + quantityOfFleets + ", quantityOfLaborCamps=" + quantityOfLaborCamps
				+ ", quantityOfTerritories=" + quantityOfTerritories + ", fortune=" + fortune + ", currentPosition="
				+ currentPosition + "]";
	}
	/**
	 * void setFortune method
	 * @param value int
	 */
	public void setFortune(int value) {
		fortune = fortune + value;

	}
	/**
	 * public int getFortune method
	 * @return fortune
	 */
	public int getFortune() {
		return fortune;
	}
	/**
	 * public int getQuantityOfFleets method
	 * @return quantityOfFleets
	 */
	public int getQuantityOfFleets() {
		return quantityOfFleets;

	}
	/**
	 * public int quantityOfTerritories method
	 * @return quantityOfTerritories
	 */
	public int getQuantityOfTerritories() {
		return quantityOfTerritories;

	}
	/**
	 * public int getQuantityOfLaborCamps method
	 * @return quantityOfLaborCamps
	 */
	public int getQuantityOfLaborCamps() {
		return quantityOfLaborCamps;

	}
	/**
	 * public void method setQuantityOfFleets
	 */
	public void setQuantityOfFleets() {
		quantityOfFleets++;

	}
	/**
	 * public void method setQuantityOfTerritories
	 */
	public void setQuantityOfTerritories() {
		quantityOfTerritories++;

	}
	/**
	 * public void method setQuantityOfLaborCamps
	 */
	public void setQuantityOfLaborCamps() {
		quantityOfLaborCamps++;

	}
	/**
	 * public int movePlayer method
	 * @param move int
	 * @return currentPosition
	 */
	public int movePlayer(int move) {
		this.currentPosition = currentPosition + move;

		if (currentPosition > 21) {
			currentPosition = currentPosition - 21;

		}

		return currentPosition;

	}
	/**
	 * public int getCurrentPosition method
	 * @return currentPosition
	 */
	public int getCurrentPosition() {
		return currentPosition;
	}
	/**
	 * public boolean isBankrupt method
	 * @return true or false
	 */
	public boolean isBankrupt() {
		if (this.fortune <= 0)
			return true;
		else
			return false;
	}
}
