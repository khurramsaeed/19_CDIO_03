package entity;

public class Cup {

	Dice d1 = new Dice();
	Dice d2 = new Dice();

	public Cup() {
		d1.roll();
		d2.roll();
	}

	public int getDiceOneResult() {
		return d1.getFaceValue();

	}

	public int getDiceTwoResult() {
		return d2.getFaceValue();

	}

	public int getSum() {

		return getDiceOneResult() + getDiceTwoResult();

	}

}
