package entity;

import java.util.ArrayList;

import boundary.TUI;

public class PlayerList {
	
	ArrayList <Player> playerList = new ArrayList <Player> ();
	
	public void addPlayer() {
	int bruger = TUI.sc.nextInt();
			
		for (int i = 0; i < bruger; i++){
			System.out.println("\n"+"Type the name of Player "+(i+1));
			playerList.add(new Player(TUI.sc.next()));
			System.out.println("Player " + (i+1)+ " is ready");
			System.out.println("Your fortune contains "+ Player.getFortune(i));
		}
	}

	public Player getPlayer (int index){
		return playerList.get(index);
		
	}
}



