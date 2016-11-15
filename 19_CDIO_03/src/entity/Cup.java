package entity;

public class Cup {

	Dice t1 = new Dice();
	Dice t2 = new Dice();

	public Cup() {
		t1.roll();
		t2.roll();
	}

	public int sum() {

		int x = t1.getFaceValue();
		int y = t2.getFaceValue();

		return x + y;

	}
}
