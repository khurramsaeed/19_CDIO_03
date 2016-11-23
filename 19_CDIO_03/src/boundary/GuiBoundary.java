package boundary;

import desktop_fields.Field;
import desktop_resources.GUI;
import controller.GameController;
import entity.*;

import java.util.Scanner;

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
	
	public String exitGame(Player player){
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
	
}
