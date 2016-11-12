package entity;

public class GameBoard {
	
	Field[] field = new Field[22]; 
	
	public GameBoard() {
				
	field[1] = new Territory("Tribe Encampment", 100, 1000);
	field[2] = new Territory("Crater", 300, 1500);
	field[3] = new Territory("Mountain", 500, 2000);
	field[4] = new Territory("Cold Desert", 700, 3000);
	field[5] = new Territory("Black cave", 1000, 4000);
	field[6] = new Territory("The Werewall", 1300, 4300);
	field[7] = new Territory("Mountain village", 1600, 4750);
	field[8] = new Territory("South Citadel", 2000, 5000);
	field[9] = new Territory("Palace Gates", 2600, 5500);
	field[10] = new Territory("Tower", 3200, 6000);
	field[11] = new Territory("Castle", 4000, 8000);
	field[12] = new Refuge("Walled City", 5000);
	field[13] = new Refuge("Monastary", 500);
	field[14] = new LaborCamp("Huts in the mountain", 2500);
	field[15] = new LaborCamp("The pit", 2500);
	field[16] = new Tax("Goldmine", 2000);
	field[17] = new Tax("Caravan", 4000);
	field[19] = new Fleet("Second Sail", 500, 4000);
	field[19] = new Fleet("Sea Grover", 500, 4000);
	field[20] = new Fleet("The Buccaneers", 500, 4000);
	field[21] = new Fleet("Privateer armade", 500, 4000);

	}
	
	public int getFieldArrayLength(){
		return field.length;
	}
} 