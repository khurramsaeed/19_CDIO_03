package boundary;

import desktop_resources.GUI;
import entity.*;


public class GuiBoundary{


	public static String numberOfPlayers() {
		
		return GUI.getUserButtonPressed("Choose number of players", "2", "3", "4", "5", "6");

	}
	
	public static String userInputString(int i){
		return GUI.getUserString("Enter the name of Player " + (i + 1));
	}

	public static void showFortune(int i){
		GUI.showMessage("Your fortune contains "  + i);
	}
	
	public static String playerName(String name){
		return GUI.getUserButtonPressed(name + "'s turn.", "press to use the cup");
	}
	
	public static void winnerMessage(Player player){
		GUI.showMessage("Everyone is bankrupt except you " + player + ", you won the game! :D");
	}
	
	public static String exitGame(Player player){
		return GUI.getUserButtonPressed("GAME OVER, winner:"+ player, "Exit game");
		
	}
	
	//Tax printOuts
	
	public static boolean taxAmountButton(String i){
		return GUI.getUserLeftButtonPressed(
				"You landed on "+ i +", do you want to pay 4000, or 10% of your assets?", "Pay 4000",
				"Pay 10% of assets");
	}
	
	public static String taxFixedAmount(int i){
		return GUI.getUserButtonPressed("You chose to pay the fixed tax amount " + i, "PAY");
	}
	
	public static String taxTenPercent(int i){
		return GUI.getUserButtonPressed("You chose to pay 10% of your assests in tax, you will have to pay "+ i, "PAY");
	}
	
	public static String taxGoldMine(String i, int j){
		return GUI.getUserButtonPressed("You landed on "+ i +" you will have to pay "+ j, "PAY");
		
	}
	
	//Labour Camp
	
	public static String laborCampButton(){
		return GUI.getUserButtonPressed("Throw dice to calculate the rent you have to pay", "throw");
		
	}
	
	//Ownable 
	
	public static void payRent(String i, Player player){
		GUI.showMessage("The field (" + i + ") is owned, you have to pay rent to " + player);
	}
	
	public static void showRent(int i){
		GUI.showMessage("The rent to pay is: " + i);
	}
	
	public static void bankrupt(Player player){
		GUI.showMessage("You dont have enough, your are bankrupt! " + player + " gets the rest of your fortune");
	}
	
	public static void notEnoughMoney(){
		GUI.showMessage("The field is not owned, but you dont have enough to buy, SORRY!");
	}
	public static boolean buyFieldButton(String i, int j){
		return GUI.getUserLeftButtonPressed("This field (" + i + ") is not owned, do you want to buy it for " + j + " coins?",
				"Yes", "No");
	}
	
	public static void notBought(){
		GUI.showMessage("You chose not to buy");
	}
}
