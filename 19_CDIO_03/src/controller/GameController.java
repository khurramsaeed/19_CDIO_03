package controller;

import java.awt.Color;
import java.util.ArrayList;

import boundary.GuiBoundary;
import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Start.Builder;
import desktop_resources.GUI;
import desktop_fields.*;

import entity.*;

public class GameController {
	private GameBoard gb = new GameBoard();

	private Cup cup = new Cup();
	private GuiController guiC = new GuiController();
	private GuiBoundary guiB = new GuiBoundary();
	private ArrayList<Player> playerList = new ArrayList<Player>();
	private GuiController gc = new GuiController();
	private int bankRuptPlayers;
	private boolean noWinner;

	public GameController() {

	}

	public void startGame() {
		gc.GUIField(gb.getFields());
		addPlayer();
		playRound();

	}

	private void addPlayer() {
		String chooseNumberOfPlayers = guiB.numberOfPlayers();
		int NumberOfPlayers = Integer.parseInt(chooseNumberOfPlayers);
		for (int i = 0; i < NumberOfPlayers; i++) {
			playerList.add(new Player(guiB.userInputString(i)));

			guiB.showFortune(playerList.get(i).getFortune());
			Car[] cars = new Car[NumberOfPlayers];
			cars[i] = new Car.Builder().typeRacecar().primaryColor(guiC.chooseColor(i)).build();

			GUI.addPlayer(playerList.get(i).getPlayerName(), playerList.get(i).getFortune(), cars[i]);

		}
	}

	
	private void playRound() {

		while (noWinner = true) {

			for (int i = 0; i < playerList.size(); i++) {

				if (bankRuptPlayers == playerList.size() - 1) {
					noWinner = false;
					checkForWinner();
					// Bug: vinderen slår en gang til efter han er blevet
					// annonceret vinder: pga if-løkken i starten af for-løkken
				}

				if (playerList.get(i).isBankrupt() != true) {
					guiB.playerName(playerList.get(i).getPlayerName());
					cup.throwDice();
					int sum = cup.getSum();
					GUI.setDice(cup.getD1Result(), cup.getD2Result());

					GUI.removeAllCars(playerList.get(i).getPlayerName());
					GUI.setCar(playerList.get(i).movePlayer(sum), playerList.get(i).getPlayerName());
					gb.landOnField(playerList.get(i));
					GUI.setBalance(playerList.get(i).getPlayerName(), playerList.get(i).getFortune());
					System.out.println(playerList.get(i));
					if (playerList.get(i).isBankrupt()) {
						bankRuptPlayers++;
						GUI.removeAllCars(playerList.get(i).getPlayerName());
					}
					
				}
				
			}
			
		}
		
	}

	private void checkForWinner() {
		for (int i = 0; i < playerList.size(); i++) {
			if (playerList.get(i).isBankrupt() == false) {
				guiB.winnerMessage(playerList.get(i));
				guiB.exitGame(playerList.get(i));
				System.exit(0);
			}

		}

	}
}
