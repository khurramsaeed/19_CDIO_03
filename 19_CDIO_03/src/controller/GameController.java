package controller;

import java.util.ArrayList;
import boundary.GuiBoundary;
import desktop_codebehind.Car;
import desktop_resources.GUI;
import entity.*;

public class GameController {
	// Initializing class objects
	private GameBoard gb = new GameBoard();
	private Cup cup = new Cup();
	private ArrayList<Player> playerList = new ArrayList<Player>();
	private GuiBoundary GUIb = new GuiBoundary();
	// Initializing variables
	private int bankruptPlayers;// Int that counts number of bankruptPlayers
	private boolean noWinner; // boolean that sets the condition of no winner

	public GameController() {

	}

	// Method used to launch game in controller "Launch"
	public void startGame() {
		GUIb.GUIField(gb.getFields());
		addPlayer();
		playRound();

	}

	// Method that adds Objects of entity "Player" in to an ArrayList, through
	// GUI
	private void addPlayer() {
		String chooseNumberOfPlayers = GuiBoundary.numberOfPlayers();
		int NumberOfPlayers = Integer.parseInt(chooseNumberOfPlayers);
		for (int i = 0; i < NumberOfPlayers; i++) {
			playerList.add(new Player(GuiBoundary.userInputString(i)));
			GuiBoundary.showFortune(playerList.get(i).getFortune());

			// Allocates x number of cars in an array, shown in the GUI.
			Car[] cars = new Car[NumberOfPlayers];
			cars[i] = new Car.Builder().typeRacecar().primaryColor(GUIb.chooseColor(i)).build();
			GUI.addPlayer(playerList.get(i).getPlayerName(), playerList.get(i).getFortune(), cars[i]);

		}
	}

	// Method that defines a round of the game, for each player.
	// also while loop that goes on, until the condition noWinner equals false
	private void playRound() {
		while (noWinner = true) {

			for (int i = 0; i < playerList.size(); i++) {
				// if statement that checks that all players are bankrupt except one, and then runs method checkForWinner() (defined later on)
				// also it sets the condition for the while as false, to exit the loop.
				if (bankruptPlayers == playerList.size() - 1) {
					noWinner = false;
					checkForWinner();
				}
				// if statement that handles each players round, and
				if (playerList.get(i).isBankrupt() != true) {
					GuiBoundary.playerName(playerList.get(i).getPlayerName());
					cup.throwDice();
					int sum = cup.getSum();
					GUI.setDice(cup.getD1Result(), cup.getD2Result());
					// moves the player around the GUI board, as the player "moves" around the fields object
					GUI.removeAllCars(playerList.get(i).getPlayerName());
					GUI.setCar(playerList.get(i).movePlayer(sum), playerList.get(i).getPlayerName());
					gb.landOnField(playerList.get(i));
					GUI.setBalance(playerList.get(i).getPlayerName(), playerList.get(i).getFortune());
					System.out.println(playerList.get(i));

					// removes bankrupt players from the GUI, and adds 1 to the
					// globally defined int bankruptPlayers
					if (playerList.get(i).isBankrupt()) {
						bankruptPlayers++;
						GUI.removeAllCars(playerList.get(i).getPlayerName());
					}

				}

			}

		}

	}

	// Method used in playRound() to locate the final winner
	private void checkForWinner() {
		for (int i = 0; i < playerList.size(); i++) {
			if (playerList.get(i).isBankrupt() == false) {
				GuiBoundary.winnerMessage(playerList.get(i));
				GuiBoundary.exitGame(playerList.get(i));
				System.exit(0);
			}

		}

	}
	
}
