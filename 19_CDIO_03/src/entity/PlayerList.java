package entity;

import java.util.ArrayList;

import boundary.TUI;
import desktop_resources.GUI;
import entity.Player;
import controller.GuiController;

public class PlayerList {

	ArrayList<Player> playerList = new ArrayList<Player>();

	public void addPlayer() {
		int bruger = GUI.getUserInteger("How many players are playing?");
		for (int i = 0; i < bruger; i++) {
			playerList.add(new Player(GUI.getUserString("Enter name of players")));
			System.out.println(getPlayer(i).getFortune());

		}
	}

	public Player getPlayer(int index) {
		return playerList.get(index);

	}
	
	public <playerList>  int PlayerListLength (){
		return playerList.size();
		
		
	}
}
