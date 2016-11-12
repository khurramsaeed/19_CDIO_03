package entity;

public class Cup {
	
	//Create object
	//Change dice type, Dice(x)
	Dice t1 = new Dice();
	Dice t2 = new Dice();

	public Cup() { //Constructor
		t1.roll();
		t2.roll();
	}

	public int sum() { //Method sum, returns x+y = sum

		int x = t1.getFacevalue();
		int y = t2.getFacevalue();
		
		return x + y;

	}
}
 