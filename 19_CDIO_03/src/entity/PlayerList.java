package entity;

import java.util.ArrayList;

import boundary.TUI;
import entity.Player;

public class PlayerList {

	ArrayList<Player> playerList = new ArrayList<Player>();

	public void addPlayer() {
		int bruger = TUI.sc.nextInt();
		for (int i = 0; i < bruger; i++) {
			playerList.add(new Player(TUI.sc.next()));
			System.out.println(getPlayer(i).getFortune());

		}
	}

	public Player getPlayer(int index) {
		return playerList.get(index);

	}
}
