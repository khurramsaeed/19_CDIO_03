package controller;

import java.awt.Color;
import java.util.ArrayList;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Start.Builder;
import desktop_resources.GUI;
import desktop_fields.*;

import entity.*;

public class GameController {
	GameBoard gb = new GameBoard();

	Cup cup = new Cup();
	GuiController guiC = new GuiController();
	ArrayList<Player> playerList = new ArrayList<Player>();
	GuiController gc = new GuiController();
	int bankRuptPlayers;
	boolean noWinner;

	public GameController() {

	}

	public void startGame() {
		gc.GUIField(gb.getFields(), playerList);
		addPlayer();
		playRound();

	}

	public void addPlayer() {
		String chooseNumberOfPlayers = GUI.getUserButtonPressed("Chooce number of players", "2", "3", "4", "5", "6");
		int NumberOfPlayers = Integer.parseInt(chooseNumberOfPlayers);
		for (int i = 0; i < NumberOfPlayers; i++) {
			playerList.add(new Player(GUI.getUserString("Enter the name of Player " + (i + 1))));

			GUI.showMessage("Your fortune contains " + playerList.get(i).getFortune());
			Car[] cars = new Car[NumberOfPlayers];
			cars[i] = new Car.Builder().typeRacecar().primaryColor(guiC.chooseColor(i)).build();

			GUI.addPlayer(playerList.get(i).getPlayerName(), playerList.get(i).getFortune(), cars[i]);

		}
	}

	private void playRound() {
		
		while (noWinner = true) { 

			for (int i = 0; i < playerList.size(); i++) {

				if (playerList.get(i).isBankrupt() != true) {

					GUI.getUserButtonPressed(playerList.get(i).getPlayerName() + "'s turn.", "press to use the cup");
					cup.throwDice();
					int sum = cup.getSum();
					GUI.setDice(cup.getD1Result(), cup.getD2Result());

					GUI.removeAllCars(playerList.get(i).getPlayerName());
					GUI.setCar(playerList.get(i).movePlayer(cup.getD1Result() + cup.getD2Result()),
							playerList.get(i).getPlayerName());
					gb.landOnField(playerList, sum, i);
					GUI.setBalance(playerList.get(i).getPlayerName(), playerList.get(i).getFortune());
					System.out.println(playerList.get(i).getFortune());
					if (playerList.get(i).isBankrupt()) {
						bankRuptPlayers++;
						GUI.removeAllCars(playerList.get(i).getPlayerName());
					}

					if (bankRuptPlayers == playerList.size() - 1) {
					
						noWinner = false;
						checkForWinner();
						// Bug: vinderen slår en gang til efter han er blevet annonceret vinder: pga if-løkken i starten af for-løkken
						

					}

				}
			}

		}
	}

	private void checkForWinner() {
		for (int i = 0; i < playerList.size(); i++) {
			if (playerList.get(i).isBankrupt() == false) {
				GUI.showMessage("Everyone is bankrupt except you "+playerList.get(i) + ", you won the game! :D");
			}

		}

	}
}
