package entity;

public class Dice {
	
	// Private int initializing
	private int facevalue;
	private int sides;

	public Dice() {
		this(6);
	}
	/**
	 * Constructor: Dice
	 * @param sides is equlas to global sides
	 */
	public Dice(int sides) {
		this.sides = sides;
	}

	public int getFaceValue() {
		return facevalue;
	}

	public void roll() {
		this.facevalue = (int) (Math.random() * sides) + 1;
	}

	public int RollValue(){
		return facevalue;
	}
}