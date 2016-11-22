package entity;

public class Cup {

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

	public int getD1Result() {
		return d1.getFaceValue();

	}

	public int getD2Result() {
		return d2.getFaceValue();

	}

	public int getSum() {

		return getD1Result() + getD2Result();

	}

}
