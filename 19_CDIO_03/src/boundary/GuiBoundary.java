package boundary;

import desktop_resources.GUI;
import entity.*;
import java.awt.Color;
import entity.Field;
import entity.Fleet;
import entity.LaborCamp;
import entity.Refuge;
import entity.Tax;
import entity.Territory;

public class GuiBoundary{

	/**
	 * Create fields
	 * @param fields array refers to original class Field
	 */
	public void GUIField(Field[] fields) {

		desktop_fields.Field[] desktopFields = new desktop_fields.Field[21];

		desktopFields[0] = new desktop_fields.Street.Builder()
				.setTitle(fields[1].getFieldName())
				.setSubText("Price: " + ((Territory) fields[1]).getPrice())
				.setRent("Rent: " + ((Territory) fields[1]).getRent()).setBgColor(Color.green).build();

		desktopFields[1] = new desktop_fields.Street.Builder()
				.setTitle(fields[2].getFieldName())
				.setSubText("Price: " + ((Territory) fields[2]).getPrice())
				.setRent("Rent: " + ((Territory) fields[2]).getRent()).setBgColor(Color.blue).build();

		desktopFields[2] = new desktop_fields.Street.Builder()
				.setTitle(fields[3].getFieldName())
				.setSubText("Price: " + ((Territory) fields[3]).getPrice())
				.setRent("Rent: " + ((Territory) fields[3]).getRent()).setBgColor(Color.red).build();

		desktopFields[3] = new desktop_fields.Street.Builder()
				.setTitle(fields[4].getFieldName())
				.setSubText("Price: " + ((Territory) fields[4]).getPrice())
				.setRent("Rent: " + ((Territory) fields[4]).getRent()).setBgColor(Color.orange).build();

		desktopFields[4] = new desktop_fields.Street.Builder()
				.setTitle(fields[5].getFieldName())
				.setSubText("Price: " + ((Territory) fields[5]).getPrice())
				.setRent("Rent: " + ((Territory) fields[5]).getRent()).setBgColor(Color.yellow).build();

		desktopFields[5] = new desktop_fields.Street.Builder()
				.setTitle(fields[6].getFieldName())
				.setSubText("Price: " + ((Territory) fields[6]).getPrice())
				.setRent("Rent: " + ((Territory) fields[6]).getRent()).setBgColor(Color.lightGray).build();

		desktopFields[6] = new desktop_fields.Street.Builder()
				.setTitle(fields[7].getFieldName())
				.setSubText("Price: " + ((Territory) fields[7]).getPrice())
				.setRent("Rent: " + ((Territory) fields[7]).getRent()).setBgColor(Color.pink).build();

		desktopFields[7] = new desktop_fields.Street.Builder()
				.setTitle(fields[8].getFieldName())
				.setSubText("Price: " + ((Territory) fields[8]).getPrice())
				.setRent("Rent: " + ((Territory) fields[8]).getRent()).setBgColor(Color.magenta).build();

		desktopFields[8] = new desktop_fields.Street.Builder()
				.setTitle(fields[9].getFieldName())
				.setSubText("Price: " + ((Territory) fields[9]).getPrice())
				.setRent("Rent: " + ((Territory) fields[9]).getRent()).setBgColor(Color.cyan).build();

		desktopFields[9] = new desktop_fields.Street.Builder()
				.setTitle(fields[10].getFieldName())
				.setSubText("Price: " + ((Territory) fields[10]).getPrice())
				.setRent("Rent: " + ((Territory) fields[10]).getRent()).setBgColor(Color.darkGray)
				.setFgColor(Color.white).build();

		desktopFields[10] = new desktop_fields.Street.Builder()
				.setTitle(fields[11].getFieldName())
				.setSubText("Price: " + ((Territory) fields[11]).getPrice())
				.setRent("Rent: " + ((Territory) fields[11]).getRent()).setBgColor(Color.RED).build();

		// Refuge

		desktopFields[11] = new desktop_fields.Refuge.Builder()
				.setTitle(fields[12].getFieldName())
				.setSubText("Reward: " + ((Refuge) fields[12]).getBonus()).setBgColor(Color.white)
				.setPicture("images/wcity.png").build();

		desktopFields[12] = new desktop_fields.Refuge.Builder()
				.setTitle(fields[13].getFieldName())
				.setSubText("Reward: " + ((Refuge) fields[13]).getBonus()).setBgColor(Color.BLUE)
				.setFgColor(Color.white).setPicture("images/monastery.png").build();

		// Labor Camp

		desktopFields[13] = new desktop_fields.Street.Builder()
				.setTitle(fields[14].getFieldName())
				.setSubText("Price: " + ((LaborCamp) fields[14]).getPrice())
				.setBgColor(Color.cyan).build();

		desktopFields[14] = new desktop_fields.Street.Builder()
				.setTitle(fields[15].getFieldName())
				.setSubText("Price: " + ((LaborCamp) fields[15]).getPrice())
				.setBgColor(Color.orange).build();

		// Tax
		desktopFields[15] = new desktop_fields.Tax.Builder()
				.setDescription(fields[16].getFieldName())
				.setSubText("Tax: " + ((Tax) fields[16]).getTaxAmount()).setBgColor(Color.red).build();

		desktopFields[16] = new desktop_fields.Tax.Builder()
				.setDescription(fields[17].getFieldName())
				.setSubText("Tax: " + ((Tax) fields[17]).getTaxAmount() + " or 10% of your assets.")
				.setBgColor(Color.yellow).build();

		// Fleets
		desktopFields[17] = new desktop_fields.Street.Builder()
				.setTitle(fields[18].getFieldName())
				.setSubText("Price: " + ((Fleet) fields[18]).getPrice())
				.setBgColor(Color.PINK).build();

		desktopFields[18] = new desktop_fields.Street.Builder()
				.setTitle(fields[19].getFieldName()).setDescription("")
				.setSubText("Price: " + ((Fleet) fields[19]).getPrice())
				.setBgColor(Color.green).build();

		desktopFields[19] = new desktop_fields.Street.Builder()
				.setTitle(fields[20].getFieldName())
				.setSubText("Price: " + ((Fleet) fields[20]).getPrice())
				.setBgColor(Color.red).build();

		desktopFields[20] = new desktop_fields.Street.Builder()
				.setTitle(fields[21].getFieldName())
				.setSubText("Price: " + ((Fleet) fields[21]).getPrice())
				.setBgColor(Color.magenta).build();

		GUI.create(desktopFields);
		GUI.showMessage("Welcome to this game!");

	}

