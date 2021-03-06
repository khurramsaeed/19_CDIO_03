package entity;

public class GameBoard {

	/*
	 * Private fields array refers to original class Field
	 * Allocates 22 elements of Field objects in the array
	 */
	private Field[] fields = new Field[22];

	public GameBoard() {

		fields[1] = new Territory("Tribe Encampment", 1000, 100);
		fields[2] = new Territory("Crater", 1500, 300);
		fields[3] = new Territory("Mountain", 2000, 500);
		fields[4] = new Territory("Cold Desert", 3000, 700);
		fields[5] = new Territory("Black cave", 4000, 1000);
		fields[6] = new Territory("The Werewall", 4300, 1300);
		fields[7] = new Territory("Mountain village", 4750, 1600);
		fields[8] = new Territory("South Citadel", 5000, 2000);
		fields[9] = new Territory("Palace Gates", 5500, 2600);
		fields[10] = new Territory("Tower", 6000, 3200);
		fields[11] = new Territory("Castle", 8000, 4000);
		fields[12] = new Refuge("Walled City", 5000);
		fields[13] = new Refuge("Monastary", 500);
		fields[14] = new LaborCamp("Huts in the mountain", 2500);
		fields[15] = new LaborCamp("The pit", 2500);
		fields[16] = new Tax("Goldmine", 2000);
		fields[17] = new Tax("Caravan", 4000);
		fields[18] = new Fleet("Second Sail", 4000);
		fields[19] = new Fleet("Sea Grover", 4000);
		fields[20] = new Fleet("The Buccaneers", 4000);
		fields[21] = new Fleet("Privateer armade", 4000);

	}

	/**
	 * Field Array
	 * @return fields
	 */
	public Field[] getFields() {
		return fields;
	}

	/**
	 * landOnField method
	 * @param player to get players currentPosition
	 */
	public void landOnField(Player player) {
		fields[player.getCurrentPosition()].landOnField(player);
	}

}