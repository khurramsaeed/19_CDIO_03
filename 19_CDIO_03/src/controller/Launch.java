package controller;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import entity.Cup;
import entity.Dice;
import entity.GameBoard;
import entity.Player;
import entity.PlayerList;
import controller.GameController;

public class Launch {

	public static void main(String[] args) {
		
		
	
		GameController gm = new GameController();
		gm.startGame();
		
		
////		GameBoard gb = new GameBoard();
//		
//		Player p = new Player("");
//		PlayerList PL = new PlayerList();	
		
//		GuiController gc = new GuiController();
//		gc.GUIField(gb.getFields(), PL);
//		
//		PL.addPlayer();
//		
//
//		while (true) {
//			gc.GUIaddPlayer(PL, p);
//			gc.GUIDice(PL);
//
//		}
//
//	}

}}
