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
		while (true){ //husk at lave metode for når der er en vinder

		for (int i = 0; i < playerList.size(); i++){

			if (playerList.get(i).isBankrupt() == false) {
	
				GUI.getUserButtonPressed(playerList.get(i).getPlayerName() + "'s turn.", "Shake Dice Cup");
				cup.throwDice();
				GUI.setDice(cup.getD1Result(), cup.getD2Result());
			

				GUI.removeAllCars(playerList.get(i).getPlayerName());
				GUI.setCar(playerList.get(i).movePlayer(cup.getD1Result() + cup.getD2Result()), playerList.get(i).getPlayerName());
				gb.landOnField(cup.getSum(), playerList.get(i));
				if(playerList.get(i).isBankrupt()){
				GUI.removeAllCars(playerList.get(i).getPlayerName());}
			}
	}
			}
	}

}
