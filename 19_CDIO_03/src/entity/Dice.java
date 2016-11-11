package entity;

public class Dice {
	private int facevalue;
	private int sides;

	public Dice(){ //Constructor, defines dice size, set to 6 & can be modified to 12
		this(6);
	}
	public Dice(int sides) { //Method Dice with parameter sides, sets global sides = local sides
		this.sides = sides;
	}

	public int getFacevalue() { //Returns the facevalue of the dice
		return facevalue;
	}
	
	public void roll(){ //roll() function with math Random 
		this.facevalue = (int)(Math.random()*sides) +1;
	}

}