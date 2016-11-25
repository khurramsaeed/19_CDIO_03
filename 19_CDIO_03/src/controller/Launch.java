package controller;

import controller.GameController;
//this class is used to store main, it uses the GameController to launch the game
public class Launch {

	public static void main(String[] args) {

		GameController gm = new GameController();
		gm.startGame();

	}
}
