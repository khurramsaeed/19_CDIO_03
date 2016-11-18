package controller;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Cup;
import entity.Dice;
import entity.GameBoard;
import entity.Player;
import entity.PlayerList;

public class Launch {

	public static void main(String[] args) {
		
		GameBoard gb = new GameBoard();
		GuiController gc = new GuiController();
		Player p = new Player("");
		PlayerList PL = new PlayerList();	
		
		gc.GUIField(gb.getFields(), PL);
		
		PL.addPlayer();
		

		while (true) {
			gc.GUIaddPlayer(PL, p);
			gc.GUIDice(PL);

		}

	}

}
