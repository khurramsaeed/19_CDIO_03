package entity;

public class Cup {

	Dice t1 = new Dice();
	Dice t2 = new Dice();

	public Cup() {
		t1.roll();
		t2.roll();
	}

	
	public int diceResult1(){
		int x = t1.getFaceValue();
		
		return x;
		
	}
	
	public int diceResult2(){
		int y = t2.getFaceValue();
		
		return y;
	}
	public int getSum() {

		return diceResult1() + diceResult2();

	}
	
}
