package boundary;

import desktop_resources.GUI;
import entity.*;


public class GuiBoundary{

	/**
	 * 
	 * @return GUI.getUserButtonPressed lets user choose number of players
	 */
	public static String numberOfPlayers() {
		
		return GUI.getUserButtonPressed("Choose number of players", "2", "3", "4", "5", "6");

	}
	/**
	 * 
	 * @param i
	 * @return GUI.getUserString lets user enter names
	 */
	public static String userInputString(int i){
		return GUI.getUserString("Enter the name of Player " + (i + 1));
	}

	/**
	 * 
	 * @param i
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
	 * @param player
	 */
	public static void winnerMessage(Player player){
		GUI.showMessage("Everyone is bankrupt except you " + player + ", you won the game! :D");
	}
	/**
	 * 
	 * @param player
	 * @return GUI.getUserButtonPressed display winnerMessage
	 */
	public static String exitGame(Player player){
		return GUI.getUserButtonPressed("GAME OVER, winner:"+ player, "Exit game");
		
	}
	
	//Tax printOuts
	/**
	 * 
	 * @param i
	 * @return GUI.getUserLeftButtonPressed user message
	 */
	public static boolean taxAmountButton(String i){
		return GUI.getUserLeftButtonPressed(
				"You landed on "+ i +", do you want to pay 4000, or 10% of your assets?", "Pay 4000",
				"Pay 10% of assets");
	}
	/**
	 * 
	 * @param i
	 * @return GUI.getUserButtonPressed pay tax message
	 */
	public static String taxFixedAmount(int i){
		return GUI.getUserButtonPressed("You chose to pay the fixed tax amount " + i, "PAY");
	}
	/**
	 * 
	 * @param i
	 * @return GUI.getUserButtonPressed pay tax message 2
	 */
	public static String taxTenPercent(int i){
		return GUI.getUserButtonPressed("You chose to pay 10% of your assests in tax, you will have to pay "+ i, "PAY");
	}
	/**
	 * 
	 * @param i
	 * @param j
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
	 * @param i
	 * @param player
	 */
	public static void payRent(String i, Player player){
		GUI.showMessage("The field (" + i + ") is owned, you have to pay rent to " + player);
	}
	/**
	 * 
	 * @param i
	 */
	public static void showRent(int i){
		GUI.showMessage("The rent to pay is: " + i);
	}
	/**
	 * 
	 * @param player
	 */
	public static void bankrupt(Player player){
		GUI.showMessage("You dont have enough, your are bankrupt! " + player + " gets the rest of your fortune");
	}
	
	public static void notEnoughMoney(){
		GUI.showMessage("The field is not owned, but you dont have enough to buy, SORRY!");
	}
	/**
	 * 
	 * @param i
	 * @param j
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
