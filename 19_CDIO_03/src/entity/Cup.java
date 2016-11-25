package entity;

public class Cup {
	// Initializing private Dice objects
	private Dice d1;
	private Dice d2;
	
	public Cup() {

		this.d1 = new Dice();
		this.d2 = new Dice();

	}
	
	public void throwDice() {
		d1.roll();
		d2.roll();

	}
	/**
	 *  Result of dice1
	 * @return dice1 facevalue
	 */
	public int getD1Result() {
		return d1.getFaceValue();

	}
	/**
	 *  Result of dice2
	 * @return dice2 facevalue
	 */
	public int getD2Result() {
		return d2.getFaceValue();

	}
	/**
	 * Sum of two dice
	 * @return sum of dice1 + dice 2
	 */
	public int getSum() {
		return getD1Result() + getD2Result();

	}

}
