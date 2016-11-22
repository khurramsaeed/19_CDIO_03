package entity;

import java.util.ArrayList;

import desktop_resources.GUI;
import entity.Player;
import controller.GuiController;

public class PlayerList {

	ArrayList<Player> playerList = new ArrayList<Player>();
	
public PlayerList(){
	
	
	
	}

	public void addPlayer(ArrayList<Player> playerList) {
		String choose = GUI.getUserButtonPressed("Chooce number of players","2","3","4","5","6");
		int bruger = Integer.parseInt(choose);
		for (int i = 0; i < bruger; i++) {
			playerList.add(new Player(GUI.getUserString("Enter the name of Player "+(i+1))));
			GUI.showMessage("Your fortune contains "+getPlayer(i).getFortune());
			
			}
	
		
	}

	public Player getPlayer(int index) {
		return playerList.get(index);

	}
	
	public <playerList>  int PlayerListLength (){
		return playerList.size();
		
		
	}
}
