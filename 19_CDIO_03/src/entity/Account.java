package entity;

public class Account {

	private int Balance;

	/**
	 * 
	 * @param balance integer = global Balance
	 */
	public Account(int balance) {
		this.Balance = balance;
	}

	/**
	 * 
	 * @return Balance
	 */
	public int getBalance() {
		return Balance;
	}

}
