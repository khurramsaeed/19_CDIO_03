package entity;

public class GameBoard {

	private Field[] fields = new Field[22];

	public GameBoard() {

		fields[1] = new Territory("Tribe Encampment", 100, 1000);
		fields[2] = new Territory("Crater", 300, 1500);
		fields[3] = new Territory("Mountain", 500, 2000);
		fields[4] = new Territory("Cold Desert", 700, 3000);
		fields[5] = new Territory("Black cave", 1000, 4000);
		fields[6] = new Territory("The Werewall", 1300, 4300);
		fields[7] = new Territory("Mountain village", 1600, 4750);
		fields[8] = new Territory("South Citadel", 2000, 5000);
		fields[9] = new Territory("Palace Gates", 2600, 5500);
		fields[10] = new Territory("Tower", 3200, 6000);
		fields[11] = new Territory("Castle", 4000, 8000);
		fields[12] = new Refuge("Walled City", 5000);
		fields[13] = new Refuge("Monastary", 500);
		fields[14] = new LaborCamp("Huts in the mountain", 2500, 100);
		fields[15] = new LaborCamp("The pit", 2500, 100);
		fields[16] = new Tax("Goldmine", 2000);
		fields[17] = new Tax("Caravan", 4000);
		fields[19] = new Fleet("Second Sail", 500, 4000);
		fields[19] = new Fleet("Sea Grover", 500, 4000);
		fields[20] = new Fleet("The Buccaneers", 500, 4000);
		fields[21] = new Fleet("Privateer armade", 500, 4000);
 
	}

	public int getFieldArrayLength() {
		return fields.length;
	}

	public Field[] getFields() {
		return fields;
	}

}