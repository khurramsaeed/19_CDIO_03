package controller;

import java.util.Arrays;
import java.util.Scanner;

import controller.GameController;
import entity.Cup;
import entity.FakeCup;
import entity.GameBoard;
import entity.Player;
import entity.testGameBoard;
//this class is used to store main, it uses the GameController to launch the game
public class Launch {

	public static void main(String[] args) {
		
		GameBoard gb = new GameBoard();
		FakeCup fc = new FakeCup();
		Scanner sc = new Scanner(System.in);
		testGameBoard tgb = new testGameBoard();
		int userInput;
		Player testPlayer = new Player("testPlayer");
		
		System.out.println("Welcome, press 1 for game, press 0 for test");
		userInput = sc.nextInt();
		
		if(userInput == 1){
			GameController gm = new GameController();
			gm.startGame();
			
		}
		
		else if (userInput == 0){
			
			for (int i = 0; i < 21; i++) {
				int[] values = fc.testDvalue();
				System.out.println("Dit kast: " + values[0] + " og " + values[1]);
				int sum = values[0] + values [1];
				tgb.landOnField(testPlayer, sum);
//				fc.throwDice();
//				int sum = fc.getSum();
				
//				tgb.landOnField(testPlayer, sum);
				
			}
			
		}
		
	}
}