	public Color chooseColor(int NumberOfPlayers) {
		switch (NumberOfPlayers) {
		case 0:
			return Color.BLACK;
		case 1:
			return Color.CYAN;
		case 2:
			return Color.RED;
		case 3:
			return Color.GREEN;
		case 4:
			return Color.YELLOW;
		case 5:
			return Color.ORANGE;
		default:
			return Color.pink;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @return GUI.getUserButtonPressed lets user choose number of players
	 */
	public static String numberOfPlayers() {
		
		return GUI.getUserButtonPressed("Choose number of players", "2", "3", "4", "5", "6");

	}
	/**
	 * 
	 * @param i int
	 * @return GUI.getUserString lets user enter names
	 */
	public static String userInputString(int i){
		return GUI.getUserString("Enter the name of Player " + (i + 1));
	}

	/**
	 * 
	 * @param i int
	 */
	public static void showFortune(int i){
		GUI.showMessage("Your fortune contains "  + i);
	}
	/**
	 * 
	 * @param name : String
	 * @return name + GUIMessage(String)
	 */
	public static String playerName(String name){
		return GUI.getUserButtonPressed(name + "'s turn.", "press to use the cup");
	}
	/**
	 * 
	 * @param player is object of Player
	 */
	public static void winnerMessage(Player player){
		GUI.showMessage("Everyone is bankrupt except you " + player + ", you won the game! :D");
	}
	/**
	 * 
	 * @param player is object of Player
	 * @return GUI.getUserButtonPressed display winnerMessage
	 */
	public static String exitGame(Player player){
		return GUI.getUserButtonPressed("GAME OVER, winner:"+ player, "Exit game");
		
	}
	
	//Tax printOuts
	/**
	 * 
	 * @param i String
	 * @return GUI.getUserLeftButtonPressed user message
	 */
	public static boolean taxAmountButton(String i){
		return GUI.getUserLeftButtonPressed(
				"You landed on "+ i +", do you want to pay 4000, or 10% of your assets?", "Pay 4000",
				"Pay 10% of assets");
	}
	/**
	 * 
	 * @param i int
	 * @return GUI.getUserButtonPressed pay tax message
	 */
	public static String taxFixedAmount(int i){
		return GUI.getUserButtonPressed("You chose to pay the fixed tax amount " + i, "PAY");
	}
	/**
	 * 
	 * @param i int
	 * @return GUI.getUserButtonPressed pay tax message 2
	 */
	public static String taxTenPercent(int i){
		return GUI.getUserButtonPressed("You chose to pay 10% of your assests in tax, you will have to pay "+ i, "PAY");
	}
	/**
	 * 
	 * @param i String
	 * @param j int
	 * @return GUI.getUserButtonPressed user message
	 */
	public static String taxGoldMine(String i, int j){
		return GUI.getUserButtonPressed("You landed on "+ i +" you will have to pay "+ j, "PAY");
		
	}
	
	//Labour Camp
	/**
	 * 
	 * @return GUI.getUserButtonPressed user message
	 */
	public static String laborCampButton(){
		return GUI.getUserButtonPressed("Throw dice to calculate the rent you have to pay", "throw");
		
	}
	
	//Ownable 
	/**
	 * 
	 * @param i String
	 * @param player is object of class Player
	 */
	public static void payRent(String i, Player player){
		GUI.showMessage("The field (" + i + ") is owned, you have to pay rent to " + player);
	}
	/**
	 * 
	 * @param i int
	 */
	public static void showRent(int i){
		GUI.showMessage("The rent to pay is: " + i);
	}
	/**
	 * 
	 * @param player is object of class Player
	 */
	public static void bankrupt(Player player){
		GUI.showMessage("You dont have enough, your are bankrupt! " + player + " gets the rest of your fortune");
	}
	
	public static void notEnoughMoney(){
		GUI.showMessage("The field is not owned, but you dont have enough to buy, SORRY!");
	}
	/**
	 * 
	 * @param i String
	 * @param j int
	 * @return GUI.getUserLeftButtonPressed user message
	 */
	public static boolean buyFieldButton(String i, int j){
		return GUI.getUserLeftButtonPressed("This field (" + i + ") is not owned, do you want to buy it for " + j + " coins?",
				"Yes", "No");
	}
	
	public static void notBought(){
		GUI.showMessage("You chose not to buy");
	}
}
