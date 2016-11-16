package controller;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Dice;
import entity.GameBoard;
import entity.Player;
import entity.PlayerList;


public class Launch {
	
	

	public static void main(String[] args) {
		
PlayerList PL = new PlayerList();
PL.addPlayer();
		
System.out.println(PL.PlayerListLength());
		
GameBoard gb = new GameBoard();
GuiController gc = new GuiController();
Player p = new Player("");

Dice d1 = new Dice();
Dice d2 = new Dice();

gc.GUIField(gb.getFields());

gc.GUIaddPlayer(PL, p);

gc.GUIDice(d1, d2);	
		
	}
	
	
}
