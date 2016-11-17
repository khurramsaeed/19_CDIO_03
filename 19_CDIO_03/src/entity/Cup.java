package entity;

public class Cup {

	Dice d1 = new Dice();
	Dice d2 = new Dice();

	public Cup() {
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
