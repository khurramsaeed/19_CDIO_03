package entity;

public class Dice {
	private int facevalue;
	private int sides;

	public Dice() {
		this(6);
	}

	public Dice(int sides) {
		this.sides = sides;
	}

	public int getFaceValue() {
		return facevalue;
	}

	public void roll() {
		this.facevalue = (int) (Math.random() * sides) + 1;
	}

	public int testRollValue(){
		this.facevalue = (int)(Math.random()*sides) +1;
		return facevalue;
	}
}
