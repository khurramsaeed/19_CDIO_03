package controller;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Cup;
import entity.Dice;
import entity.GameBoard;
import entity.Player;
import entity.PlayerList;
import controller.GameController;

public class Launch {

	public static void main(String[] args) {

		GameController gm = new GameController();
		gm.startGame();

	}
}
