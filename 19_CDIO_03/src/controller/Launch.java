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
		System.out.println("Hvor mange spiller ønsker at spille?");
		PlayerList PL = new PlayerList();

		PL.addPlayer();

		System.out.println(PL.PlayerListLength());

		GameBoard gb = new GameBoard();
		GuiController gc = new GuiController();
		Player p = new Player("");

		Cup c1 = new Cup();

		gc.GUIField(gb.getFields(), PL);

		while (true) {
			gc.GUIaddPlayer(PL, p);
			gc.GUIDice(PL, p);

		}

	}

}
