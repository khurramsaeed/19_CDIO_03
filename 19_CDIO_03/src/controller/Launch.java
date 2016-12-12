package controller;

import java.util.Arrays;

import controller.GameController;
import entity.Cup;
import entity.FakeCup;
import entity.GameBoard;
//this class is used to store main, it uses the GameController to launch the game
public class Launch {

	public static void main(String[] args) {
		
		GameBoard gb = new GameBoard();

		FakeCup fc = new FakeCup();
		
		int sum = 0;
		
		
		for (int i = 0; i < 1; i++) {
			int[] values = fc.testDvalue();
			System.out.println("Dit kast: " + values[0] + " og " + values[1]);
			sum = fc.getSum();
			System.out.println(gb.getFieldIndex(sum));
		}
		
//		GameController gm = new GameController();
//		gm.startGame();

	}
}
